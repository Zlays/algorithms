package it.zlays.medium.unique_path_obstacle;

import it.zlays.utils.Trackerd;

public class UniquePathsObstacleBase extends Trackerd< Long, int[][] > {
	
	public Long uniquePathsWithObstacles( int[][] obstacleGrid ) {
		int x = obstacleGrid.length;
		
		if ( x == 0 ) return 1L;
		
		int y = obstacleGrid[ 0 ].length;
		
		return uniquePathsWithObstacles( obstacleGrid, x - 1, y - 1 );
	}
	
	public Long uniquePathsWithObstacles( int[][] obstacleGrid, int x, int y ) {
		if ( obstacleGrid[ x ][ y ] == 1 ) return 0L;
		if ( x == 0 && y == 0 ) return 1L;
		if ( x > 0 && y > 0 )
			return uniquePathsWithObstacles( obstacleGrid, x - 1, y ) + uniquePathsWithObstacles( obstacleGrid, x, y - 1 );
		else if ( x > 0 )
			return uniquePathsWithObstacles( obstacleGrid, x - 1, y );
		else return uniquePathsWithObstacles( obstacleGrid, x, y - 1 );
	}
	
	
	@Override
	public Long solution( int[][] arg ) {
		return uniquePathsWithObstacles( arg );
	}
	
	@Override
	public String getType( ) {
		return "BASE";
	}
}
