package medium;

import it.zlays.medium.generate_Parenthesis.GenerateParenthesisUpBottom;
import org.junit.Test;
import utils.BasicTest;
import utils.TestCase;

import java.util.Arrays;
import java.util.List;

public class GenerateParentesisTest extends BasicTest< List< String >, Integer > {
	
	@Test
	public void generateParenthesisUpBottom( ) {
		GenerateParenthesisUpBottom generateParenthesis = new GenerateParenthesisUpBottom( );
		this.equalsAll( generateParenthesis );
	}
	
	@Override
	public TestCase< List< String >, Integer >[] getCases( ) {
		return new TestCase[] {
				new TestCase( Arrays.asList( "()" ), 1 ),
				new TestCase( Arrays.asList( "()()", "(())" ), 2 ),
				new TestCase( Arrays.asList( "((()))", "(()())", "(())()", "()(())", "()()()" ), 3 )
		};
	}
}
