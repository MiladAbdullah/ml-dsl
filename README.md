# ML-DSL: Domain-Specific Language for Machine Learning (ExtremeXP Summer School)

Welcome to ML-DSL, a domain-specific language and VS Code extension for describing machine learning workflows, developed for the Summer School of ExtremeXP.

## Project Structure

- **DSL Core**: Xtext-based language for ML workflows (see `eu.extremexp.ssfhai.dsl.parent`)
- **VS Code Extension**: Syntax highlighting, language support, and integration (see `vs-code/`)
- **Examples**: Example DSL files in `eu.extremexp.ssfhai.dsl.examples/test-dsl/`

## Quick Start

### 1. Run the Language Server (JAR)

Open a terminal and run the language server JAR (replace the version if needed):

```sh
java -jar eu.extremexp.ssfhai.dsl.ide-1.0.0-SNAPSHOT-ls.jar
```

### 2. Launch the VS Code Extension (Development Mode)

Open a new terminal, then:

```sh
cd vs-code
npm install
code .
```

Press `F5` in VS Code to launch the extension in a new Extension Development Host window.

### 3. (Alternative) Install the VSIX Extension

You can also install the pre-built extension:

```sh
code --install-extension mldsl-language-0.0.1.vsix
```

## Example DSL File

See `eu.extremexp.ssfhai.dsl.examples/test-dsl/my-app.mldsl` for a sample ML-DSL program.

## About

This project is a teaching and demonstration tool for the Summer School of ExtremeXP, showcasing how to build a DSL and integrate it with modern editors.

---
For questions or contributions, please contact the ExtremeXP team.