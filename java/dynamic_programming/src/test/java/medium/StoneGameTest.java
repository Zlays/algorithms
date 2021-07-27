package medium;

import it.zlays.medium.stone_game.StoneGameBottomUp;
import it.zlays.medium.stone_game.StoneGameUpBottom;
import org.junit.Test;
import utils.BasicTest;
import utils.TestCase;

public class StoneGameTest extends BasicTest< Boolean, int[] > {
	
	@Test
	public void stoneGameUpBottom( ) {
		StoneGameUpBottom stoneGame = new StoneGameUpBottom( );
		this.equalsAll( stoneGame );
	}
	
	@Test
	public void stoneGameBottomUp( ) {
		StoneGameBottomUp stoneGame = new StoneGameBottomUp( );
		this.equalsAll( stoneGame );
	}
	
	@Override
	public TestCase< Boolean, int[] >[] getCases( ) {
		return new TestCase[] {
				new TestCase( true, new int[] { 5, 4, 4, 5 } ),
				new TestCase( true, new int[] { 5, 1, 1, 1, 4, 5 } )
		};
	}
	
}
