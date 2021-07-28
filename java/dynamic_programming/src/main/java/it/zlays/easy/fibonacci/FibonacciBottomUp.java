package it.zlays.easy.fibonacci;


import it.zlays.Tracker;

public class FibonacciBottomUp extends Tracker< Long, Integer > {
	
	public Long fibonacci( int value ) {
		
		if ( value == 0 ) return 0L;
		if ( value == 1 ) return 1L;
		
		long[] memo = new long[ 3 ];
		memo[ 1 ] = 1;
		memo[ 2 ] = 1;
		
		for ( int i = 3; i <= value; i++ ) {
			memo[ i % 3 ] = memo[ ( i - 1 ) % 3 ] + memo[ ( i - 2 ) % 3 ];
		}
		
		return memo[ ( value % 3 ) ];
	}
	
	@Override
	public Long solution( Integer arg ) {
		return fibonacci( arg );
	}
	
	@Override
	public String getType( ) {
		return "BOTTOM UP";
	}
}

