package it.zlays.easy.fibonacci;


import it.zlays.Tracker;

public class FibonacciTopDown extends Tracker< Long, Integer > {
	
	public long fibonacci( Integer value, long[] memo ) {
		if ( value == 0 ) return 0;
		if ( value == 1 ) return 1;
		
		if ( memo[ value ] == 0L ) memo[ value ] = fibonacci( value - 1, memo ) + fibonacci( value - 2, memo );
		return memo[ value ];
	}
	
	public Long solution( Integer arg ) {
		long[] memo = new long[ arg + 1 ];
		return fibonacci( arg, memo );
	}
	
	@Override
	public String getType( ) {
		return "TOP DOWN";
	}
	
}

