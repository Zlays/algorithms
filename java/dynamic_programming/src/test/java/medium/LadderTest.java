package medium;

import it.zlays.medium.ladder.LadderTopDown;
import it.zlays.test.SimpleTest;
import it.zlays.test.TestCase;
import org.junit.Test;

public class LadderTest extends SimpleTest< Long, Integer > {
	
	@Test
	public void LadderTopDownTest( ) {
		LadderTopDown ladder = new LadderTopDown( );
		this.equalsAll( ladder );
	}
	
	@Override
	public TestCase< Long, Integer >[] getCases( ) {
		return new TestCase[] {
				new TestCase( 1L, 0 ),
				new TestCase( 4L, 3 ),
				new TestCase( 121415L, 20 ),
				new TestCase( 1132436852L, 35 )
		};
	}
}
