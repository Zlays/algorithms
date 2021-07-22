package it.zlays.medium.house_robber;

import it.zlays.utils.Trackerd;

public class HouseRobberBase extends Trackerd< Long, int[] > {
	
	public Long houseRobber( int[] arg ) {
		int x = arg.length;
		if ( x == 0 ) return 0L;
		Long sum = 0L;
		return Math.max( houseRobber( arg, 0, sum ), houseRobber( arg, 1, sum ) );
		
	}
	
	public Long houseRobber( int[] arg, int position, Long sum ) {
		if ( position >= arg.length ) return sum;
		sum += arg[ position ];
		return Math.max( houseRobber( arg, position + 2, sum ), houseRobber( arg, position + 3, sum ) );
	}
	
	@Override
	public Long solution( int[] arg ) {
		return houseRobber( arg );
	}
	
	@Override
	public String getType( ) {
		return "BASE";
	}
}
