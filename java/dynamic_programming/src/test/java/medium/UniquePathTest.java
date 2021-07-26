package medium;

import it.zlays.medium.unique_path.UniquePathsBottomUp;
import it.zlays.medium.unique_path.UniquePathsUpBottom;
import it.zlays.models.UniquePathInput;
import org.junit.Test;
import utils.BasicTest;
import utils.TestCase;

public class UniquePathTest extends BasicTest< Long, UniquePathInput > {
	
	
	@Test
	public void uniquePathUpBottomTest( ) {
		UniquePathsUpBottom uniquePaths = new UniquePathsUpBottom( );
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
