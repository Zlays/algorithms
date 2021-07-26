package it.zlays.medium.ladder;

import it.zlays.utils.Tracker;

public class LadderUpBottom extends Tracker< Long, Integer > {
	
	public static long ladder( int length, long[] memo ) {
		if ( length < 0 ) return 0;
		if ( length == 0 ) return 1;
		
		if ( memo[ length ] == 0L )
			memo[ length ] = ladder( length - 1, memo ) + ladder( length - 2, memo ) + ladder( length - 3, memo );
		return memo[ length ];
	}
	
	@Override
	public Long solution( Integer arg ) {
		long[] memo = new long[ arg + 1 ];
		return ladder( arg, memo );
	}
	
	@Override
	public String getType( ) {
		return "UP BOTTOM";
	}
}

