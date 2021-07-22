import it.zlays.unique_path_obstacle.UniquePathsObstacleBase;
import it.zlays.unique_path_obstacle.UniquePathsObstacleBottomUp;
import it.zlays.unique_path_obstacle.UniquePathsObstacleMemo;
import org.junit.Test;
import utils.BasicTest;
import utils.TestCase;

public class UniquePathObstacleTest extends BasicTest< Long, int[][] > {
	
	@Test
	public void uniquePathObstacleBaseTest( ) {
		UniquePathsObstacleBase uniquePathsObstacle = new UniquePathsObstacleBase( );
		this.equalsAll( uniquePathsObstacle );
	}
	
	@Test
	public void uniquePathObstacleMemoTest( ) {
		UniquePathsObstacleMemo uniquePathsObstacle = new UniquePathsObstacleMemo( );
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
