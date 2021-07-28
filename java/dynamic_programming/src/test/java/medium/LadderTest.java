package medium;

import it.zlays.medium.ladder.LadderUpBottom;
import it.zlays.test.SimpleTest;
import it.zlays.test.TestCase;
import org.junit.Test;

public class LadderTest extends SimpleTest< Long, Integer > {
	
	@Test
	public void LadderUpBottomTest( ) {
		LadderUpBottom ladder = new LadderUpBottom( );
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
