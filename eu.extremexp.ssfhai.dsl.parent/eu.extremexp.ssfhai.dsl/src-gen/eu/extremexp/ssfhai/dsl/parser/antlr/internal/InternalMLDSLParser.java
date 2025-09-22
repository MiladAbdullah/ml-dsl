package eu.extremexp.ssfhai.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.extremexp.ssfhai.dsl.services.MLDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMLDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "';'", "'workflow'", "'{'", "'}'", "'data'", "'path'", "'features'", "'target'", "'task'", "'param'", "'='", "'->'", "'network'", "'layer'", "'('", "','", "')'", "'.'", "'type'", "'inputSize'", "'outputSize'", "'droputRate'", "'Input'", "'Linear'", "'Sigmoid'", "'BN'", "'DropOut'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMLDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMLDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMLDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMLDSL.g"; }



     	private MLDSLGrammarAccess grammarAccess;

        public InternalMLDSLParser(TokenStream input, MLDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MLDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMLDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMLDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMLDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMLDSL.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'app' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_workflows_3_0= ruleWorkflow ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_workflows_3_0 = null;



        	enterRule();

        try {
            // InternalMLDSL.g:78:2: ( (otherlv_0= 'app' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_workflows_3_0= ruleWorkflow ) )* ) )
            // InternalMLDSL.g:79:2: (otherlv_0= 'app' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_workflows_3_0= ruleWorkflow ) )* )
            {
            // InternalMLDSL.g:79:2: (otherlv_0= 'app' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_workflows_3_0= ruleWorkflow ) )* )
            // InternalMLDSL.g:80:3: otherlv_0= 'app' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_workflows_3_0= ruleWorkflow ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getAppKeyword_0());
            		
            // InternalMLDSL.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMLDSL.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMLDSL.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMLDSL.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getSemicolonKeyword_2());
            		
            // InternalMLDSL.g:106:3: ( (lv_workflows_3_0= ruleWorkflow ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMLDSL.g:107:4: (lv_workflows_3_0= ruleWorkflow )
            	    {
            	    // InternalMLDSL.g:107:4: (lv_workflows_3_0= ruleWorkflow )
            	    // InternalMLDSL.g:108:5: lv_workflows_3_0= ruleWorkflow
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getWorkflowsWorkflowParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_workflows_3_0=ruleWorkflow();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"workflows",
            	    						lv_workflows_3_0,
            	    						"eu.extremexp.ssfhai.dsl.MLDSL.Workflow");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleWorkflow"
    // InternalMLDSL.g:129:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalMLDSL.g:129:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalMLDSL.g:130:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;

             current =iv_ruleWorkflow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalMLDSL.g:136:1: ruleWorkflow returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_tasks_3_0= ruleTask ) ) | ( (lv_flows_4_0= ruleFlow ) ) | ( (lv_data_5_0= ruleData ) ) | ( (lv_networks_6_0= ruleNetwork ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_tasks_3_0 = null;

        EObject lv_flows_4_0 = null;

        EObject lv_data_5_0 = null;

        EObject lv_networks_6_0 = null;



        	enterRule();

        try {
            // InternalMLDSL.g:142:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_tasks_3_0= ruleTask ) ) | ( (lv_flows_4_0= ruleFlow ) ) | ( (lv_data_5_0= ruleData ) ) | ( (lv_networks_6_0= ruleNetwork ) ) )* otherlv_7= '}' ) )
            // InternalMLDSL.g:143:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_tasks_3_0= ruleTask ) ) | ( (lv_flows_4_0= ruleFlow ) ) | ( (lv_data_5_0= ruleData ) ) | ( (lv_networks_6_0= ruleNetwork ) ) )* otherlv_7= '}' )
            {
            // InternalMLDSL.g:143:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_tasks_3_0= ruleTask ) ) | ( (lv_flows_4_0= ruleFlow ) ) | ( (lv_data_5_0= ruleData ) ) | ( (lv_networks_6_0= ruleNetwork ) ) )* otherlv_7= '}' )
            // InternalMLDSL.g:144:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_tasks_3_0= ruleTask ) ) | ( (lv_flows_4_0= ruleFlow ) ) | ( (lv_data_5_0= ruleData ) ) | ( (lv_networks_6_0= ruleNetwork ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalMLDSL.g:148:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMLDSL.g:149:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMLDSL.g:149:4: (lv_name_1_0= RULE_ID )
            // InternalMLDSL.g:150:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkflowAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkflowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMLDSL.g:170:3: ( ( (lv_tasks_3_0= ruleTask ) ) | ( (lv_flows_4_0= ruleFlow ) ) | ( (lv_data_5_0= ruleData ) ) | ( (lv_networks_6_0= ruleNetwork ) ) )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 20:
                    {
                    alt2=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt2=2;
                    }
                    break;
                case 16:
                case 18:
                case 19:
                    {
                    alt2=3;
                    }
                    break;
                case 24:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalMLDSL.g:171:4: ( (lv_tasks_3_0= ruleTask ) )
            	    {
            	    // InternalMLDSL.g:171:4: ( (lv_tasks_3_0= ruleTask ) )
            	    // InternalMLDSL.g:172:5: (lv_tasks_3_0= ruleTask )
            	    {
            	    // InternalMLDSL.g:172:5: (lv_tasks_3_0= ruleTask )
            	    // InternalMLDSL.g:173:6: lv_tasks_3_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getWorkflowAccess().getTasksTaskParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_tasks_3_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasks",
            	    							lv_tasks_3_0,
            	    							"eu.extremexp.ssfhai.dsl.MLDSL.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMLDSL.g:191:4: ( (lv_flows_4_0= ruleFlow ) )
            	    {
            	    // InternalMLDSL.g:191:4: ( (lv_flows_4_0= ruleFlow ) )
            	    // InternalMLDSL.g:192:5: (lv_flows_4_0= ruleFlow )
            	    {
            	    // InternalMLDSL.g:192:5: (lv_flows_4_0= ruleFlow )
            	    // InternalMLDSL.g:193:6: lv_flows_4_0= ruleFlow
            	    {

            	    						newCompositeNode(grammarAccess.getWorkflowAccess().getFlowsFlowParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_flows_4_0=ruleFlow();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"flows",
            	    							lv_flows_4_0,
            	    							"eu.extremexp.ssfhai.dsl.MLDSL.Flow");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMLDSL.g:211:4: ( (lv_data_5_0= ruleData ) )
            	    {
            	    // InternalMLDSL.g:211:4: ( (lv_data_5_0= ruleData ) )
            	    // InternalMLDSL.g:212:5: (lv_data_5_0= ruleData )
            	    {
            	    // InternalMLDSL.g:212:5: (lv_data_5_0= ruleData )
            	    // InternalMLDSL.g:213:6: lv_data_5_0= ruleData
            	    {

            	    						newCompositeNode(grammarAccess.getWorkflowAccess().getDataDataParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_data_5_0=ruleData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"data",
            	    							lv_data_5_0,
            	    							"eu.extremexp.ssfhai.dsl.MLDSL.Data");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMLDSL.g:231:4: ( (lv_networks_6_0= ruleNetwork ) )
            	    {
            	    // InternalMLDSL.g:231:4: ( (lv_networks_6_0= ruleNetwork ) )
            	    // InternalMLDSL.g:232:5: (lv_networks_6_0= ruleNetwork )
            	    {
            	    // InternalMLDSL.g:232:5: (lv_networks_6_0= ruleNetwork )
            	    // InternalMLDSL.g:233:6: lv_networks_6_0= ruleNetwork
            	    {

            	    						newCompositeNode(grammarAccess.getWorkflowAccess().getNetworksNetworkParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_networks_6_0=ruleNetwork();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"networks",
            	    							lv_networks_6_0,
            	    							"eu.extremexp.ssfhai.dsl.MLDSL.Network");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleData"
    // InternalMLDSL.g:259:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalMLDSL.g:259:45: (iv_ruleData= ruleData EOF )
            // InternalMLDSL.g:260:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalMLDSL.g:266:1: ruleData returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_features_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_target_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalMLDSL.g:272:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalMLDSL.g:273:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalMLDSL.g:273:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) ) )+ {...}?) ) )
            // InternalMLDSL.g:274:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalMLDSL.g:274:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) ) )+ {...}?) )
            // InternalMLDSL.g:275:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getDataAccess().getUnorderedGroup());
            			
            // InternalMLDSL.g:278:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) ) )+ {...}?)
            // InternalMLDSL.g:279:5: ( ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) ) )+ {...}?
            {
            // InternalMLDSL.g:279:5: ( ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    int LA3_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup(), 0) ) {
                        alt3=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA3_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup(), 1) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA3_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup(), 2) ) {
                        alt3=3;
                    }


                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalMLDSL.g:280:3: ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalMLDSL.g:280:3: ({...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) ) )
            	    // InternalMLDSL.g:281:4: {...}? => ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMLDSL.g:281:98: ( ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) ) )
            	    // InternalMLDSL.g:282:5: ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMLDSL.g:285:8: ({...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) )
            	    // InternalMLDSL.g:285:9: {...}? => (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleData", "true");
            	    }
            	    // InternalMLDSL.g:285:18: (otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' )
            	    // InternalMLDSL.g:285:19: otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';'
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getDataAccess().getDataKeyword_0_0());
            	    							
            	    // InternalMLDSL.g:289:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalMLDSL.g:290:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalMLDSL.g:290:9: (lv_name_2_0= RULE_ID )
            	    // InternalMLDSL.g:291:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getDataAccess().getNameIDTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDataRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,14,FOLLOW_8); 

            	    								newLeafNode(otherlv_3, grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    otherlv_4=(Token)match(input,17,FOLLOW_9); 

            	    								newLeafNode(otherlv_4, grammarAccess.getDataAccess().getPathKeyword_0_3());
            	    							
            	    // InternalMLDSL.g:315:8: ( (lv_path_5_0= RULE_STRING ) )
            	    // InternalMLDSL.g:316:9: (lv_path_5_0= RULE_STRING )
            	    {
            	    // InternalMLDSL.g:316:9: (lv_path_5_0= RULE_STRING )
            	    // InternalMLDSL.g:317:10: lv_path_5_0= RULE_STRING
            	    {
            	    lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    										newLeafNode(lv_path_5_0, grammarAccess.getDataAccess().getPathSTRINGTerminalRuleCall_0_4_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDataRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"path",
            	    											lv_path_5_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_6=(Token)match(input,12,FOLLOW_10); 

            	    								newLeafNode(otherlv_6, grammarAccess.getDataAccess().getSemicolonKeyword_0_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMLDSL.g:343:3: ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) )
            	    {
            	    // InternalMLDSL.g:343:3: ({...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) ) )
            	    // InternalMLDSL.g:344:4: {...}? => ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMLDSL.g:344:98: ( ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) ) )
            	    // InternalMLDSL.g:345:5: ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMLDSL.g:348:8: ({...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' ) )
            	    // InternalMLDSL.g:348:9: {...}? => (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleData", "true");
            	    }
            	    // InternalMLDSL.g:348:18: (otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    // InternalMLDSL.g:348:19: otherlv_7= 'features' ( (lv_features_8_0= RULE_STRING ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_9); 

            	    								newLeafNode(otherlv_7, grammarAccess.getDataAccess().getFeaturesKeyword_1_0());
            	    							
            	    // InternalMLDSL.g:352:8: ( (lv_features_8_0= RULE_STRING ) )
            	    // InternalMLDSL.g:353:9: (lv_features_8_0= RULE_STRING )
            	    {
            	    // InternalMLDSL.g:353:9: (lv_features_8_0= RULE_STRING )
            	    // InternalMLDSL.g:354:10: lv_features_8_0= RULE_STRING
            	    {
            	    lv_features_8_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    										newLeafNode(lv_features_8_0, grammarAccess.getDataAccess().getFeaturesSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDataRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"features",
            	    											lv_features_8_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_9=(Token)match(input,12,FOLLOW_10); 

            	    								newLeafNode(otherlv_9, grammarAccess.getDataAccess().getSemicolonKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMLDSL.g:380:3: ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) )
            	    {
            	    // InternalMLDSL.g:380:3: ({...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) ) )
            	    // InternalMLDSL.g:381:4: {...}? => ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalMLDSL.g:381:98: ( ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ) )
            	    // InternalMLDSL.g:382:5: ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getDataAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalMLDSL.g:385:8: ({...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) )
            	    // InternalMLDSL.g:385:9: {...}? => (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleData", "true");
            	    }
            	    // InternalMLDSL.g:385:18: (otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' )
            	    // InternalMLDSL.g:385:19: otherlv_10= 'target' ( (lv_target_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}'
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_9); 

            	    								newLeafNode(otherlv_10, grammarAccess.getDataAccess().getTargetKeyword_2_0());
            	    							
            	    // InternalMLDSL.g:389:8: ( (lv_target_11_0= RULE_STRING ) )
            	    // InternalMLDSL.g:390:9: (lv_target_11_0= RULE_STRING )
            	    {
            	    // InternalMLDSL.g:390:9: (lv_target_11_0= RULE_STRING )
            	    // InternalMLDSL.g:391:10: lv_target_11_0= RULE_STRING
            	    {
            	    lv_target_11_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    										newLeafNode(lv_target_11_0, grammarAccess.getDataAccess().getTargetSTRINGTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getDataRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"target",
            	    											lv_target_11_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_12=(Token)match(input,12,FOLLOW_11); 

            	    								newLeafNode(otherlv_12, grammarAccess.getDataAccess().getSemicolonKeyword_2_2());
            	    							
            	    otherlv_13=(Token)match(input,15,FOLLOW_10); 

            	    								newLeafNode(otherlv_13, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDataAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleData", "getUnorderedGroupHelper().canLeave(grammarAccess.getDataAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getDataAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleTask"
    // InternalMLDSL.g:432:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalMLDSL.g:432:45: (iv_ruleTask= ruleTask EOF )
            // InternalMLDSL.g:433:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalMLDSL.g:439:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_params_3_0= ruleParam ) )* otherlv_4= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalMLDSL.g:445:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_params_3_0= ruleParam ) )* otherlv_4= '}' ) )
            // InternalMLDSL.g:446:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_params_3_0= ruleParam ) )* otherlv_4= '}' )
            {
            // InternalMLDSL.g:446:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_params_3_0= ruleParam ) )* otherlv_4= '}' )
            // InternalMLDSL.g:447:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_params_3_0= ruleParam ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalMLDSL.g:451:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMLDSL.g:452:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMLDSL.g:452:4: (lv_name_1_0= RULE_ID )
            // InternalMLDSL.g:453:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMLDSL.g:473:3: ( (lv_params_3_0= ruleParam ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMLDSL.g:474:4: (lv_params_3_0= ruleParam )
            	    {
            	    // InternalMLDSL.g:474:4: (lv_params_3_0= ruleParam )
            	    // InternalMLDSL.g:475:5: lv_params_3_0= ruleParam
            	    {

            	    					newCompositeNode(grammarAccess.getTaskAccess().getParamsParamParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_params_3_0=ruleParam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_3_0,
            	    						"eu.extremexp.ssfhai.dsl.MLDSL.Param");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleParam"
    // InternalMLDSL.g:500:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalMLDSL.g:500:46: (iv_ruleParam= ruleParam EOF )
            // InternalMLDSL.g:501:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalMLDSL.g:507:1: ruleParam returns [EObject current=null] : ( (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_paramValue_3_0= ruleParamValue ) ) otherlv_4= ';' ) | (otherlv_5= 'param' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_paramValue_3_0 = null;



        	enterRule();

        try {
            // InternalMLDSL.g:513:2: ( ( (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_paramValue_3_0= ruleParamValue ) ) otherlv_4= ';' ) | (otherlv_5= 'param' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' ) ) )
            // InternalMLDSL.g:514:2: ( (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_paramValue_3_0= ruleParamValue ) ) otherlv_4= ';' ) | (otherlv_5= 'param' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' ) )
            {
            // InternalMLDSL.g:514:2: ( (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_paramValue_3_0= ruleParamValue ) ) otherlv_4= ';' ) | (otherlv_5= 'param' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==22) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==RULE_ID) ) {
                            alt5=2;
                        }
                        else if ( ((LA5_3>=RULE_STRING && LA5_3<=RULE_INT)) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMLDSL.g:515:3: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_paramValue_3_0= ruleParamValue ) ) otherlv_4= ';' )
                    {
                    // InternalMLDSL.g:515:3: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_paramValue_3_0= ruleParamValue ) ) otherlv_4= ';' )
                    // InternalMLDSL.g:516:4: otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_paramValue_3_0= ruleParamValue ) ) otherlv_4= ';'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getParamAccess().getParamKeyword_0_0());
                    			
                    // InternalMLDSL.g:520:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalMLDSL.g:521:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalMLDSL.g:521:5: (lv_name_1_0= RULE_ID )
                    // InternalMLDSL.g:522:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getParamAccess().getEqualsSignKeyword_0_2());
                    			
                    // InternalMLDSL.g:542:4: ( (lv_paramValue_3_0= ruleParamValue ) )
                    // InternalMLDSL.g:543:5: (lv_paramValue_3_0= ruleParamValue )
                    {
                    // InternalMLDSL.g:543:5: (lv_paramValue_3_0= ruleParamValue )
                    // InternalMLDSL.g:544:6: lv_paramValue_3_0= ruleParamValue
                    {

                    						newCompositeNode(grammarAccess.getParamAccess().getParamValueParamValueParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_paramValue_3_0=ruleParamValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParamRule());
                    						}
                    						set(
                    							current,
                    							"paramValue",
                    							lv_paramValue_3_0,
                    							"eu.extremexp.ssfhai.dsl.MLDSL.ParamValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getParamAccess().getSemicolonKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMLDSL.g:567:3: (otherlv_5= 'param' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' )
                    {
                    // InternalMLDSL.g:567:3: (otherlv_5= 'param' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';' )
                    // InternalMLDSL.g:568:4: otherlv_5= 'param' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= '=' ( (otherlv_8= RULE_ID ) ) otherlv_9= ';'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getParamAccess().getParamKeyword_1_0());
                    			
                    // InternalMLDSL.g:572:4: ( (lv_name_6_0= RULE_ID ) )
                    // InternalMLDSL.g:573:5: (lv_name_6_0= RULE_ID )
                    {
                    // InternalMLDSL.g:573:5: (lv_name_6_0= RULE_ID )
                    // InternalMLDSL.g:574:6: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_name_6_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_6_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getParamAccess().getEqualsSignKeyword_1_2());
                    			
                    // InternalMLDSL.g:594:4: ( (otherlv_8= RULE_ID ) )
                    // InternalMLDSL.g:595:5: (otherlv_8= RULE_ID )
                    {
                    // InternalMLDSL.g:595:5: (otherlv_8= RULE_ID )
                    // InternalMLDSL.g:596:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(otherlv_8, grammarAccess.getParamAccess().getEntityValueWorkflowEntintyCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,12,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getParamAccess().getSemicolonKeyword_1_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleFlow"
    // InternalMLDSL.g:616:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // InternalMLDSL.g:616:45: (iv_ruleFlow= ruleFlow EOF )
            // InternalMLDSL.g:617:2: iv_ruleFlow= ruleFlow EOF
            {
             newCompositeNode(grammarAccess.getFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlow=ruleFlow();

            state._fsp--;

             current =iv_ruleFlow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlow"


    // $ANTLR start "ruleFlow"
    // InternalMLDSL.g:623:1: ruleFlow returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= ';' ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMLDSL.g:629:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= ';' ) )
            // InternalMLDSL.g:630:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= ';' )
            {
            // InternalMLDSL.g:630:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= ';' )
            // InternalMLDSL.g:631:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= ';'
            {
            // InternalMLDSL.g:631:3: ( (otherlv_0= RULE_ID ) )
            // InternalMLDSL.g:632:4: (otherlv_0= RULE_ID )
            {
            // InternalMLDSL.g:632:4: (otherlv_0= RULE_ID )
            // InternalMLDSL.g:633:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFlowRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getFlowAccess().getSequenceStartTaskCrossReference_0_0());
            				

            }


            }

            // InternalMLDSL.g:644:3: (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMLDSL.g:645:4: otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getFlowAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
            	    			
            	    // InternalMLDSL.g:649:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalMLDSL.g:650:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMLDSL.g:650:5: (otherlv_2= RULE_ID )
            	    // InternalMLDSL.g:651:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFlowRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_2, grammarAccess.getFlowAccess().getSequenceTaskCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFlowAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlow"


    // $ANTLR start "entryRuleNetwork"
    // InternalMLDSL.g:671:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalMLDSL.g:671:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalMLDSL.g:672:2: iv_ruleNetwork= ruleNetwork EOF
            {
             newCompositeNode(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;

             current =iv_ruleNetwork; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalMLDSL.g:678:1: ruleNetwork returns [EObject current=null] : (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_layers_3_0= ruleLayer ) ) | ( (lv_forwards_4_0= ruleForward ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_layers_3_0 = null;

        EObject lv_forwards_4_0 = null;



        	enterRule();

        try {
            // InternalMLDSL.g:684:2: ( (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_layers_3_0= ruleLayer ) ) | ( (lv_forwards_4_0= ruleForward ) ) )* otherlv_5= '}' ) )
            // InternalMLDSL.g:685:2: (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_layers_3_0= ruleLayer ) ) | ( (lv_forwards_4_0= ruleForward ) ) )* otherlv_5= '}' )
            {
            // InternalMLDSL.g:685:2: (otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_layers_3_0= ruleLayer ) ) | ( (lv_forwards_4_0= ruleForward ) ) )* otherlv_5= '}' )
            // InternalMLDSL.g:686:3: otherlv_0= 'network' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_layers_3_0= ruleLayer ) ) | ( (lv_forwards_4_0= ruleForward ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getNetworkKeyword_0());
            		
            // InternalMLDSL.g:690:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMLDSL.g:691:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMLDSL.g:691:4: (lv_name_1_0= RULE_ID )
            // InternalMLDSL.g:692:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNetworkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNetworkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMLDSL.g:712:3: ( ( (lv_layers_3_0= ruleLayer ) ) | ( (lv_forwards_4_0= ruleForward ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }
                else if ( (LA7_0==RULE_ID) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMLDSL.g:713:4: ( (lv_layers_3_0= ruleLayer ) )
            	    {
            	    // InternalMLDSL.g:713:4: ( (lv_layers_3_0= ruleLayer ) )
            	    // InternalMLDSL.g:714:5: (lv_layers_3_0= ruleLayer )
            	    {
            	    // InternalMLDSL.g:714:5: (lv_layers_3_0= ruleLayer )
            	    // InternalMLDSL.g:715:6: lv_layers_3_0= ruleLayer
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkAccess().getLayersLayerParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_layers_3_0=ruleLayer();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"layers",
            	    							lv_layers_3_0,
            	    							"eu.extremexp.ssfhai.dsl.MLDSL.Layer");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMLDSL.g:733:4: ( (lv_forwards_4_0= ruleForward ) )
            	    {
            	    // InternalMLDSL.g:733:4: ( (lv_forwards_4_0= ruleForward ) )
            	    // InternalMLDSL.g:734:5: (lv_forwards_4_0= ruleForward )
            	    {
            	    // InternalMLDSL.g:734:5: (lv_forwards_4_0= ruleForward )
            	    // InternalMLDSL.g:735:6: lv_forwards_4_0= ruleForward
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkAccess().getForwardsForwardParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_forwards_4_0=ruleForward();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"forwards",
            	    							lv_forwards_4_0,
            	    							"eu.extremexp.ssfhai.dsl.MLDSL.Forward");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleLayer"
    // InternalMLDSL.g:761:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalMLDSL.g:761:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalMLDSL.g:762:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalMLDSL.g:768:1: ruleLayer returns [EObject current=null] : (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_options_3_0= ruleOption ) ) (otherlv_4= ',' ( (lv_options_5_0= ruleOption ) ) )* otherlv_6= ')' )? otherlv_7= ';' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_options_3_0 = null;

        EObject lv_options_5_0 = null;



        	enterRule();

        try {
            // InternalMLDSL.g:774:2: ( (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_options_3_0= ruleOption ) ) (otherlv_4= ',' ( (lv_options_5_0= ruleOption ) ) )* otherlv_6= ')' )? otherlv_7= ';' ) )
            // InternalMLDSL.g:775:2: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_options_3_0= ruleOption ) ) (otherlv_4= ',' ( (lv_options_5_0= ruleOption ) ) )* otherlv_6= ')' )? otherlv_7= ';' )
            {
            // InternalMLDSL.g:775:2: (otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_options_3_0= ruleOption ) ) (otherlv_4= ',' ( (lv_options_5_0= ruleOption ) ) )* otherlv_6= ')' )? otherlv_7= ';' )
            // InternalMLDSL.g:776:3: otherlv_0= 'layer' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_options_3_0= ruleOption ) ) (otherlv_4= ',' ( (lv_options_5_0= ruleOption ) ) )* otherlv_6= ')' )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getLayerKeyword_0());
            		
            // InternalMLDSL.g:780:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMLDSL.g:781:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMLDSL.g:781:4: (lv_name_1_0= RULE_ID )
            // InternalMLDSL.g:782:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLayerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLayerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMLDSL.g:798:3: (otherlv_2= '(' ( (lv_options_3_0= ruleOption ) ) (otherlv_4= ',' ( (lv_options_5_0= ruleOption ) ) )* otherlv_6= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMLDSL.g:799:4: otherlv_2= '(' ( (lv_options_3_0= ruleOption ) ) (otherlv_4= ',' ( (lv_options_5_0= ruleOption ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getLayerAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMLDSL.g:803:4: ( (lv_options_3_0= ruleOption ) )
                    // InternalMLDSL.g:804:5: (lv_options_3_0= ruleOption )
                    {
                    // InternalMLDSL.g:804:5: (lv_options_3_0= ruleOption )
                    // InternalMLDSL.g:805:6: lv_options_3_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getLayerAccess().getOptionsOptionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_options_3_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLayerRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_3_0,
                    							"eu.extremexp.ssfhai.dsl.MLDSL.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMLDSL.g:822:4: (otherlv_4= ',' ( (lv_options_5_0= ruleOption ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==27) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMLDSL.g:823:5: otherlv_4= ',' ( (lv_options_5_0= ruleOption ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FOLLOW_19); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getLayerAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMLDSL.g:827:5: ( (lv_options_5_0= ruleOption ) )
                    	    // InternalMLDSL.g:828:6: (lv_options_5_0= ruleOption )
                    	    {
                    	    // InternalMLDSL.g:828:6: (lv_options_5_0= ruleOption )
                    	    // InternalMLDSL.g:829:7: lv_options_5_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getLayerAccess().getOptionsOptionParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_options_5_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLayerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_5_0,
                    	    								"eu.extremexp.ssfhai.dsl.MLDSL.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getLayerAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLayerAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleForward"
    // InternalMLDSL.g:860:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalMLDSL.g:860:48: (iv_ruleForward= ruleForward EOF )
            // InternalMLDSL.g:861:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalMLDSL.g:867:1: ruleForward returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= ';' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMLDSL.g:873:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= ';' ) )
            // InternalMLDSL.g:874:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= ';' )
            {
            // InternalMLDSL.g:874:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= ';' )
            // InternalMLDSL.g:875:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+ otherlv_3= ';'
            {
            // InternalMLDSL.g:875:3: ( (otherlv_0= RULE_ID ) )
            // InternalMLDSL.g:876:4: (otherlv_0= RULE_ID )
            {
            // InternalMLDSL.g:876:4: (otherlv_0= RULE_ID )
            // InternalMLDSL.g:877:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForwardRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getSequenceStartLayerCrossReference_0_0());
            				

            }


            }

            // InternalMLDSL.g:888:3: (otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMLDSL.g:889:4: otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
            	    			
            	    // InternalMLDSL.g:893:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalMLDSL.g:894:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalMLDSL.g:894:5: (otherlv_2= RULE_ID )
            	    // InternalMLDSL.g:895:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getForwardRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    						newLeafNode(otherlv_2, grammarAccess.getForwardAccess().getSequenceLayerCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getForwardAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleFLOAT"
    // InternalMLDSL.g:915:1: entryRuleFLOAT returns [EObject current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final EObject entryRuleFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFLOAT = null;


        try {
            // InternalMLDSL.g:915:46: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalMLDSL.g:916:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalMLDSL.g:922:1: ruleFLOAT returns [EObject current=null] : ( ( (lv_dec_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_per_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFLOAT() throws RecognitionException {
        EObject current = null;

        Token lv_dec_0_0=null;
        Token otherlv_1=null;
        Token lv_per_2_0=null;


        	enterRule();

        try {
            // InternalMLDSL.g:928:2: ( ( ( (lv_dec_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_per_2_0= RULE_INT ) ) ) )
            // InternalMLDSL.g:929:2: ( ( (lv_dec_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_per_2_0= RULE_INT ) ) )
            {
            // InternalMLDSL.g:929:2: ( ( (lv_dec_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_per_2_0= RULE_INT ) ) )
            // InternalMLDSL.g:930:3: ( (lv_dec_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_per_2_0= RULE_INT ) )
            {
            // InternalMLDSL.g:930:3: ( (lv_dec_0_0= RULE_INT ) )
            // InternalMLDSL.g:931:4: (lv_dec_0_0= RULE_INT )
            {
            // InternalMLDSL.g:931:4: (lv_dec_0_0= RULE_INT )
            // InternalMLDSL.g:932:5: lv_dec_0_0= RULE_INT
            {
            lv_dec_0_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_dec_0_0, grammarAccess.getFLOATAccess().getDecINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFLOATRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dec",
            						lv_dec_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            // InternalMLDSL.g:952:3: ( (lv_per_2_0= RULE_INT ) )
            // InternalMLDSL.g:953:4: (lv_per_2_0= RULE_INT )
            {
            // InternalMLDSL.g:953:4: (lv_per_2_0= RULE_INT )
            // InternalMLDSL.g:954:5: lv_per_2_0= RULE_INT
            {
            lv_per_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_per_2_0, grammarAccess.getFLOATAccess().getPerINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFLOATRule());
            					}
            					setWithLastConsumed(
            						current,
            						"per",
            						lv_per_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"


    // $ANTLR start "entryRuleOption"
    // InternalMLDSL.g:974:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalMLDSL.g:974:47: (iv_ruleOption= ruleOption EOF )
            // InternalMLDSL.g:975:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalMLDSL.g:981:1: ruleOption returns [EObject current=null] : ( (otherlv_0= 'type' otherlv_1= '=' ( (lv_type_2_0= ruleLayerType ) ) ) | (otherlv_3= 'inputSize' otherlv_4= '=' ( (lv_inputSize_5_0= RULE_INT ) ) ) | (otherlv_6= 'outputSize' otherlv_7= '=' ( (lv_outputSize_8_0= RULE_INT ) ) ) | (otherlv_9= 'droputRate' otherlv_10= '=' ( (lv_dropeoutRate_11_0= ruleFLOAT ) ) ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_inputSize_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_outputSize_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_dropeoutRate_11_0 = null;



        	enterRule();

        try {
            // InternalMLDSL.g:987:2: ( ( (otherlv_0= 'type' otherlv_1= '=' ( (lv_type_2_0= ruleLayerType ) ) ) | (otherlv_3= 'inputSize' otherlv_4= '=' ( (lv_inputSize_5_0= RULE_INT ) ) ) | (otherlv_6= 'outputSize' otherlv_7= '=' ( (lv_outputSize_8_0= RULE_INT ) ) ) | (otherlv_9= 'droputRate' otherlv_10= '=' ( (lv_dropeoutRate_11_0= ruleFLOAT ) ) ) ) )
            // InternalMLDSL.g:988:2: ( (otherlv_0= 'type' otherlv_1= '=' ( (lv_type_2_0= ruleLayerType ) ) ) | (otherlv_3= 'inputSize' otherlv_4= '=' ( (lv_inputSize_5_0= RULE_INT ) ) ) | (otherlv_6= 'outputSize' otherlv_7= '=' ( (lv_outputSize_8_0= RULE_INT ) ) ) | (otherlv_9= 'droputRate' otherlv_10= '=' ( (lv_dropeoutRate_11_0= ruleFLOAT ) ) ) )
            {
            // InternalMLDSL.g:988:2: ( (otherlv_0= 'type' otherlv_1= '=' ( (lv_type_2_0= ruleLayerType ) ) ) | (otherlv_3= 'inputSize' otherlv_4= '=' ( (lv_inputSize_5_0= RULE_INT ) ) ) | (otherlv_6= 'outputSize' otherlv_7= '=' ( (lv_outputSize_8_0= RULE_INT ) ) ) | (otherlv_9= 'droputRate' otherlv_10= '=' ( (lv_dropeoutRate_11_0= ruleFLOAT ) ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case 32:
                {
                alt11=3;
                }
                break;
            case 33:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMLDSL.g:989:3: (otherlv_0= 'type' otherlv_1= '=' ( (lv_type_2_0= ruleLayerType ) ) )
                    {
                    // InternalMLDSL.g:989:3: (otherlv_0= 'type' otherlv_1= '=' ( (lv_type_2_0= ruleLayerType ) ) )
                    // InternalMLDSL.g:990:4: otherlv_0= 'type' otherlv_1= '=' ( (lv_type_2_0= ruleLayerType ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getTypeKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,22,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalMLDSL.g:998:4: ( (lv_type_2_0= ruleLayerType ) )
                    // InternalMLDSL.g:999:5: (lv_type_2_0= ruleLayerType )
                    {
                    // InternalMLDSL.g:999:5: (lv_type_2_0= ruleLayerType )
                    // InternalMLDSL.g:1000:6: lv_type_2_0= ruleLayerType
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getTypeLayerTypeEnumRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleLayerType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"eu.extremexp.ssfhai.dsl.MLDSL.LayerType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMLDSL.g:1019:3: (otherlv_3= 'inputSize' otherlv_4= '=' ( (lv_inputSize_5_0= RULE_INT ) ) )
                    {
                    // InternalMLDSL.g:1019:3: (otherlv_3= 'inputSize' otherlv_4= '=' ( (lv_inputSize_5_0= RULE_INT ) ) )
                    // InternalMLDSL.g:1020:4: otherlv_3= 'inputSize' otherlv_4= '=' ( (lv_inputSize_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getOptionAccess().getInputSizeKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getOptionAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalMLDSL.g:1028:4: ( (lv_inputSize_5_0= RULE_INT ) )
                    // InternalMLDSL.g:1029:5: (lv_inputSize_5_0= RULE_INT )
                    {
                    // InternalMLDSL.g:1029:5: (lv_inputSize_5_0= RULE_INT )
                    // InternalMLDSL.g:1030:6: lv_inputSize_5_0= RULE_INT
                    {
                    lv_inputSize_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_inputSize_5_0, grammarAccess.getOptionAccess().getInputSizeINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"inputSize",
                    							lv_inputSize_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMLDSL.g:1048:3: (otherlv_6= 'outputSize' otherlv_7= '=' ( (lv_outputSize_8_0= RULE_INT ) ) )
                    {
                    // InternalMLDSL.g:1048:3: (otherlv_6= 'outputSize' otherlv_7= '=' ( (lv_outputSize_8_0= RULE_INT ) ) )
                    // InternalMLDSL.g:1049:4: otherlv_6= 'outputSize' otherlv_7= '=' ( (lv_outputSize_8_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getOptionAccess().getOutputSizeKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getOptionAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalMLDSL.g:1057:4: ( (lv_outputSize_8_0= RULE_INT ) )
                    // InternalMLDSL.g:1058:5: (lv_outputSize_8_0= RULE_INT )
                    {
                    // InternalMLDSL.g:1058:5: (lv_outputSize_8_0= RULE_INT )
                    // InternalMLDSL.g:1059:6: lv_outputSize_8_0= RULE_INT
                    {
                    lv_outputSize_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_outputSize_8_0, grammarAccess.getOptionAccess().getOutputSizeINTTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"outputSize",
                    							lv_outputSize_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMLDSL.g:1077:3: (otherlv_9= 'droputRate' otherlv_10= '=' ( (lv_dropeoutRate_11_0= ruleFLOAT ) ) )
                    {
                    // InternalMLDSL.g:1077:3: (otherlv_9= 'droputRate' otherlv_10= '=' ( (lv_dropeoutRate_11_0= ruleFLOAT ) ) )
                    // InternalMLDSL.g:1078:4: otherlv_9= 'droputRate' otherlv_10= '=' ( (lv_dropeoutRate_11_0= ruleFLOAT ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getOptionAccess().getDroputRateKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getOptionAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalMLDSL.g:1086:4: ( (lv_dropeoutRate_11_0= ruleFLOAT ) )
                    // InternalMLDSL.g:1087:5: (lv_dropeoutRate_11_0= ruleFLOAT )
                    {
                    // InternalMLDSL.g:1087:5: (lv_dropeoutRate_11_0= ruleFLOAT )
                    // InternalMLDSL.g:1088:6: lv_dropeoutRate_11_0= ruleFLOAT
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getDropeoutRateFLOATParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_dropeoutRate_11_0=ruleFLOAT();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"dropeoutRate",
                    							lv_dropeoutRate_11_0,
                    							"eu.extremexp.ssfhai.dsl.MLDSL.FLOAT");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleParamValue"
    // InternalMLDSL.g:1110:1: entryRuleParamValue returns [EObject current=null] : iv_ruleParamValue= ruleParamValue EOF ;
    public final EObject entryRuleParamValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValue = null;


        try {
            // InternalMLDSL.g:1110:51: (iv_ruleParamValue= ruleParamValue EOF )
            // InternalMLDSL.g:1111:2: iv_ruleParamValue= ruleParamValue EOF
            {
             newCompositeNode(grammarAccess.getParamValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamValue=ruleParamValue();

            state._fsp--;

             current =iv_ruleParamValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParamValue"


    // $ANTLR start "ruleParamValue"
    // InternalMLDSL.g:1117:1: ruleParamValue returns [EObject current=null] : ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFLOAT ) ) | ( (lv_stringValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleParamValue() throws RecognitionException {
        EObject current = null;

        Token lv_intValue_0_0=null;
        Token lv_stringValue_2_0=null;
        EObject lv_floatValue_1_0 = null;



        	enterRule();

        try {
            // InternalMLDSL.g:1123:2: ( ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFLOAT ) ) | ( (lv_stringValue_2_0= RULE_STRING ) ) ) )
            // InternalMLDSL.g:1124:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFLOAT ) ) | ( (lv_stringValue_2_0= RULE_STRING ) ) )
            {
            // InternalMLDSL.g:1124:2: ( ( (lv_intValue_0_0= RULE_INT ) ) | ( (lv_floatValue_1_0= ruleFLOAT ) ) | ( (lv_stringValue_2_0= RULE_STRING ) ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==29) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||LA12_1==12) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMLDSL.g:1125:3: ( (lv_intValue_0_0= RULE_INT ) )
                    {
                    // InternalMLDSL.g:1125:3: ( (lv_intValue_0_0= RULE_INT ) )
                    // InternalMLDSL.g:1126:4: (lv_intValue_0_0= RULE_INT )
                    {
                    // InternalMLDSL.g:1126:4: (lv_intValue_0_0= RULE_INT )
                    // InternalMLDSL.g:1127:5: lv_intValue_0_0= RULE_INT
                    {
                    lv_intValue_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_intValue_0_0, grammarAccess.getParamValueAccess().getIntValueINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParamValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"intValue",
                    						lv_intValue_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMLDSL.g:1144:3: ( (lv_floatValue_1_0= ruleFLOAT ) )
                    {
                    // InternalMLDSL.g:1144:3: ( (lv_floatValue_1_0= ruleFLOAT ) )
                    // InternalMLDSL.g:1145:4: (lv_floatValue_1_0= ruleFLOAT )
                    {
                    // InternalMLDSL.g:1145:4: (lv_floatValue_1_0= ruleFLOAT )
                    // InternalMLDSL.g:1146:5: lv_floatValue_1_0= ruleFLOAT
                    {

                    					newCompositeNode(grammarAccess.getParamValueAccess().getFloatValueFLOATParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_floatValue_1_0=ruleFLOAT();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParamValueRule());
                    					}
                    					set(
                    						current,
                    						"floatValue",
                    						lv_floatValue_1_0,
                    						"eu.extremexp.ssfhai.dsl.MLDSL.FLOAT");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMLDSL.g:1164:3: ( (lv_stringValue_2_0= RULE_STRING ) )
                    {
                    // InternalMLDSL.g:1164:3: ( (lv_stringValue_2_0= RULE_STRING ) )
                    // InternalMLDSL.g:1165:4: (lv_stringValue_2_0= RULE_STRING )
                    {
                    // InternalMLDSL.g:1165:4: (lv_stringValue_2_0= RULE_STRING )
                    // InternalMLDSL.g:1166:5: lv_stringValue_2_0= RULE_STRING
                    {
                    lv_stringValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_stringValue_2_0, grammarAccess.getParamValueAccess().getStringValueSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParamValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"stringValue",
                    						lv_stringValue_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParamValue"


    // $ANTLR start "ruleLayerType"
    // InternalMLDSL.g:1186:1: ruleLayerType returns [Enumerator current=null] : ( (enumLiteral_0= 'Input' ) | (enumLiteral_1= 'Linear' ) | (enumLiteral_2= 'Sigmoid' ) | (enumLiteral_3= 'BN' ) | (enumLiteral_4= 'DropOut' ) ) ;
    public final Enumerator ruleLayerType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMLDSL.g:1192:2: ( ( (enumLiteral_0= 'Input' ) | (enumLiteral_1= 'Linear' ) | (enumLiteral_2= 'Sigmoid' ) | (enumLiteral_3= 'BN' ) | (enumLiteral_4= 'DropOut' ) ) )
            // InternalMLDSL.g:1193:2: ( (enumLiteral_0= 'Input' ) | (enumLiteral_1= 'Linear' ) | (enumLiteral_2= 'Sigmoid' ) | (enumLiteral_3= 'BN' ) | (enumLiteral_4= 'DropOut' ) )
            {
            // InternalMLDSL.g:1193:2: ( (enumLiteral_0= 'Input' ) | (enumLiteral_1= 'Linear' ) | (enumLiteral_2= 'Sigmoid' ) | (enumLiteral_3= 'BN' ) | (enumLiteral_4= 'DropOut' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt13=1;
                }
                break;
            case 35:
                {
                alt13=2;
                }
                break;
            case 36:
                {
                alt13=3;
                }
                break;
            case 37:
                {
                alt13=4;
                }
                break;
            case 38:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMLDSL.g:1194:3: (enumLiteral_0= 'Input' )
                    {
                    // InternalMLDSL.g:1194:3: (enumLiteral_0= 'Input' )
                    // InternalMLDSL.g:1195:4: enumLiteral_0= 'Input'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getLayerTypeAccess().getInputEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLayerTypeAccess().getInputEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMLDSL.g:1202:3: (enumLiteral_1= 'Linear' )
                    {
                    // InternalMLDSL.g:1202:3: (enumLiteral_1= 'Linear' )
                    // InternalMLDSL.g:1203:4: enumLiteral_1= 'Linear'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getLayerTypeAccess().getLinearEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLayerTypeAccess().getLinearEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMLDSL.g:1210:3: (enumLiteral_2= 'Sigmoid' )
                    {
                    // InternalMLDSL.g:1210:3: (enumLiteral_2= 'Sigmoid' )
                    // InternalMLDSL.g:1211:4: enumLiteral_2= 'Sigmoid'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getLayerTypeAccess().getSigmoidEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLayerTypeAccess().getSigmoidEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMLDSL.g:1218:3: (enumLiteral_3= 'BN' )
                    {
                    // InternalMLDSL.g:1218:3: (enumLiteral_3= 'BN' )
                    // InternalMLDSL.g:1219:4: enumLiteral_3= 'BN'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getLayerTypeAccess().getBNEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLayerTypeAccess().getBNEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMLDSL.g:1226:3: (enumLiteral_4= 'DropOut' )
                    {
                    // InternalMLDSL.g:1226:3: (enumLiteral_4= 'DropOut' )
                    // InternalMLDSL.g:1227:4: enumLiteral_4= 'DropOut'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getLayerTypeAccess().getDropOutEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLayerTypeAccess().getDropOutEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayerType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000011D8010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000D0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000801000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002008010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000007C00000000L});

}
