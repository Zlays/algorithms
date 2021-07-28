package easy;

import it.zlays.easy.divisor_game.DivisorGame;
import org.junit.Test;
import it.zlays.test.SimpleTest;
import it.zlays.test.TestCase;

public class DivisorGameTest extends SimpleTest< Boolean, Integer > {
	
	@Test
	public void divisorGameTest( ) {
		DivisorGame divisorGame = new DivisorGame( );
		this.equalsAll( divisorGame );
	}
	
	@Override
	public TestCase< Boolean, Integer >[] getCases( ) {
		return new TestCase[] {
				new TestCase( false, 1 ),
				new TestCase( true, 2 ),
				new TestCase( false, 3 ),
				new TestCase( true, 4 )
		};
	}
}
