package easy;

import it.zlays.easy.good_pairs.GoodPairsBottomUp;
import it.zlays.test.SimpleTest;
import it.zlays.test.TestCase;
import org.junit.Test;

public class GoodPairsTest extends SimpleTest<Integer, int[]> {
	
	@Test
	public void GoodPairsBottomUp( ) {
		GoodPairsBottomUp goodpairs = new GoodPairsBottomUp();
		this.equalsAll( goodpairs );
	}
	
	@Override
	public TestCase< Integer, int[] >[] getCases( ) {
		return new TestCase[  ]{
				new TestCase( 4, new int[]{1,2,3,1,1,3} ),
				new TestCase( 6, new int[]{1,1,1,1} ),
				new TestCase( 0, new int[]{1,2,3} )
		};
	}
	
}
