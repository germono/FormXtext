/*
 * generated by Xtext 2.21.0
 */
package oliv.form.xtext.fix.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FixAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("oliv/form/xtext/fix/parser/antlr/internal/InternalFix.tokens");
	}
}
