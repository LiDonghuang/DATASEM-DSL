/*
 * generated by Xtext
 */
package datasem.xtext.kanban.domainmodel.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class KanbanmodelAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("datasem/xtext/kanban/domainmodel/parser/antlr/internal/InternalKanbanmodel.tokens");
	}
}
