package it.zlays.fibonacci;

import it.zlays.utils.Trackerd;

public class FibonacciBase extends Trackerd< Long, Integer > {
	
	public static long fibonacciBase( int value ) {
		if ( value == 0 ) return 0;
		if ( value == 1 ) return 1;
		
		return fibonacciBase( value - 1 ) + fibonacciBase( value - 2 );
	}
	
	@Override
	public Long solution( Integer arg ) {
		return fibonacciBase( arg );
	}
	
	@Override
	public String getType( ) {
		return "BASE";
	}
}

