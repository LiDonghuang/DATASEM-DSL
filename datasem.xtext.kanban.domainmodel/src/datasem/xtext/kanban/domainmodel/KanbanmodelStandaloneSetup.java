/*
 * generated by Xtext
 */
package datasem.xtext.kanban.domainmodel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class KanbanmodelStandaloneSetup extends KanbanmodelStandaloneSetupGenerated{

	public static void doSetup() {
		new KanbanmodelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

