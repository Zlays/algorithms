package medium;

import it.zlays.models.UniquePathInput;
import it.zlays.medium.unique_path.UniquePathsBase;
import it.zlays.medium.unique_path.UniquePathsBottomUp;
import it.zlays.medium.unique_path.UniquePathsMemo;
import org.junit.Test;
import utils.BasicTest;
import utils.TestCase;

public class UniquePathTest extends BasicTest< Long, UniquePathInput > {
	
	@Test
	public void uniquePathBaseTest( ) {
		UniquePathsBase uniquePaths = new UniquePathsBase( );
		this.equalsAll( uniquePaths );
	}
	
	@Test
	public void uniquePathMemoTest( ) {
		UniquePathsMemo uniquePaths = new UniquePathsMemo( );
		this.equalsAll( uniquePaths );
	}
	
	@Test
	public void uniquePathBottomUpTest( ) {
		UniquePathsBottomUp uniquePaths = new UniquePathsBottomUp( );
		this.equalsAll( uniquePaths );
	}
	
	@Override
	public TestCase< Long, UniquePathInput >[] getCases( ) {
		return new TestCase[] {
				new TestCase( 6L, new UniquePathInput( 3, 3 ) ),
				new TestCase( 28L, new UniquePathInput( 3, 7 ) ),
				new TestCase( 40116600L, new UniquePathInput( 15, 15 ) ),
				new TestCase( 818809200L, new UniquePathInput( 15, 20 ) )
		};
	}
}
