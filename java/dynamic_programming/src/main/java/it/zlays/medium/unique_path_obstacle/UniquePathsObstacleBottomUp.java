package it.zlays.medium.unique_path_obstacle;


import it.zlays.Tracker;

public class UniquePathsObstacleBottomUp extends Tracker< Long, int[][] > {
	
	public Long uniquePathsWithObstacles( int[][] obstacleGrid ) {
		int x = obstacleGrid.length;
		
		if ( x == 0 ) return 1L;
		
		int y = obstacleGrid[ 0 ].length;
		
		if ( y == 0 ) return 1L;
		if ( obstacleGrid[ x - 1 ][ y - 1 ] == 1 ) return 0L;
		
		for ( int i = 0; i < x; i++ ) {
			if ( obstacleGrid[ i ][ 0 ] != 0 ) break;
			obstacleGrid[ i ][ 0 ] = - 1;
		}
		
		for ( int i = 1; i < y; i++ ) {
			if ( obstacleGrid[ 0 ][ i ] != 0 ) break;
			obstacleGrid[ 0 ][ i ] = - 1;
		}
		
		if ( obstacleGrid[ 0 ][ 0 ] == 1 ) return 0L;
		
		for ( int i = 1; i < x; i++ ) {
			for ( int j = 1; j < y; j++ ) {
				if ( obstacleGrid[ i ][ j ] == 1 ) {
					continue;
				}
				obstacleGrid[ i ][ j ] = (
						obstacleGrid[ i - 1 ][ j ] != 1 ?
								obstacleGrid[ i - 1 ][ j ] :
								0
				) + (
						obstacleGrid[ i ][ j - 1 ] != 1 ?
								obstacleGrid[ i ][ j - 1 ] :
								0
				);
			}
		}
		
		return ( long ) - obstacleGrid[ x - 1 ][ y - 1 ];
	}
	
	@Override
	public Long solution( int[][] arg ) {
		return uniquePathsWithObstacles( arg );
	}
	
	@Override
	public String getType( ) {
		return "BOTTOM UP";
	}
}
