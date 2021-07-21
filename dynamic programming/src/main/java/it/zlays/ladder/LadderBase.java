package it.zlays.ladder;

import it.zlays.utils.Trackerd;

public class LadderBase extends Trackerd< Long, Integer > {
	
	public static long ladder( int length ) {
		if ( length < 0 ) return 0;
		if ( length == 0 ) return 1;
		
		return ladder( length - 1 ) + ladder( length - 2 ) + ladder( length - 3 );
	}
	
	@Override
	public Long solution( Integer arg ) {
		return ladder( arg );
	}
	
	@Override
	public String getType( ) {
		return "BASE";
	}
}

