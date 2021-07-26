package it.zlays.easy.counting_bits;

import it.zlays.utils.Tracker;

public class CountingBitsBottomUp extends Tracker< int[], Integer > {
	
	public int[] countBits( int n ) {
		int[] result = new int[ n + 1 ];
		for ( int i = 1; i <= n; i++ ) {
			result[ i ] = binary( i, result );
		}
		return result;
	}
	
	private int binary( int n, int[] memo ) {
		int count = 0;
		for ( int i = n; i > 0; i /= 2 ) {
			if ( memo[ i ] == 0 ) {
				if ( i % 2 == 1 ) count++;
			} else {
				memo[ n ] = memo[ i ] + count;
				return memo[ n ];
			}
		}
		memo[ n ] = count;
		return memo[ n ];
	}
	
	
	@Override
	public int[] solution( Integer arg ) {
		return countBits( arg );
	}
	
	@Override
	public String getType( ) {
		return "BOTTOM UP";
	}
}
