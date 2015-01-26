/*
* generated by Xtext
*/
package ausim.xtext.kanban.domainmodel.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import ausim.xtext.kanban.domainmodel.services.KanbanmodelGrammarAccess;

public class KanbanmodelParser extends AbstractContentAssistParser {
	
	@Inject
	private KanbanmodelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected ausim.xtext.kanban.domainmodel.ui.contentassist.antlr.internal.InternalKanbanmodelParser createParser() {
		ausim.xtext.kanban.domainmodel.ui.contentassist.antlr.internal.InternalKanbanmodelParser result = new ausim.xtext.kanban.domainmodel.ui.contentassist.antlr.internal.InternalKanbanmodelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTeamAccess().getAlternatives_0(), "rule__Team__Alternatives_0");
					put(grammarAccess.getDependencyAccess().getAlternatives_1(), "rule__Dependency__Alternatives_1");
					put(grammarAccess.getTransitionAccess().getAlternatives(), "rule__Transition__Alternatives");
					put(grammarAccess.getKanbanSchedulingSystemAccess().getGroup(), "rule__KanbanSchedulingSystem__Group__0");
					put(grammarAccess.getTeamAccess().getGroup(), "rule__Team__Group__0");
					put(grammarAccess.getTeamAccess().getGroup_3(), "rule__Team__Group_3__0");
					put(grammarAccess.getTeamAccess().getGroup_4(), "rule__Team__Group_4__0");
					put(grammarAccess.getTeamAccess().getGroup_5(), "rule__Team__Group_5__0");
					put(grammarAccess.getTeamAccess().getGroup_6(), "rule__Team__Group_6__0");
					put(grammarAccess.getTeamAccess().getGroup_7(), "rule__Team__Group_7__0");
					put(grammarAccess.getServiceAccess().getGroup(), "rule__Service__Group__0");
					put(grammarAccess.getAssetAccess().getGroup(), "rule__Asset__Group__0");
					put(grammarAccess.getAssetAccess().getGroup_2(), "rule__Asset__Group_2__0");
					put(grammarAccess.getDependencyAccess().getGroup(), "rule__Dependency__Group__0");
					put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
					put(grammarAccess.getRequirementAccess().getGroup_3(), "rule__Requirement__Group_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_4(), "rule__Requirement__Group_4__0");
					put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
					put(grammarAccess.getTaskAccess().getGroup_3(), "rule__Task__Group_3__0");
					put(grammarAccess.getTaskAccess().getGroup_4(), "rule__Task__Group_4__0");
					put(grammarAccess.getTaskAccess().getGroup_5(), "rule__Task__Group_5__0");
					put(grammarAccess.getTaskAccess().getGroup_6(), "rule__Task__Group_6__0");
					put(grammarAccess.getTaskAccess().getGroup_7(), "rule__Task__Group_7__0");
					put(grammarAccess.getKanbanTaskModelAccess().getGroup(), "rule__KanbanTaskModel__Group__0");
					put(grammarAccess.getCapabilityAccess().getGroup(), "rule__Capability__Group__0");
					put(grammarAccess.getStrategyAccess().getGroup(), "rule__Strategy__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_3(), "rule__Entity__Group_3__0");
					put(grammarAccess.getProvisionAccess().getGroup(), "rule__Provision__Group__0");
					put(grammarAccess.getStatemachineAccess().getGroup(), "rule__Statemachine__Group__0");
					put(grammarAccess.getStatemachineAccess().getGroup_1(), "rule__Statemachine__Group_1__0");
					put(grammarAccess.getStatemachineAccess().getGroup_2(), "rule__Statemachine__Group_2__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getCommandAccess().getGroup(), "rule__Command__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getStateAccess().getGroup_2(), "rule__State__Group_2__0");
					put(grammarAccess.getTransitionAccess().getGroup_0(), "rule__Transition__Group_0__0");
					put(grammarAccess.getTransitionAccess().getGroup_1(), "rule__Transition__Group_1__0");
					put(grammarAccess.getKanbanSchedulingSystemAccess().getNameAssignment_1(), "rule__KanbanSchedulingSystem__NameAssignment_1");
					put(grammarAccess.getKanbanSchedulingSystemAccess().getOrgUnitsAssignment_3(), "rule__KanbanSchedulingSystem__OrgUnitsAssignment_3");
					put(grammarAccess.getKanbanSchedulingSystemAccess().getKssTasksAssignment_6(), "rule__KanbanSchedulingSystem__KssTasksAssignment_6");
					put(grammarAccess.getKanbanSchedulingSystemAccess().getKssWorkFlowAssignment_7(), "rule__KanbanSchedulingSystem__KssWorkFlowAssignment_7");
					put(grammarAccess.getKanbanSchedulingSystemAccess().getKssGovModelAssignment_10(), "rule__KanbanSchedulingSystem__KssGovModelAssignment_10");
					put(grammarAccess.getTeamAccess().getNameAssignment_1(), "rule__Team__NameAssignment_1");
					put(grammarAccess.getTeamAccess().getDemandUnitsAssignment_3_2(), "rule__Team__DemandUnitsAssignment_3_2");
					put(grammarAccess.getTeamAccess().getSourcedUnitsAssignment_4_2(), "rule__Team__SourcedUnitsAssignment_4_2");
					put(grammarAccess.getTeamAccess().getGroupmembersAssignment_5_2(), "rule__Team__GroupmembersAssignment_5_2");
					put(grammarAccess.getTeamAccess().getResourcesAssignment_6_2(), "rule__Team__ResourcesAssignment_6_2");
					put(grammarAccess.getTeamAccess().getServicesAssignment_7_2(), "rule__Team__ServicesAssignment_7_2");
					put(grammarAccess.getServiceAccess().getNameAssignment_1(), "rule__Service__NameAssignment_1");
					put(grammarAccess.getAssetAccess().getNameAssignment_1(), "rule__Asset__NameAssignment_1");
					put(grammarAccess.getAssetAccess().getHasSkillsAssignment_2_3(), "rule__Asset__HasSkillsAssignment_2_3");
					put(grammarAccess.getSkillAccess().getNameAssignment(), "rule__Skill__NameAssignment");
					put(grammarAccess.getDependencyAccess().getSourceTaskAssignment_0(), "rule__Dependency__SourceTaskAssignment_0");
					put(grammarAccess.getDependencyAccess().getTargetTaskAssignment_2(), "rule__Dependency__TargetTaskAssignment_2");
					put(grammarAccess.getRequirementAccess().getNameAssignment_1(), "rule__Requirement__NameAssignment_1");
					put(grammarAccess.getRequirementAccess().getRTasksAssignment_3_2(), "rule__Requirement__RTasksAssignment_3_2");
					put(grammarAccess.getRequirementAccess().getDependenciesAssignment_4_1(), "rule__Requirement__DependenciesAssignment_4_1");
					put(grammarAccess.getTaskAccess().getNameAssignment_1(), "rule__Task__NameAssignment_1");
					put(grammarAccess.getTaskAccess().getSTasksAssignment_3_2(), "rule__Task__STasksAssignment_3_2");
					put(grammarAccess.getTaskAccess().getTaskDependenciesAssignment_4_1(), "rule__Task__TaskDependenciesAssignment_4_1");
					put(grammarAccess.getTaskAccess().getReqSpecialtiesAssignment_5_1(), "rule__Task__ReqSpecialtiesAssignment_5_1");
					put(grammarAccess.getTaskAccess().getBvalueAssignment_6_1(), "rule__Task__BvalueAssignment_6_1");
					put(grammarAccess.getTaskAccess().getCOSAssignment_7_1(), "rule__Task__COSAssignment_7_1");
					put(grammarAccess.getKanbanTaskModelAccess().getNameAssignment_1(), "rule__KanbanTaskModel__NameAssignment_1");
					put(grammarAccess.getKanbanTaskModelAccess().getCapsAssignment_2(), "rule__KanbanTaskModel__CapsAssignment_2");
					put(grammarAccess.getCapabilityAccess().getNameAssignment_1(), "rule__Capability__NameAssignment_1");
					put(grammarAccess.getCapabilityAccess().getReqsAssignment_3(), "rule__Capability__ReqsAssignment_3");
					put(grammarAccess.getKanbanGovModelAccess().getStrategyAssignment(), "rule__KanbanGovModel__StrategyAssignment");
					put(grammarAccess.getStrategyAccess().getNameAssignment_1(), "rule__Strategy__NameAssignment_1");
					put(grammarAccess.getStrategyAccess().getEntitiesAssignment_3(), "rule__Strategy__EntitiesAssignment_3");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getSdnameAssignment_3_1(), "rule__Entity__SdnameAssignment_3_1");
					put(grammarAccess.getEntityAccess().getServiceProvisionsAssignment_3_4(), "rule__Entity__ServiceProvisionsAssignment_3_4");
					put(grammarAccess.getEntityAccess().getEntityBehaviorAssignment_4(), "rule__Entity__EntityBehaviorAssignment_4");
					put(grammarAccess.getProvisionAccess().getServiceNameAssignment_1(), "rule__Provision__ServiceNameAssignment_1");
					put(grammarAccess.getProvisionAccess().getProvidersAssignment_4(), "rule__Provision__ProvidersAssignment_4");
					put(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1(), "rule__Statemachine__EventsAssignment_1_1");
					put(grammarAccess.getStatemachineAccess().getCommandsAssignment_2_1(), "rule__Statemachine__CommandsAssignment_2_1");
					put(grammarAccess.getStatemachineAccess().getStatesAssignment_3(), "rule__Statemachine__StatesAssignment_3");
					put(grammarAccess.getEventAccess().getNameAssignment_0(), "rule__Event__NameAssignment_0");
					put(grammarAccess.getEventAccess().getCodeAssignment_1(), "rule__Event__CodeAssignment_1");
					put(grammarAccess.getCommandAccess().getNameAssignment_0(), "rule__Command__NameAssignment_0");
					put(grammarAccess.getCommandAccess().getCodeAssignment_1(), "rule__Command__CodeAssignment_1");
					put(grammarAccess.getStateAccess().getNameAssignment_1(), "rule__State__NameAssignment_1");
					put(grammarAccess.getStateAccess().getActionsAssignment_2_2(), "rule__State__ActionsAssignment_2_2");
					put(grammarAccess.getStateAccess().getTransitionsAssignment_3(), "rule__State__TransitionsAssignment_3");
					put(grammarAccess.getTransitionAccess().getEventAssignment_0_0(), "rule__Transition__EventAssignment_0_0");
					put(grammarAccess.getTransitionAccess().getStateAssignment_0_2(), "rule__Transition__StateAssignment_0_2");
					put(grammarAccess.getTransitionAccess().getEventAssignment_1_0(), "rule__Transition__EventAssignment_1_0");
					put(grammarAccess.getTransitionAccess().getEventactionsAssignment_1_3(), "rule__Transition__EventactionsAssignment_1_3");
					put(grammarAccess.getTransitionAccess().getStateAssignment_1_6(), "rule__Transition__StateAssignment_1_6");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			ausim.xtext.kanban.domainmodel.ui.contentassist.antlr.internal.InternalKanbanmodelParser typedParser = (ausim.xtext.kanban.domainmodel.ui.contentassist.antlr.internal.InternalKanbanmodelParser) parser;
			typedParser.entryRuleKanbanSchedulingSystem();
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
