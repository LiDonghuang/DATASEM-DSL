/*
 * generated by Xtext
 */
package datasem.xtext.kanban.domainmodel.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import datasem.xtext.kanban.domainmodel.services.KanbanmodelGrammarAccess;

public class KanbanmodelParser extends AbstractContentAssistParser {
	
	@Inject
	private KanbanmodelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected datasem.xtext.kanban.domainmodel.ui.contentassist.antlr.internal.InternalKanbanmodelParser createParser() {
		datasem.xtext.kanban.domainmodel.ui.contentassist.antlr.internal.InternalKanbanmodelParser result = new datasem.xtext.kanban.domainmodel.ui.contentassist.antlr.internal.InternalKanbanmodelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getParameterAccess().getAlternatives(), "rule__Parameter__Alternatives");
					put(grammarAccess.getAbstractParameterAccess().getAlternatives(), "rule__AbstractParameter__Alternatives");
					put(grammarAccess.getNumExpressionAccess().getAlternatives(), "rule__NumExpression__Alternatives");
					put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
					put(grammarAccess.getVariableAccess().getAlternatives_3(), "rule__Variable__Alternatives_3");
					put(grammarAccess.getDistributionAccess().getAlternatives_0(), "rule__Distribution__Alternatives_0");
					put(grammarAccess.getCausalTriggerAccess().getAlternatives_0(), "rule__CausalTrigger__Alternatives_0");
					put(grammarAccess.getClassOfServiceAccess().getAlternatives_6(), "rule__ClassOfService__Alternatives_6");
					put(grammarAccess.getServiceProviderAccess().getAlternatives_1(), "rule__ServiceProvider__Alternatives_1");
					put(grammarAccess.getModelBuilderAccess().getGroup(), "rule__ModelBuilder__Group__0");
					put(grammarAccess.getExperimentModelAccess().getGroup(), "rule__ExperimentModel__Group__0");
					put(grammarAccess.getExperimentModelAccess().getGroup_2(), "rule__ExperimentModel__Group_2__0");
					put(grammarAccess.getSystemLibrariesAccess().getGroup(), "rule__SystemLibraries__Group__0");
					put(grammarAccess.getUserLibrariesAccess().getGroup(), "rule__UserLibraries__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_2(), "rule__QualifiedName__Group_2__0");
					put(grammarAccess.getAbstractParameterAccess().getGroup_0(), "rule__AbstractParameter__Group_0__0");
					put(grammarAccess.getNumExpressionAccess().getGroup_1(), "rule__NumExpression__Group_1__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVariableAccess().getGroup_3_0(), "rule__Variable__Group_3_0__0");
					put(grammarAccess.getVariableAccess().getGroup_3_1(), "rule__Variable__Group_3_1__0");
					put(grammarAccess.getVariableAccess().getGroup_3_2(), "rule__Variable__Group_3_2__0");
					put(grammarAccess.getVariableAccess().getGroup_3_3(), "rule__Variable__Group_3_3__0");
					put(grammarAccess.getVariableAccess().getGroup_3_4(), "rule__Variable__Group_3_4__0");
					put(grammarAccess.getDistributionAccess().getGroup(), "rule__Distribution__Group__0");
					put(grammarAccess.getEventTypeAccess().getGroup(), "rule__EventType__Group__0");
					put(grammarAccess.getConditionTypeAccess().getGroup(), "rule__ConditionType__Group__0");
					put(grammarAccess.getTransitionTypeAccess().getGroup(), "rule__TransitionType__Group__0");
					put(grammarAccess.getProcessModelAccess().getGroup(), "rule__ProcessModel__Group__0");
					put(grammarAccess.getProcessModelAccess().getGroup_3(), "rule__ProcessModel__Group_3__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getAgentRoleTypeAccess().getGroup(), "rule__AgentRoleType__Group__0");
					put(grammarAccess.getWINReplicationAccess().getGroup(), "rule__WINReplication__Group__0");
					put(grammarAccess.getGovernanceStrategyAccess().getGroup(), "rule__GovernanceStrategy__Group__0");
					put(grammarAccess.getGovernanceStrategyAccess().getGroup_4(), "rule__GovernanceStrategy__Group_4__0");
					put(grammarAccess.getGovernanceStrategyAccess().getGroup_5(), "rule__GovernanceStrategy__Group_5__0");
					put(grammarAccess.getWIAcceptanceAccess().getGroup(), "rule__WIAcceptance__Group__0");
					put(grammarAccess.getWIAcceptanceAccess().getGroup_3(), "rule__WIAcceptance__Group_3__0");
					put(grammarAccess.getWIAcceptanceAccess().getGroup_4(), "rule__WIAcceptance__Group_4__0");
					put(grammarAccess.getWIAcceptanceAccess().getGroup_5(), "rule__WIAcceptance__Group_5__0");
					put(grammarAccess.getWISelectionAccess().getGroup(), "rule__WISelection__Group__0");
					put(grammarAccess.getWISelectionAccess().getGroup_3(), "rule__WISelection__Group_3__0");
					put(grammarAccess.getWIAssignmentAccess().getGroup(), "rule__WIAssignment__Group__0");
					put(grammarAccess.getWIAssignmentAccess().getGroup_3(), "rule__WIAssignment__Group_3__0");
					put(grammarAccess.getResourceAllocationAccess().getGroup(), "rule__ResourceAllocation__Group__0");
					put(grammarAccess.getResourceAllocationAccess().getGroup_3(), "rule__ResourceAllocation__Group_3__0");
					put(grammarAccess.getResourceOutsourcingAccess().getGroup(), "rule__ResourceOutsourcing__Group__0");
					put(grammarAccess.getResourceOutsourcingAccess().getGroup_3(), "rule__ResourceOutsourcing__Group_3__0");
					put(grammarAccess.getWIAcceptanceRuleTypeAccess().getGroup(), "rule__WIAcceptanceRuleType__Group__0");
					put(grammarAccess.getWIAcceptanceRuleTypeAccess().getGroup_3(), "rule__WIAcceptanceRuleType__Group_3__0");
					put(grammarAccess.getWISelectionRuleTypeAccess().getGroup(), "rule__WISelectionRuleType__Group__0");
					put(grammarAccess.getWISelectionRuleTypeAccess().getGroup_3(), "rule__WISelectionRuleType__Group_3__0");
					put(grammarAccess.getWIAssignmentRuleTypeAccess().getGroup(), "rule__WIAssignmentRuleType__Group__0");
					put(grammarAccess.getWIAssignmentRuleTypeAccess().getGroup_3(), "rule__WIAssignmentRuleType__Group_3__0");
					put(grammarAccess.getResourceAllocationRuleTypeAccess().getGroup(), "rule__ResourceAllocationRuleType__Group__0");
					put(grammarAccess.getResourceAllocationRuleTypeAccess().getGroup_3(), "rule__ResourceAllocationRuleType__Group_3__0");
					put(grammarAccess.getResourceOutsourcingRuleTypeAccess().getGroup(), "rule__ResourceOutsourcingRuleType__Group__0");
					put(grammarAccess.getResourceOutsourcingRuleTypeAccess().getGroup_3(), "rule__ResourceOutsourcingRuleType__Group_3__0");
					put(grammarAccess.getMechanismAccess().getGroup(), "rule__Mechanism__Group__0");
					put(grammarAccess.getMechanismAccess().getGroup_5(), "rule__Mechanism__Group_5__0");
					put(grammarAccess.getMechanismAccess().getGroup_6(), "rule__Mechanism__Group_6__0");
					put(grammarAccess.getMechanismAttributeAccess().getGroup(), "rule__MechanismAttribute__Group__0");
					put(grammarAccess.getProcessAccess().getGroup(), "rule__Process__Group__0");
					put(grammarAccess.getProcessAccess().getGroup_5(), "rule__Process__Group_5__0");
					put(grammarAccess.getProcessAccess().getGroup_6(), "rule__Process__Group_6__0");
					put(grammarAccess.getProcessAttributeAccess().getGroup(), "rule__ProcessAttribute__Group__0");
					put(grammarAccess.getWorkSourceAccess().getGroup(), "rule__WorkSource__Group__0");
					put(grammarAccess.getWorkSourceAccess().getGroup_4(), "rule__WorkSource__Group_4__0");
					put(grammarAccess.getWorkSourceAccess().getGroup_5(), "rule__WorkSource__Group_5__0");
					put(grammarAccess.getWorkItemNetworkAccess().getGroup(), "rule__WorkItemNetwork__Group__0");
					put(grammarAccess.getWorkItemNetworkAccess().getGroup_4(), "rule__WorkItemNetwork__Group_4__0");
					put(grammarAccess.getWorkItemAccess().getGroup(), "rule__WorkItem__Group__0");
					put(grammarAccess.getWorkItemAccess().getGroup_4(), "rule__WorkItem__Group_4__0");
					put(grammarAccess.getWorkItemAccess().getGroup_7(), "rule__WorkItem__Group_7__0");
					put(grammarAccess.getWorkItemAccess().getGroup_8(), "rule__WorkItem__Group_8__0");
					put(grammarAccess.getWorkItemAccess().getGroup_9(), "rule__WorkItem__Group_9__0");
					put(grammarAccess.getWorkItemAccess().getGroup_14(), "rule__WorkItem__Group_14__0");
					put(grammarAccess.getWorkItemAccess().getGroup_15(), "rule__WorkItem__Group_15__0");
					put(grammarAccess.getWorkItemAccess().getGroup_16(), "rule__WorkItem__Group_16__0");
					put(grammarAccess.getWorkItemAccess().getGroup_17(), "rule__WorkItem__Group_17__0");
					put(grammarAccess.getWorkItemAccess().getGroup_18(), "rule__WorkItem__Group_18__0");
					put(grammarAccess.getWorkItemAccess().getGroup_19(), "rule__WorkItem__Group_19__0");
					put(grammarAccess.getWorkItemAccess().getGroup_20(), "rule__WorkItem__Group_20__0");
					put(grammarAccess.getWorkItemAccess().getGroup_21(), "rule__WorkItem__Group_21__0");
					put(grammarAccess.getWorkItemAccess().getGroup_22(), "rule__WorkItem__Group_22__0");
					put(grammarAccess.getWorkItemAccess().getGroup_23(), "rule__WorkItem__Group_23__0");
					put(grammarAccess.getCausalTriggerAccess().getGroup(), "rule__CausalTrigger__Group__0");
					put(grammarAccess.getCausalTriggerAccess().getGroup_4(), "rule__CausalTrigger__Group_4__0");
					put(grammarAccess.getCausalTriggerAccess().getGroup_5(), "rule__CausalTrigger__Group_5__0");
					put(grammarAccess.getWorkItemTypeAccess().getGroup(), "rule__WorkItemType__Group__0");
					put(grammarAccess.getWorkItemTypeAccess().getGroup_4(), "rule__WorkItemType__Group_4__0");
					put(grammarAccess.getWorkItemTypeAccess().getGroup_5(), "rule__WorkItemType__Group_5__0");
					put(grammarAccess.getValueFunctionAccess().getGroup(), "rule__ValueFunction__Group__0");
					put(grammarAccess.getValueFunctionAccess().getGroup_3(), "rule__ValueFunction__Group_3__0");
					put(grammarAccess.getClassOfServiceAccess().getGroup(), "rule__ClassOfService__Group__0");
					put(grammarAccess.getClassOfServiceAccess().getGroup_4(), "rule__ClassOfService__Group_4__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getServiceAccess().getGroup_3(), "rule__Service__Group_3__0");
					put(grammarAccess.getServiceAccess().getGroup_3_1(), "rule__Service__Group_3_1__0");
					put(grammarAccess.getServiceProviderAccess().getGroup(), "rule__ServiceProvider__Group__0");
					put(grammarAccess.getServiceProviderAccess().getGroup_4(), "rule__ServiceProvider__Group_4__0");
					put(grammarAccess.getServiceProviderAccess().getGroup_5(), "rule__ServiceProvider__Group_5__0");
					put(grammarAccess.getServiceProviderAccess().getGroup_6(), "rule__ServiceProvider__Group_6__0");
					put(grammarAccess.getServiceProviderAccess().getGroup_9(), "rule__ServiceProvider__Group_9__0");
					put(grammarAccess.getServiceProviderAccess().getGroup_10(), "rule__ServiceProvider__Group_10__0");
					put(grammarAccess.getAssetAccess().getGroup(), "rule__Asset__Group__0");
					put(grammarAccess.getAssetAccess().getGroup_4(), "rule__Asset__Group_4__0");
					put(grammarAccess.getAssetAccess().getGroup_5(), "rule__Asset__Group_5__0");
					put(grammarAccess.getAssetAccess().getGroup_6(), "rule__Asset__Group_6__0");
					put(grammarAccess.getSkillAccess().getGroup(), "rule__Skill__Group__0");
					put(grammarAccess.getModelBuilderAccess().getNameAssignment_1(), "rule__ModelBuilder__NameAssignment_1");
					put(grammarAccess.getModelBuilderAccess().getDescriptionAssignment_3(), "rule__ModelBuilder__DescriptionAssignment_3");
					put(grammarAccess.getModelBuilderAccess().getSystemLibrariesAssignment_4(), "rule__ModelBuilder__SystemLibrariesAssignment_4");
					put(grammarAccess.getModelBuilderAccess().getUserLibrariesAssignment_5(), "rule__ModelBuilder__UserLibrariesAssignment_5");
					put(grammarAccess.getModelBuilderAccess().getExperimentModelAssignment_6(), "rule__ModelBuilder__ExperimentModelAssignment_6");
					put(grammarAccess.getExperimentModelAccess().getNameAssignment_1(), "rule__ExperimentModel__NameAssignment_1");
					put(grammarAccess.getExperimentModelAccess().getPathAssignment_2_1(), "rule__ExperimentModel__PathAssignment_2_1");
					put(grammarAccess.getExperimentModelAccess().getVariablesAssignment_4(), "rule__ExperimentModel__VariablesAssignment_4");
					put(grammarAccess.getExperimentModelAccess().getServiceProvidersAssignment_8(), "rule__ExperimentModel__ServiceProvidersAssignment_8");
					put(grammarAccess.getExperimentModelAccess().getWorkSourcesAssignment_13(), "rule__ExperimentModel__WorkSourcesAssignment_13");
					put(grammarAccess.getExperimentModelAccess().getWorkItemNetworksAssignment_16(), "rule__ExperimentModel__WorkItemNetworksAssignment_16");
					put(grammarAccess.getExperimentModelAccess().getWINReplicationsAssignment_21(), "rule__ExperimentModel__WINReplicationsAssignment_21");
					put(grammarAccess.getExperimentModelAccess().getIndicatorsAssignment_24(), "rule__ExperimentModel__IndicatorsAssignment_24");
					put(grammarAccess.getSystemLibrariesAccess().getEventTypesAssignment_2(), "rule__SystemLibraries__EventTypesAssignment_2");
					put(grammarAccess.getSystemLibrariesAccess().getConditionTypesAssignment_5(), "rule__SystemLibraries__ConditionTypesAssignment_5");
					put(grammarAccess.getSystemLibrariesAccess().getTransitionTypesAssignment_8(), "rule__SystemLibraries__TransitionTypesAssignment_8");
					put(grammarAccess.getSystemLibrariesAccess().getWIAcceptanceRuleTypesAssignment_13(), "rule__SystemLibraries__WIAcceptanceRuleTypesAssignment_13");
					put(grammarAccess.getSystemLibrariesAccess().getWISelectionRuleTypesAssignment_17(), "rule__SystemLibraries__WISelectionRuleTypesAssignment_17");
					put(grammarAccess.getSystemLibrariesAccess().getWIAssignmentRuleTypesAssignment_21(), "rule__SystemLibraries__WIAssignmentRuleTypesAssignment_21");
					put(grammarAccess.getSystemLibrariesAccess().getResourceAllocationRuleTypesAssignment_25(), "rule__SystemLibraries__ResourceAllocationRuleTypesAssignment_25");
					put(grammarAccess.getSystemLibrariesAccess().getResourceOutsourcingRuleTypesAssignment_29(), "rule__SystemLibraries__ResourceOutsourcingRuleTypesAssignment_29");
					put(grammarAccess.getSystemLibrariesAccess().getProcessModelsAssignment_34(), "rule__SystemLibraries__ProcessModelsAssignment_34");
					put(grammarAccess.getSystemLibrariesAccess().getValueFunctionsAssignment_37(), "rule__SystemLibraries__ValueFunctionsAssignment_37");
					put(grammarAccess.getUserLibrariesAccess().getWorkItemTypesAssignment_2(), "rule__UserLibraries__WorkItemTypesAssignment_2");
					put(grammarAccess.getUserLibrariesAccess().getClassOfServicesAssignment_5(), "rule__UserLibraries__ClassOfServicesAssignment_5");
					put(grammarAccess.getUserLibrariesAccess().getServicesAssignment_8(), "rule__UserLibraries__ServicesAssignment_8");
					put(grammarAccess.getUserLibrariesAccess().getGovernanceStrategiesAssignment_11(), "rule__UserLibraries__GovernanceStrategiesAssignment_11");
					put(grammarAccess.getAbstractParameterAccess().getIsVariableAssignment_0_0(), "rule__AbstractParameter__IsVariableAssignment_0_0");
					put(grammarAccess.getAbstractParameterAccess().getVariableAssignment_0_1(), "rule__AbstractParameter__VariableAssignment_0_1");
					put(grammarAccess.getAbstractParameterAccess().getValueAssignment_1(), "rule__AbstractParameter__ValueAssignment_1");
					put(grammarAccess.getNumExpressionAccess().getNumValueAssignment_0(), "rule__NumExpression__NumValueAssignment_0");
					put(grammarAccess.getNumExpressionAccess().getDistributionAssignment_1_0(), "rule__NumExpression__DistributionAssignment_1_0");
					put(grammarAccess.getNumExpressionAccess().getNumDistAssignment_1_1(), "rule__NumExpression__NumDistAssignment_1_1");
					put(grammarAccess.getOperatorAccess().getEqualToAssignment_0(), "rule__Operator__EqualToAssignment_0");
					put(grammarAccess.getOperatorAccess().getLargerThanAssignment_1(), "rule__Operator__LargerThanAssignment_1");
					put(grammarAccess.getOperatorAccess().getSmallerThanAssignment_2(), "rule__Operator__SmallerThanAssignment_2");
					put(grammarAccess.getOperatorAccess().getLargerOrEqualToAssignment_3(), "rule__Operator__LargerOrEqualToAssignment_3");
					put(grammarAccess.getOperatorAccess().getSmallerOrEqualToAssignment_4(), "rule__Operator__SmallerOrEqualToAssignment_4");
					put(grammarAccess.getOperatorAccess().getNotEqualToAssignment_5(), "rule__Operator__NotEqualToAssignment_5");
					put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
					put(grammarAccess.getVariableAccess().getTypeIntegerAssignment_3_0_0(), "rule__Variable__TypeIntegerAssignment_3_0_0");
					put(grammarAccess.getVariableAccess().getIntValueAssignment_3_0_1(), "rule__Variable__IntValueAssignment_3_0_1");
					put(grammarAccess.getVariableAccess().getTypeDoubleAssignment_3_1_0(), "rule__Variable__TypeDoubleAssignment_3_1_0");
					put(grammarAccess.getVariableAccess().getDoubleValueAssignment_3_1_1(), "rule__Variable__DoubleValueAssignment_3_1_1");
					put(grammarAccess.getVariableAccess().getTypeStringAssignment_3_2_0(), "rule__Variable__TypeStringAssignment_3_2_0");
					put(grammarAccess.getVariableAccess().getStringValueAssignment_3_2_1(), "rule__Variable__StringValueAssignment_3_2_1");
					put(grammarAccess.getVariableAccess().getTypeDistributionAssignment_3_3_0(), "rule__Variable__TypeDistributionAssignment_3_3_0");
					put(grammarAccess.getVariableAccess().getDistrbutionAssignment_3_3_1(), "rule__Variable__DistrbutionAssignment_3_3_1");
					put(grammarAccess.getVariableAccess().getTypeStrategyAssignment_3_4_0(), "rule__Variable__TypeStrategyAssignment_3_4_0");
					put(grammarAccess.getVariableAccess().getStrategyAssignment_3_4_1(), "rule__Variable__StrategyAssignment_3_4_1");
					put(grammarAccess.getDistributionAccess().getIsNormalAssignment_0_0(), "rule__Distribution__IsNormalAssignment_0_0");
					put(grammarAccess.getDistributionAccess().getIsUniformAssignment_0_1(), "rule__Distribution__IsUniformAssignment_0_1");
					put(grammarAccess.getDistributionAccess().getIsExponentialAssignment_0_2(), "rule__Distribution__IsExponentialAssignment_0_2");
					put(grammarAccess.getDistributionAccess().getParametersAssignment_2(), "rule__Distribution__ParametersAssignment_2");
					put(grammarAccess.getEventTypeAccess().getNameAssignment_1(), "rule__EventType__NameAssignment_1");
					put(grammarAccess.getEventTypeAccess().getDescriptionAssignment_2(), "rule__EventType__DescriptionAssignment_2");
					put(grammarAccess.getConditionTypeAccess().getNameAssignment_1(), "rule__ConditionType__NameAssignment_1");
					put(grammarAccess.getConditionTypeAccess().getDescriptionAssignment_2(), "rule__ConditionType__DescriptionAssignment_2");
					put(grammarAccess.getTransitionTypeAccess().getNameAssignment_1(), "rule__TransitionType__NameAssignment_1");
					put(grammarAccess.getTransitionTypeAccess().getDescriptionAssignment_2(), "rule__TransitionType__DescriptionAssignment_2");
					put(grammarAccess.getProcessModelAccess().getNameAssignment_1(), "rule__ProcessModel__NameAssignment_1");
					put(grammarAccess.getProcessModelAccess().getDescriptionAssignment_3_1(), "rule__ProcessModel__DescriptionAssignment_3_1");
					put(grammarAccess.getProcessModelAccess().getEventsAssignment_6(), "rule__ProcessModel__EventsAssignment_6");
					put(grammarAccess.getEventAccess().getConditionsAssignment_4(), "rule__Event__ConditionsAssignment_4");
					put(grammarAccess.getEventAccess().getTransitionsAssignment_8(), "rule__Event__TransitionsAssignment_8");
					put(grammarAccess.getConditionAccess().getTypeAssignment_0(), "rule__Condition__TypeAssignment_0");
					put(grammarAccess.getConditionAccess().getOperatorAssignment_1(), "rule__Condition__OperatorAssignment_1");
					put(grammarAccess.getConditionAccess().getValueAssignment_2(), "rule__Condition__ValueAssignment_2");
					put(grammarAccess.getTransitionAccess().getTypeAssignment_0(), "rule__Transition__TypeAssignment_0");
					put(grammarAccess.getTransitionAccess().getValueAssignment_2(), "rule__Transition__ValueAssignment_2");
					put(grammarAccess.getAgentRoleTypeAccess().getNameAssignment_1(), "rule__AgentRoleType__NameAssignment_1");
					put(grammarAccess.getAgentRoleTypeAccess().getDescriptionAssignment_2(), "rule__AgentRoleType__DescriptionAssignment_2");
					put(grammarAccess.getWINReplicationAccess().getWorkItemNetworkAssignment_1(), "rule__WINReplication__WorkItemNetworkAssignment_1");
					put(grammarAccess.getWINReplicationAccess().getNumReplicationsAssignment_3(), "rule__WINReplication__NumReplicationsAssignment_3");
					put(grammarAccess.getGovernanceStrategyAccess().getIdAssignment_0(), "rule__GovernanceStrategy__IdAssignment_0");
					put(grammarAccess.getGovernanceStrategyAccess().getNameAssignment_2(), "rule__GovernanceStrategy__NameAssignment_2");
					put(grammarAccess.getGovernanceStrategyAccess().getDescriptionAssignment_4_1(), "rule__GovernanceStrategy__DescriptionAssignment_4_1");
					put(grammarAccess.getGovernanceStrategyAccess().getWIAcceptanceRuleAssignment_5_0(), "rule__GovernanceStrategy__WIAcceptanceRuleAssignment_5_0");
					put(grammarAccess.getGovernanceStrategyAccess().getWISelectionRuleAssignment_5_1(), "rule__GovernanceStrategy__WISelectionRuleAssignment_5_1");
					put(grammarAccess.getGovernanceStrategyAccess().getWIAssignmentRuleAssignment_5_2(), "rule__GovernanceStrategy__WIAssignmentRuleAssignment_5_2");
					put(grammarAccess.getGovernanceStrategyAccess().getResourceAllocationRuleAssignment_5_3(), "rule__GovernanceStrategy__ResourceAllocationRuleAssignment_5_3");
					put(grammarAccess.getGovernanceStrategyAccess().getResourceOutsourcingRuleAssignment_5_4(), "rule__GovernanceStrategy__ResourceOutsourcingRuleAssignment_5_4");
					put(grammarAccess.getGovernanceStrategyAccess().getMechanismsAssignment_8(), "rule__GovernanceStrategy__MechanismsAssignment_8");
					put(grammarAccess.getGovernanceStrategyAccess().getProcessesAssignment_12(), "rule__GovernanceStrategy__ProcessesAssignment_12");
					put(grammarAccess.getWIAcceptanceAccess().getTypeAssignment_1(), "rule__WIAcceptance__TypeAssignment_1");
					put(grammarAccess.getWIAcceptanceAccess().getDescriptionAssignment_3_1(), "rule__WIAcceptance__DescriptionAssignment_3_1");
					put(grammarAccess.getWIAcceptanceAccess().getBacklogQLimitAssignment_4_1(), "rule__WIAcceptance__BacklogQLimitAssignment_4_1");
					put(grammarAccess.getWIAcceptanceAccess().getReadyQLimitAssignment_5_1(), "rule__WIAcceptance__ReadyQLimitAssignment_5_1");
					put(grammarAccess.getWISelectionAccess().getTypeAssignment_1(), "rule__WISelection__TypeAssignment_1");
					put(grammarAccess.getWISelectionAccess().getDescriptionAssignment_3_1(), "rule__WISelection__DescriptionAssignment_3_1");
					put(grammarAccess.getWIAssignmentAccess().getTypeAssignment_1(), "rule__WIAssignment__TypeAssignment_1");
					put(grammarAccess.getWIAssignmentAccess().getDescriptionAssignment_3_1(), "rule__WIAssignment__DescriptionAssignment_3_1");
					put(grammarAccess.getResourceAllocationAccess().getTypeAssignment_1(), "rule__ResourceAllocation__TypeAssignment_1");
					put(grammarAccess.getResourceAllocationAccess().getDescriptionAssignment_3_1(), "rule__ResourceAllocation__DescriptionAssignment_3_1");
					put(grammarAccess.getResourceOutsourcingAccess().getTypeAssignment_1(), "rule__ResourceOutsourcing__TypeAssignment_1");
					put(grammarAccess.getResourceOutsourcingAccess().getDescriptionAssignment_3_1(), "rule__ResourceOutsourcing__DescriptionAssignment_3_1");
					put(grammarAccess.getWIAcceptanceRuleTypeAccess().getNameAssignment_1(), "rule__WIAcceptanceRuleType__NameAssignment_1");
					put(grammarAccess.getWIAcceptanceRuleTypeAccess().getDescriptionAssignment_3_1(), "rule__WIAcceptanceRuleType__DescriptionAssignment_3_1");
					put(grammarAccess.getWISelectionRuleTypeAccess().getNameAssignment_1(), "rule__WISelectionRuleType__NameAssignment_1");
					put(grammarAccess.getWISelectionRuleTypeAccess().getDescriptionAssignment_3_1(), "rule__WISelectionRuleType__DescriptionAssignment_3_1");
					put(grammarAccess.getWIAssignmentRuleTypeAccess().getNameAssignment_1(), "rule__WIAssignmentRuleType__NameAssignment_1");
					put(grammarAccess.getWIAssignmentRuleTypeAccess().getDescriptionAssignment_3_1(), "rule__WIAssignmentRuleType__DescriptionAssignment_3_1");
					put(grammarAccess.getResourceAllocationRuleTypeAccess().getNameAssignment_1(), "rule__ResourceAllocationRuleType__NameAssignment_1");
					put(grammarAccess.getResourceAllocationRuleTypeAccess().getDescriptionAssignment_3_1(), "rule__ResourceAllocationRuleType__DescriptionAssignment_3_1");
					put(grammarAccess.getResourceOutsourcingRuleTypeAccess().getNameAssignment_1(), "rule__ResourceOutsourcingRuleType__NameAssignment_1");
					put(grammarAccess.getResourceOutsourcingRuleTypeAccess().getDescriptionAssignment_3_1(), "rule__ResourceOutsourcingRuleType__DescriptionAssignment_3_1");
					put(grammarAccess.getMechanismAccess().getNameAssignment_1(), "rule__Mechanism__NameAssignment_1");
					put(grammarAccess.getMechanismAccess().getValueAssignment_3(), "rule__Mechanism__ValueAssignment_3");
					put(grammarAccess.getMechanismAccess().getDescriptionAssignment_5_1(), "rule__Mechanism__DescriptionAssignment_5_1");
					put(grammarAccess.getMechanismAccess().getAttributesAssignment_6_2(), "rule__Mechanism__AttributesAssignment_6_2");
					put(grammarAccess.getMechanismAttributeAccess().getAttributeAssignment_0(), "rule__MechanismAttribute__AttributeAssignment_0");
					put(grammarAccess.getMechanismAttributeAccess().getValueAssignment_2(), "rule__MechanismAttribute__ValueAssignment_2");
					put(grammarAccess.getProcessAccess().getNameAssignment_1(), "rule__Process__NameAssignment_1");
					put(grammarAccess.getProcessAccess().getValueAssignment_3(), "rule__Process__ValueAssignment_3");
					put(grammarAccess.getProcessAccess().getDescriptionAssignment_5_1(), "rule__Process__DescriptionAssignment_5_1");
					put(grammarAccess.getProcessAccess().getAttributesAssignment_6_2(), "rule__Process__AttributesAssignment_6_2");
					put(grammarAccess.getProcessAttributeAccess().getAttributeAssignment_0(), "rule__ProcessAttribute__AttributeAssignment_0");
					put(grammarAccess.getProcessAttributeAccess().getValueAssignment_2(), "rule__ProcessAttribute__ValueAssignment_2");
					put(grammarAccess.getWorkSourceAccess().getIdAssignment_0(), "rule__WorkSource__IdAssignment_0");
					put(grammarAccess.getWorkSourceAccess().getNameAssignment_2(), "rule__WorkSource__NameAssignment_2");
					put(grammarAccess.getWorkSourceAccess().getDescriptionAssignment_4_1(), "rule__WorkSource__DescriptionAssignment_4_1");
					put(grammarAccess.getWorkSourceAccess().getAssignToAssignment_5_2(), "rule__WorkSource__AssignToAssignment_5_2");
					put(grammarAccess.getWorkSourceAccess().getAssignmentRuleAssignment_6(), "rule__WorkSource__AssignmentRuleAssignment_6");
					put(grammarAccess.getWorkItemNetworkAccess().getIdAssignment_0(), "rule__WorkItemNetwork__IdAssignment_0");
					put(grammarAccess.getWorkItemNetworkAccess().getNameAssignment_2(), "rule__WorkItemNetwork__NameAssignment_2");
					put(grammarAccess.getWorkItemNetworkAccess().getDescriptionAssignment_4_1(), "rule__WorkItemNetwork__DescriptionAssignment_4_1");
					put(grammarAccess.getWorkItemNetworkAccess().getWorkItemsAssignment_7(), "rule__WorkItemNetwork__WorkItemsAssignment_7");
					put(grammarAccess.getWorkItemAccess().getIdAssignment_0(), "rule__WorkItem__IdAssignment_0");
					put(grammarAccess.getWorkItemAccess().getNameAssignment_2(), "rule__WorkItem__NameAssignment_2");
					put(grammarAccess.getWorkItemAccess().getDescriptionAssignment_4_1(), "rule__WorkItem__DescriptionAssignment_4_1");
					put(grammarAccess.getWorkItemAccess().getTypeAssignment_6(), "rule__WorkItem__TypeAssignment_6");
					put(grammarAccess.getWorkItemAccess().getHasPredecessorsAssignment_7_0(), "rule__WorkItem__HasPredecessorsAssignment_7_0");
					put(grammarAccess.getWorkItemAccess().getPTasksAssignment_7_2(), "rule__WorkItem__PTasksAssignment_7_2");
					put(grammarAccess.getWorkItemAccess().getIsAggregationNodeAssignment_8_0(), "rule__WorkItem__IsAggregationNodeAssignment_8_0");
					put(grammarAccess.getWorkItemAccess().getSTasksAssignment_8_2(), "rule__WorkItem__STasksAssignment_8_2");
					put(grammarAccess.getWorkItemAccess().getCausalTriggersAssignment_9_1(), "rule__WorkItem__CausalTriggersAssignment_9_1");
					put(grammarAccess.getWorkItemAccess().getRequiredServicesAssignment_12(), "rule__WorkItem__RequiredServicesAssignment_12");
					put(grammarAccess.getWorkItemAccess().getEffortsAssignment_14_1(), "rule__WorkItem__EffortsAssignment_14_1");
					put(grammarAccess.getWorkItemAccess().getMaturityLevelsAssignment_15_1(), "rule__WorkItem__MaturityLevelsAssignment_15_1");
					put(grammarAccess.getWorkItemAccess().getUncertaintyAssignment_16_1(), "rule__WorkItem__UncertaintyAssignment_16_1");
					put(grammarAccess.getWorkItemAccess().getRiskAssignment_17_1(), "rule__WorkItem__RiskAssignment_17_1");
					put(grammarAccess.getWorkItemAccess().getChangePropagationAssignment_18_1(), "rule__WorkItem__ChangePropagationAssignment_18_1");
					put(grammarAccess.getWorkItemAccess().getValueAssignment_19_1(), "rule__WorkItem__ValueAssignment_19_1");
					put(grammarAccess.getWorkItemAccess().getClassOfServiceAssignment_20_1(), "rule__WorkItem__ClassOfServiceAssignment_20_1");
					put(grammarAccess.getWorkItemAccess().getWorkSourceAssignment_21_1(), "rule__WorkItem__WorkSourceAssignment_21_1");
					put(grammarAccess.getWorkItemAccess().getArrivalTimeAssignment_22_1(), "rule__WorkItem__ArrivalTimeAssignment_22_1");
					put(grammarAccess.getWorkItemAccess().getDueDateAssignment_23_1(), "rule__WorkItem__DueDateAssignment_23_1");
					put(grammarAccess.getCausalTriggerAccess().getTriggeredAssignment_2(), "rule__CausalTrigger__TriggeredAssignment_2");
					put(grammarAccess.getCausalTriggerAccess().getAtProgressAssignment_4_1(), "rule__CausalTrigger__AtProgressAssignment_4_1");
					put(grammarAccess.getCausalTriggerAccess().getOnProbabilityAssignment_5_1(), "rule__CausalTrigger__OnProbabilityAssignment_5_1");
					put(grammarAccess.getWorkItemTypeAccess().getIdAssignment_0(), "rule__WorkItemType__IdAssignment_0");
					put(grammarAccess.getWorkItemTypeAccess().getNameAssignment_2(), "rule__WorkItemType__NameAssignment_2");
					put(grammarAccess.getWorkItemTypeAccess().getDescriptionAssignment_4_1(), "rule__WorkItemType__DescriptionAssignment_4_1");
					put(grammarAccess.getWorkItemTypeAccess().getHierarchyAssignment_5_1(), "rule__WorkItemType__HierarchyAssignment_5_1");
					put(grammarAccess.getValueFunctionAccess().getNameAssignment_1(), "rule__ValueFunction__NameAssignment_1");
					put(grammarAccess.getValueFunctionAccess().getDescriptionAssignment_3_1(), "rule__ValueFunction__DescriptionAssignment_3_1");
					put(grammarAccess.getClassOfServiceAccess().getIdAssignment_0(), "rule__ClassOfService__IdAssignment_0");
					put(grammarAccess.getClassOfServiceAccess().getNameAssignment_2(), "rule__ClassOfService__NameAssignment_2");
					put(grammarAccess.getClassOfServiceAccess().getDescriptionAssignment_4_1(), "rule__ClassOfService__DescriptionAssignment_4_1");
					put(grammarAccess.getClassOfServiceAccess().getDisruptiveAssignment_6_0(), "rule__ClassOfService__DisruptiveAssignment_6_0");
					put(grammarAccess.getServiceAccess().getIdAssignment_0(), "rule__Service__IdAssignment_0");
					put(grammarAccess.getServiceAccess().getNameAssignment_2(), "rule__Service__NameAssignment_2");
					put(grammarAccess.getServiceAccess().getDescriptionAssignment_3_1_1(), "rule__Service__DescriptionAssignment_3_1_1");
					put(grammarAccess.getServiceProviderAccess().getIdAssignment_0(), "rule__ServiceProvider__IdAssignment_0");
					put(grammarAccess.getServiceProviderAccess().getNameAssignment_2(), "rule__ServiceProvider__NameAssignment_2");
					put(grammarAccess.getServiceProviderAccess().getDescriptionAssignment_4_1(), "rule__ServiceProvider__DescriptionAssignment_4_1");
					put(grammarAccess.getServiceProviderAccess().getAssignToAssignment_5_2(), "rule__ServiceProvider__AssignToAssignment_5_2");
					put(grammarAccess.getServiceProviderAccess().getOutsourceFromAssignment_6_2(), "rule__ServiceProvider__OutsourceFromAssignment_6_2");
					put(grammarAccess.getServiceProviderAccess().getTeamServiceAssignment_8(), "rule__ServiceProvider__TeamServiceAssignment_8");
					put(grammarAccess.getServiceProviderAccess().getGovernanceStrategyAssignment_9_2(), "rule__ServiceProvider__GovernanceStrategyAssignment_9_2");
					put(grammarAccess.getServiceProviderAccess().getResourcesAssignment_10_2(), "rule__ServiceProvider__ResourcesAssignment_10_2");
					put(grammarAccess.getAssetAccess().getIdAssignment_0(), "rule__Asset__IdAssignment_0");
					put(grammarAccess.getAssetAccess().getNameAssignment_2(), "rule__Asset__NameAssignment_2");
					put(grammarAccess.getAssetAccess().getDescriptionAssignment_4_1(), "rule__Asset__DescriptionAssignment_4_1");
					put(grammarAccess.getAssetAccess().getNumberAssignment_5_1(), "rule__Asset__NumberAssignment_5_1");
					put(grammarAccess.getAssetAccess().getSkillSetAssignment_6_2(), "rule__Asset__SkillSetAssignment_6_2");
					put(grammarAccess.getSkillAccess().getServiceAssignment_1(), "rule__Skill__ServiceAssignment_1");
					put(grammarAccess.getSkillAccess().getEfficiencyAssignment_3(), "rule__Skill__EfficiencyAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			datasem.xtext.kanban.domainmodel.ui.contentassist.antlr.internal.InternalKanbanmodelParser typedParser = (datasem.xtext.kanban.domainmodel.ui.contentassist.antlr.internal.InternalKanbanmodelParser) parser;
			typedParser.entryRuleModelBuilder();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public KanbanmodelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(KanbanmodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
