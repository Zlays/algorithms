package it.zlays.unique_path_obstacle;

import it.zlays.utils.Trackerd;

public class UniquePathsObstacleMemo extends Trackerd< Long, int[][] > {
	
	public Long uniquePathsWithObstacles( int[][] obstacleGrid ) {
		int x = obstacleGrid.length;
		
		if ( x == 0 ) return 1L;
		
		int y = obstacleGrid[ 0 ].length;
		
		long[][] memo = new long[ x ][];
		for ( int i = 0; i < x; i++ ) {
			memo[ i ] = new long[ y ];
		}
		return uniquePathsWithObstacles( obstacleGrid, x - 1, y - 1, memo );
	}
	
	public Long uniquePathsWithObstacles( int[][] obstacleGrid, int x, int y, long[][] memo ) {
		if ( obstacleGrid[ x ][ y ] == 1 ) return 0L;
		if ( x == 0 && y == 0 ) return 1L;
		if ( x > 0 && y > 0 ) {
			if ( memo[ x ][ y ] == 0 )
				memo[ x ][ y ] = uniquePathsWithObstacles( obstacleGrid, x - 1, y, memo ) + uniquePathsWithObstacles( obstacleGrid, x, y - 1, memo );
		} else if ( x > 0 ) {
			if ( memo[ x ][ 0 ] == 0L ) memo[ x ][ y ] = uniquePathsWithObstacles( obstacleGrid, x - 1, y, memo );
		} else if ( memo[ 0 ][ y ] == 0L ) memo[ x ][ y ] = uniquePathsWithObstacles( obstacleGrid, x, y - 1, memo );
		
		return memo[ x ][ y ];
	}
	
	
	@Override
	public Long solution( int[][] arg ) {
		return uniquePathsWithObstacles( arg );
	}
	
	@Override
	public String getType( ) {
		return "MEMO";
	}
}
