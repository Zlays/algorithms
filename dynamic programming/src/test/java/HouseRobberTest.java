import it.zlays.house_robber.HouseRobberBase;
import it.zlays.house_robber.HouseRobberBottomUp;
import it.zlays.house_robber.HouseRobberMemo;
import org.junit.Test;
import utils.BasicTest;
import utils.TestCase;

public class HouseRobberTest extends BasicTest< Long, int[] > {
	
	@Test
	public void houseRobberBaseTest( ) {
		HouseRobberBase houseRobber = new HouseRobberBase( );
		this.equalsAll( houseRobber );
	}
	
	@Test
	public void houseRobberMemoTest( ) {
		HouseRobberMemo houseRobber = new HouseRobberMemo( );
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
