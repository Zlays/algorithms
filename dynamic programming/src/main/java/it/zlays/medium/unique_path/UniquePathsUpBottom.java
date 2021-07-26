package it.zlays.medium.unique_path;

import it.zlays.models.UniquePathInput;
import it.zlays.utils.Tracker;

public class UniquePathsUpBottom extends Tracker< Long, UniquePathInput > {
	
	public Long uniquePaths( int x, int y, long[][] memo ) {
		if ( x == 1 || y == 1 ) return 1L;
		if ( memo[ x ][ y ] == 0L ) memo[ x ][ y ] = uniquePaths( x - 1, y, memo ) + uniquePaths( x, y - 1, memo );
		return memo[ x ][ y ];
	}
	
	@Override
	public Long solution( UniquePathInput arg ) {
		
		long[][] memo = new long[ arg.getX( ) + 1 ][];
		for ( int i = 0; i < memo.length; i++ ) {
			memo[ i ] = new long[ arg.getY( ) + 1 ];
		}
		
		return uniquePaths( arg.getX( ), arg.getY( ), memo );
	}
	
	@Override
	public String getType( ) {
		return "UP BOTTOM";
	}
}
