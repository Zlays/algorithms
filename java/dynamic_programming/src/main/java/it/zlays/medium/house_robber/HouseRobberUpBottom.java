package it.zlays.medium.house_robber;


import it.zlays.Tracker;

public class HouseRobberUpBottom extends Tracker< Long, int[] > {
	
	public Long houseRobber( int[] arg ) {
		int x = arg.length;
		if ( x == 0 ) return 0L;
		
		Long sum = 0L;
		long[] memo = new long[ x ];
		return Math.max( houseRobber( arg, 0, sum, memo ), houseRobber( arg, 1, sum, memo ) );
	}
	
	public Long houseRobber( int[] arg, int position, Long sum, long[] memo ) {
		if ( position >= arg.length ) return sum;
		sum += arg[ position ];
		
		if ( memo[ position ] == 0 )
			memo[ position ] = Math.max( houseRobber( arg, position + 2, sum, memo ), houseRobber( arg, position + 3, sum, memo ) );
		
		return memo[ position ];
	}
	
	@Override
	public Long solution( int[] arg ) {
		return houseRobber( arg );
	}
	
	@Override
	public String getType( ) {
		return "UP BOTTOM";
	}
}
