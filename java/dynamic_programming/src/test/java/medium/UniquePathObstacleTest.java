package medium;

import it.zlays.medium.unique_path_obstacle.UniquePathsObstacleBottomUp;
import it.zlays.medium.unique_path_obstacle.UniquePathsObstacleTopDown;
import it.zlays.test.SimpleTest;
import it.zlays.test.TestCase;
import org.junit.Test;

public class UniquePathObstacleTest extends SimpleTest< Long, int[][] > {
	
	
	@Test
	public void uniquePathObstacleTopDownTest( ) {
		UniquePathsObstacleTopDown uniquePathsObstacle = new UniquePathsObstacleTopDown( );
		this.equalsAll( uniquePathsObstacle );
	}
	
	@Test
	public void uniquePathObstacleBottomUpTest( ) {
		UniquePathsObstacleBottomUp uniquePathsObstacle = new UniquePathsObstacleBottomUp( );
		this.equalsAll( uniquePathsObstacle );
	}
	
	@Override
	public TestCase< Long, int[][] >[] getCases( ) {
		return new TestCase[] {
				new TestCase( 1L, new int[][] { { 0 } } ),
				new TestCase( 0L, new int[][] { { 1 } } ),
				new TestCase( 0L, new int[][] { { 1 }, { 0 } } ),
				new TestCase( 0L, new int[][] { { 0 }, { 1 } } ),
				new TestCase( 2L, new int[][] { { 0, 0 }, { 0, 0 } } ),
				new TestCase( 0L, new int[][] { { 0, 0 }, { 1, 1 }, { 0, 0 } } ),
				new TestCase( 2L, new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } } )
		};
	}
}
