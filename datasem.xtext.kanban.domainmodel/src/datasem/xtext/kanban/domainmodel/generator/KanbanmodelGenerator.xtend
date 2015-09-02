/*
 * generated by Xtext
 */
package datasem.xtext.kanban.domainmodel.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import datasem.xtext.kanban.domainmodel.kanbanmodel.*
import java.util.Random
import java.util.List
import org.eclipse.emf.common.util.EList
import datasem.xtext.kanban.domainmodel.kanbanmodel.KanbanmodelFactory
import java.text.DecimalFormat

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class KanbanmodelGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	fsa.generateFile(resource.allContents.toIterable.filter(ModelBuilder).get(0).getExperimentModel.name+"_ExperimentModel.xml", 
		compile(resource)
	)	
//	fsa.generateFile("UserLibraries.xml", compileUserLibraries(resource))	
	}


// --------------------------------------------------------------------------
def compile(Resource res) '''	
«FOR emodel : res.allContents.toIterable.filter(ExperimentModel)»
<ExperimentModel experimentId="0" name="«emodel.name»" description="xxx">
«««	<FileName>"«emodel.name»"</FileName>
«««	<FilePath>"«emodel.path»"</FilePath>
«printIndicators(emodel.indicators)»
«ENDFOR»
«FOR ulib : res.allContents.toIterable.filter(UserLibraries)»	
	«printWorkItemTypes(ulib.getWorkItemTypes())»
	«printServices(ulib.getServices())»
	«printClassOfServices(ulib.getClassOfServices())»	
«ENDFOR»
«FOR emodel : res.allContents.toIterable.filter(ExperimentModel)»		
	<Runs>
	<Run runId="1" description="xx" numberOfReplications="10" numberOfSteps="10000">
		<OrganizationalModel>
		«assignServiceProvidersId(emodel.getServiceProviders())»	
		<ServiceProviders>
		«FOR sp : emodel.getServiceProviders()»  
			«printServiceProvider(sp)»
		«ENDFOR»
		</ServiceProviders>
		</OrganizationalModel>
		<WorkItemNetworkModel>		
		<WorkSources>
		«FOR ws : emodel.getWorkSources()»
			«printWorkSource(ws)»
		«ENDFOR»	
		</WorkSources>	
		<WorkItems>
		«buildWorkItems(emodel)»
		</WorkItems>
		</WorkItemNetworkModel>
	«ENDFOR»
	</Run>
	</Runs>
</ExperimentModel>	
'''
// --------------------------------------------------------------------------

	def printServices(EList<Service> ss) '''
		<Services>
		«var id=1»
		«FOR s : ss»		
			«s.setId(id++)»	
			<Service serviceId="«s.id»" name="«s.name»" description="«s.description»"></Service>
		«ENDFOR»
		</Services>
	'''	
	def printClassOfServices(EList<ClassOfService> cs) '''
		<ClassOfServices>
		«var id=1»
		«FOR c : cs»
			«c.setId(id++)»	
			<ClassOfService cosId="«c.id»" name="«c.name»" description="«c.description»" isDisruptive="«c.isDisruptive()»"></ClassOfService>
		«ENDFOR»
		</ClassOfServices>
	'''	
	def printWorkItemTypes(EList<WorkItemType> ts) '''
		<WorkItemTypes>
		«var id=1»
		«FOR t : ts»
			«t.setId(id++)»	
			<WorkItemType wiTypeId="«t.id»" name="«t.name»" description="«t.description»"></WorkItemType>
		«ENDFOR»
		</WorkItemTypes>
	'''	
	def printIndicators(Indicators is) '''
		«FOR i : is.indicators»
		<Indicator name="«i»"></Indicator>
		«ENDFOR»
	'''
	def printGovernanceStrategy(GovernanceStrategy govs) '''
		«FOR m: govs.getMechanisms()»
		 	«printMechanism(m)»
		«ENDFOR»
	'''
	def printMechanism(Mechanism m) '''
		<Mechanism name="«m.name»" value="«m.value»">
		«FOR a: m.getAttributes()»
			<Attribute name="«a.attribute»" value="«a.value»"></Attribute> 
		«ENDFOR»
		</Mechanism>
	'''
	def assignServiceProvidersId(EList<ServiceProvider> sps) '''
		«var serviceProviderId=1»
		«var resourceId=1»
		«FOR sp: sps»
			«sp.setId(serviceProviderId++)»
			«FOR r: sp.getResources()»
				«r.setId(resourceId++)»
			«ENDFOR»
		«ENDFOR»
	'''
	

	def buildWorkItems(ExperimentModel emodel) '''
		«var winId=1»
		«FOR win: emodel.workItemNetworks»
			«win.setId(winId++)»
		«ENDFOR»
		«var wiId=1»
		«FOR winRS: emodel.WINReplicationSetting.WINReplications» 
			«FOR r : 0..winRS.numReplications» 
		    	«FOR wi : winRS.workItemNetwork.workItems »
		    		«wi.setId(wiId++)»
		    	«ENDFOR»
		    	«FOR wi : winRS.workItemNetwork.workItems »
		    		«printWorkItem(wi)»
		    	«ENDFOR»
		    «ENDFOR»
		«ENDFOR»    	
	'''
		
//    def printWI(ExperimentModel emodel,WorkItem wi) {
//    	var winId=1
//		for (win: emodel.workItemNetworks) {
//			win.setId(winId++)
//		}
//		var wiId=1
//		for (winRS: emodel.WINReplicationSetting.WINReplications) { 
//			for (var r = 0 ; r < winRS.numReplications ; r++) {
//		    	for (w : winRS.workItemNetwork.workItems) {
//		    		wi.setId(wiId++)
//		    	}
//		    	for (w : winRS.workItemNetwork.workItems) {
//		    	}
//		    }
//		}
//      	switch wi {     
//      	WorkItem : '''
//      	<WorkItem wiId=«wi.id» name="«wi.name»" typeId=«wi.getType.id» cosId=«wi.getClassOfService.id» efforts=«wi.efforts» value=«wi.value» isAggregationNode=«wi.isAggregationNode» hasPredecessors=«wi.hasPredecessors»>
//      	«IF	wi.hasPredecessors»
//			<Predecessors>
//			«FOR ptask : wi.getPTasks()»
//				<WorkItem workItemId=«ptask.id» name=«ptask.name»</WorkItem>
//			«ENDFOR»	
//			</Predecessors>
//			«ENDIF»	
//			«IF	wi.isAggregationNode»
//			<Subtasks>
//			«FOR stask : wi.getSTasks()»				
//				<WorkItem workItemId=«stask.id» name=«stask.name»</WorkItem>
//			«ENDFOR»		
//			</Subtasks>
//			«ENDIF»
//			<RequiredServices>
//			«FOR rs : wi.getRequiredServices()»	
//			<Service serviceId=«rs.id»></Service>
//			«ENDFOR»
//			</RequiredServices>
//		</WorkItem>
//		'''
//      }
//    }	
    
	def assignWorkItemsId(WorkItemNetwork win, int startId) '''
		«var wiId=startId»
		«FOR wi: win.getWorkItems()»
			«wi.setId(wiId++)»
		«ENDFOR»
		
	'''
	

	def getNumValue(NumExpression e) {
		var numValue = 0.0
		if (e!=null) {
			if (e.isDistribution) {
				numValue = sampleDistribution(e)
				numValue =Double.parseDouble(new DecimalFormat("##.##").format(numValue));
			}
			else {numValue=e.numValue}
		}
		return numValue
	}


	def sampleDistribution(NumExpression e) {
		var sampledValue = 0.0
		if (e.numDist.isNormal) {
			var double mean=Double.parseDouble(e.numDist.getParameters.get(0))
			var double stdev=Double.parseDouble(e.numDist.getParameters.get(1))
			var double rand = new Random().nextGaussian()
			sampledValue = mean + stdev*rand
		}	
		else if (e.numDist.isUniform) {
			var double ll=Double.parseDouble(e.numDist.getParameters.get(0))
			var double ul=Double.parseDouble(e.numDist.getParameters.get(1))
			var double rand = new Random().nextDouble()
			sampledValue = ll + (ul-ll)*rand
		}	
		return sampledValue
	}
		

	def printServiceProvider(ServiceProvider sp) '''
			<ServiceProvider serviceProviderId="«sp.id»" name="«sp.name»" description="«sp.description»">
				<AssignWITo>
				«FOR tu : sp.getAssignTo()»
					<serviceProviderId>«tu.id»</serviceProviderId>
				«ENDFOR»
				</AssignWITo>
				<BorrowResourceFrom>
				«FOR tu : sp.getOutsourceFrom()»
					<serviceProviderId>«tu.id»</serviceProviderId>
				«ENDFOR»
				</BorrowResourceFrom>
				<TeamService serviceId="«sp.teamService.id»"></TeamService>	
				<GovernanceStrategy>
					<Mechanisms>
					«FOR m:sp.governanceStrategy.mechanisms»
						«printMechanism(m)»
					«ENDFOR»
					</Mechanisms>		
«««					<AcceptanceRule>«sp.governanceStrategy.getWIAcceptanceRule.type.name»</AcceptanceRule>
«««					<SelectionRule>«sp.governanceStrategy.getWISelectionRule.type.name»</SelectionRule>
«««					<AssignmentRule>«sp.governanceStrategy.getWIAssignmentRule.type.name»</AssignmentRule>
«««					<AllocationRule>«sp.governanceStrategy.getResourceAllocationRule.type.name»</AllocationRule>
«««					<OutsourcingRule>«sp.governanceStrategy.getResourceOutsourcingRule.type.name»</OutsourcingRule>						
				</GovernanceStrategy>	
				<Resources>
				«FOR r : sp.getResources()» 
					«printResource(r)»
				«ENDFOR»
				</Resources>	
			</ServiceProvider>
	'''
	def printResource(Asset r) '''
			<Resource resourceId="«r.id»" name="«r.name»" description="«r.description»">
				<SkillSet>
				«FOR s : r.getSkillSet()» 
					«printSkill(s)»
				«ENDFOR»	
				</SkillSet>	
			</Resource>	
	'''	
	def printSkill(Skill s) '''
			<Skill serviceId="«s.service.id»" name="«s.service.name»" efficiency="«Math.max(getNumValue(s.efficiency),0)»"></Skill>
	'''

	def printWorkSource(WorkSource ws) '''
			<WorkSource name="«ws.name»" description="«ws.description»">
				<AssignWITo>
				«FOR tu : ws.getAssignTo()»
					<serviceProviderId>«tu.id»</serviceProviderId>
				«ENDFOR»
				</AssignWITo>
«««				«IF ws.getAssignmentRule() != null»
«««				<AssignmentRule>«ws.getAssignmentRule().type.name»</AssignmentRule>						
«««				«ELSE»
«««				<AssignmentRule>«"null"»</AssignmentRule>
«««				«ENDIF»				
			</WorkSource>
	'''
	def printWorkItem(WorkItem wi) '''
			<WorkItem wiId="«wi.id»" name="«wi.name»" typeId="«wi.getType.id»" cosId="«wi.getClassOfService.id»" efforts="«Math.max(getNumValue(wi.efforts),0)»" value="«Math.max(getNumValue(wi.value),0)»" isAggregationNode="«wi.isAggregationNode»" hasPredecessors="«wi.hasPredecessors»">
				«IF	wi.hasPredecessors»
				<Predecessors>
				«FOR ptask : wi.getPTasks()»
					<workItemId>«ptask.id»</workItemId>
				«ENDFOR»	
				</Predecessors>
				«ENDIF»	
				«IF	wi.isAggregationNode»
				<Subtasks>
				«FOR stask : wi.getSTasks()»				
					<workItemId>«stask.id»</workItemId>
				«ENDFOR»		
				</Subtasks>
				«ENDIF»	
«««				<CausalTriggers>
«««				«FOR cs : wi.getCausalTriggers()»
«««					<CausalTrigger>
«««					«FOR ttask : cs.getTriggered()»
«««						<Triggered>«ttask.name»</Triggered>
«««					«ENDFOR»
«««						<AtProgress>«cs.getAtProgress»</AtProgress>
«««						<OnProbability>«cs.getOnProbability»</OnProbability>
«««					</CausalTrigger>
«««				«ENDFOR»	
«««				</CausalTriggers>
				<RequiredServices>
				«FOR rs : wi.getRequiredServices()»	
				<serviceId>«rs.id»</serviceId>
				«ENDFOR»
				</RequiredServices>
«««				<ClassOfService>«wi.classOfService.name»</ClassOfService>
«««				<Efforts>«wi.efforts»</Efforts>
«««				<Value>«wi.value»</Value>	
«««				«IF wi.getWorkSource() != null» 
«««				<Source>«wi.getWorkSource().name»</Source>
«««				«ELSE»
«««				<Source>«"null"»</Source>
«««				 «ENDIF»
«««				<ArrivalTime>«wi.arrivalTime»</ArrivalTime>
«««				<DueDate>«wi.dueDate»</DueDate>
			</WorkItem>
	'''
	

	
//	def compileUserLibraries(Resource res) '''
//		<UserLibraries>		
//			<WorkItemPattern>
//			«FOR th : res.allContents.toIterable.filter(TaskHierarchy)» 
//				<WorkItemHierarchy>
//					<Name>«th.name»</Name>
//					<Description>«th.description»</Description>
//					<WorkItemTypes>
//						«FOR tt :th.getTaskTypes()» 
//							«printTaskType(tt)»
//						«ENDFOR»	
//					<WorkItemTypes>	
//				</WorkItemHierarchy>
//			«ENDFOR»
//			</WorkItemPattern>
//			<Services>
//			«FOR stype : res.allContents.toIterable.filter(Service)» 
//				«printService(stype)»
//			«ENDFOR»
//			</Services>
//			<WorkItemTypes>
//			«FOR th : res.allContents.toIterable.filter(TaskHierarchy)» 
//				«FOR tt :th.getTaskTypes()» 
//					«printTaskType(tt)»
//				«ENDFOR»	
//			</WorkItemHierarchy>
//			«ENDFOR»
//			</WorkItemTypes>
//			<ClassesOfService>
//			«FOR cos : res.allContents.toIterable.filter(ClassOfService)» 
//				«printClassOfService(cos)»
//			«ENDFOR»
//			</ClassesOfService>
//			<GovernanceStrategies>
//				«FOR stg : res.allContents.toIterable.filter(GovernanceStrategy)» 
//				<GovernanceStrategy>
//					<Name>«stg.name»</Name>
//					<Description>«stg.description»</Description>					
//					<AcceptanceRule>«stg.getWIAcceptanceRule.type.name»</AcceptanceRule>
//					<SelectionRule>«stg.getWISelectionRule.type.name»</SelectionRule>
//					<AssignmentRule>«stg.getWIAssignmentRule.type.name»</AssignmentRule>
//					<AllocationRule>«stg.getResourceAllocationRule.type.name»</AllocationRule>
//					<OutsourcingRule>«stg.getResourceOutsourcingRule.type.name»</OutsourcingRule>
//				</GovernanceStrategy>
//				«ENDFOR»
//			</GovernanceStrategies>
//			<WorkItemRepositories>
//			«FOR repository : res.allContents.toIterable.filter(Repository)»
//				«printRepository(repository)»
//			«ENDFOR»
//			</WorkItemRepositories>
//		
//			<ValueFunctions>
//				«FOR vf : res.allContents.toIterable.filter(ValueFunction)» 
//				<ValueFunction>
//					<Name>«vf.name»</Name>
//					<Description>«vf.description»</Description>
//				</ValueFunction>
//				«ENDFOR»
//			</ValueFunctions>
//				
//		</UserLibraries>
//	'''	
	//	def printRepository(Repository repository) '''
//			<Repository>
//				<Type>«repository.type.name»</Type>
//				<Profiles>
//				«FOR p : repository.getProfiles()» 
//					«printWorkItemProfile(p)»
//				«ENDFOR»
//				</Profiles>
//				<Rules> </Rules>
//			</Repository>
//			'''
//			
//	def printWorkItemProfile(WorkItemProfile p) '''
//			<Profile>
//				<Name>«p.name»</Name>
//				<Description>«p.name»</Description>
//				<References> 
//				«FOR wc : p.getReferences()»  
//					«printWorkReference(wc)»
//				«ENDFOR»
//				</References>
//				<Decompositions> 
//				«FOR wd : p.getDecompositions()»  
//					«printWorkDecomposition(wd)»
//				«ENDFOR»
//				</Decompositions>
//				<RequiredServices>
//				«FOR rs : p.getRequiredServices()»	
//				<Service>«rs.name»</Service>
//				«ENDFOR»
//				<RequiredServices>
//				<ClassOfService> 
//				</ClassOfService>
//				<Efforts>
//					«printNumExpression(p.efforts)»
//				</Efforts>
//				<Value>
//					«printNumExpression(p.value)»
//				</Value>
//				<Rules> </Rules>
//			</Profile>
//	'''
//	
//	def printWorkReference(WorkReference wr) '''
//			<Reference>
//				<WorkItem>«wr.workItem.name»</WorkItem>
//				<Quantity>
//					«printNumExpression(wr.quantity)»
//				</Quantity>
//			</Reference>
//	'''	
//	
//	def printWorkDecomposition(WorkDecomposition wd) '''
//			<Decomposition>
//				<WorkItem>«wd.workItem.name»</WorkItem>
//				<Quantity>
//					«printNumExpression(wd.quantity)»
//				</Quantity>
//			</Decomposition>
//	'''	
}

