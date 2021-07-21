import it.zlays.unique_path_obstacle.UniquePathsObstacleBase;
import it.zlays.unique_path_obstacle.UniquePathsObstacleMemo;
import org.junit.Assert;
import org.junit.Test;

public class UniquePathObstacleTest {
	
	@Test
	public void uniquePathObstacleBaseTest( ) {
		UniquePathsObstacleBase uniquePathsObstacleBase = new UniquePathsObstacleBase( );
		
		int[][] grid = { { 0 } };
		Assert.assertEquals( 1, ( long ) uniquePathsObstacleBase.run( grid ) );
		grid = new int[][] { { 1 } };
		Assert.assertEquals( 0, ( long ) uniquePathsObstacleBase.run( grid ) );
		grid = new int[][] { { 1 }, { 0 } };
		Assert.assertEquals( 0, ( long ) uniquePathsObstacleBase.run( grid ) );
		grid = new int[][] { { 0, 0 }, { 0, 0 } };
		Assert.assertEquals( 2, ( long ) uniquePathsObstacleBase.run( grid ) );
		grid = new int[][] { { 0, 0 }, { 1,1 },{ 0, 0 } };
		Assert.assertEquals( 0, ( long ) uniquePathsObstacleBase.run( grid ) );
		grid = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		Assert.assertEquals( 2, ( long ) uniquePathsObstacleBase.run( grid ) );
	}
	
	@Test
	public void uniquePathObstacleMemoTest( ) {
		UniquePathsObstacleMemo uniquePathsObstacleMemo = new UniquePathsObstacleMemo( );
		
		int[][] grid = { { 0 } };
		Assert.assertEquals( 1, ( long ) uniquePathsObstacleMemo.run( grid ) );
		grid = new int[][] { { 1 } };
		Assert.assertEquals( 0, ( long ) uniquePathsObstacleMemo.run( grid ) );
		grid = new int[][] { { 1 }, { 0 } };
		Assert.assertEquals( 0, ( long ) uniquePathsObstacleMemo.run( grid ) );
		grid = new int[][] { { 0, 0 }, { 0, 0 } };
		Assert.assertEquals( 2, ( long ) uniquePathsObstacleMemo.run( grid ) );
		grid = new int[][] { { 0, 0 }, { 1,1 },{ 0, 0 } };
		Assert.assertEquals( 0, ( long ) uniquePathsObstacleMemo.run( grid ) );
		grid = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		Assert.assertEquals( 2, ( long ) uniquePathsObstacleMemo.run( grid ) );
	}
	
}
