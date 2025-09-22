'use strict';
Object.defineProperty(exports, "__esModule", { value: true });
exports.activate = activate;
exports.deactivate = deactivate;
const net = require("net");
const vscode_1 = require("vscode");
const node_1 = require("vscode-languageclient/node");
let lc;
function activate(context) {
    // The server is a started as a separate app and listens on port 5007
    let connectionInfo = {
        host: process.env.LANG_SERVER_HOST || "0.0.0.0",
        port: parseInt(process.env.LANG_SERVER_PORT || "5007", 10)
    };
    let serverOptions = () => {
        // Connect to language server via socket
        let socket = net.connect(connectionInfo);
        let result = {
            writer: socket,
            reader: socket
        };
        return Promise.resolve(result);
    };
    let clientOptions = {
        documentSelector: ['mldsl'],
        synchronize: {
            fileEvents: vscode_1.workspace.createFileSystemWatcher('**/*.mldsl')
        }
    };
    // Create the language client and start the client.
    lc = new node_1.LanguageClient('Xtext Server', serverOptions, clientOptions);
    lc.start();
}
function deactivate() {
    return lc.stop();
}
