import it.zlays.unique_path.UniquePathsBase;
import it.zlays.unique_path.UniquePathsMemo;
import it.zlays.models.UniquePathInput;
import it.zlays.unique_path.UniquePathsBottomUp;
import org.junit.Assert;
import org.junit.Test;

public class UniquePathTest {
	
	@Test
	public void uniquePathBaseTest( ) {
		UniquePathsBase uniquePathBase = new UniquePathsBase( );
		Assert.assertEquals( 6, ( long ) uniquePathBase.run( new UniquePathInput( 3, 3 ) ) );
		Assert.assertEquals( 28, ( long ) uniquePathBase.run( new UniquePathInput( 3, 7 ) ) );
		Assert.assertEquals( 40116600, ( long ) uniquePathBase.run( new UniquePathInput( 15, 15 ) ) );
		Assert.assertEquals( 818809200, ( long ) uniquePathBase.run( new UniquePathInput( 15, 20 ) ) );
	}
	
	@Test
	public void uniquePathMemoTest( ) {
		UniquePathsMemo uniquePathMemo = new UniquePathsMemo( );
		Assert.assertEquals( 6, ( long ) uniquePathMemo.run( new UniquePathInput( 3, 3 ) ) );
		Assert.assertEquals( 28, ( long ) uniquePathMemo.run( new UniquePathInput( 3, 7 ) ) );
		Assert.assertEquals( 40116600, ( long ) uniquePathMemo.run( new UniquePathInput( 15, 15 ) ) );
		Assert.assertEquals( 818809200, ( long ) uniquePathMemo.run( new UniquePathInput( 15, 20 ) ) );
	}
	
	@Test
	public void uniquePathBottomUpTest( ) {
		UniquePathsBottomUp uniquePathsBottomUp = new UniquePathsBottomUp( );
		Assert.assertEquals( 6, ( long ) uniquePathsBottomUp.run( new UniquePathInput( 3, 3 ) ) );
		Assert.assertEquals( 28, ( long ) uniquePathsBottomUp.run( new UniquePathInput( 3, 7 ) ) );
		Assert.assertEquals( 40116600, ( long ) uniquePathsBottomUp.run( new UniquePathInput( 15, 15 ) ) );
		Assert.assertEquals( 818809200, ( long ) uniquePathsBottomUp.run( new UniquePathInput( 15, 20 ) ) );
	}
}
