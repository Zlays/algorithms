package it.zlays.medium.house_robber;


import it.zlays.Tracker;

public class HouseRobberBottomUp extends Tracker< Long, int[] > {
	
	public Long houseRobber( int[] arg ) {
		int x = arg.length;
		if ( x == 0 ) return 0L;
		if ( x == 1 ) return ( long ) arg[ 0 ];
		
		int[] memo = new int[ 3 ];
		memo[ 0 ] = arg[ 0 ];
		memo[ 1 ] = Math.max( arg[ 0 ], arg[ 1 ] );
		
		for ( int i = 2; i < x; i++ ) {
			memo[ i % 3 ] = Math.max( memo[ ( i - 1 ) % 3 ], memo[ ( i - 2 ) % 3 ] + arg[ i ] );
		}
		
		return ( long ) memo[ ( ( x - 1 ) % 3 ) ];
	}
	
	
	@Override
	public Long solution( int[] arg ) {
		return houseRobber( arg );
	}
	
	@Override
	public String getType( ) {
		return "BOTTOM UP";
	}
}
