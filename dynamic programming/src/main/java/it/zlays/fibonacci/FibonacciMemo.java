package it.zlays.fibonacci;

import it.zlays.utils.Trackerd;

public class FibonacciMemo extends Trackerd< Long, Integer > {
	
	public static long fibonacciMemo( Integer value, long[] memo ) {
		if ( value == 0 ) return 0;
		if ( value == 1 ) return 1;
		
		if ( memo[ value ] == 0L ) memo[ value ] = fibonacciMemo( value - 1, memo ) + fibonacciMemo( value - 2, memo );
		return memo[ value ];
	}
	
	public Long solution( Integer arg ) {
		long[] memo = new long[ arg + 1 ];
		return fibonacciMemo( arg, memo );
	}
	
	@Override
	public String getType( ) {
		return "MEMO";
	}
	
}

