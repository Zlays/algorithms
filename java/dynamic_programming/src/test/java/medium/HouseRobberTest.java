package medium;

import it.zlays.medium.house_robber.HouseRobberBottomUp;
import it.zlays.medium.house_robber.HouseRobberTopDown;
import it.zlays.test.SimpleTest;
import it.zlays.test.TestCase;
import org.junit.Test;

public class HouseRobberTest extends SimpleTest< Long, int[] > {
	
	
	@Test
	public void houseRobberTopDownTest( ) {
		HouseRobberTopDown houseRobber = new HouseRobberTopDown( );
		this.equalsAll( houseRobber );
	}
	
	@Test
	public void houseRobberBottomUpTest( ) {
		HouseRobberBottomUp houseRobber = new HouseRobberBottomUp( );
		this.equalsAll( houseRobber );
	}
	
	@Override
	public TestCase< Long, int[] >[] getCases( ) {
		TestCase< Long, int[] >[] testCases = new TestCase[] {
				new TestCase<>( 2L, new int[] { 1, 2 } ),
				new TestCase<>( 4L, new int[] { 1, 2, 3, 1 } ),
				new TestCase<>( 12L, new int[] { 2, 7, 9, 3, 1 } ),
		};
		return testCases;
	}
}
