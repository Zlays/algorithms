package it.zlays.easy.counting_bits;


import it.zlays.Tracker;

public class CountingBitsUpBottom extends Tracker< int[], Integer > {
	
	public int[] countBits( int n ) {
		int[] result = new int[ n + 1 ];
		for ( int i = 1; i <= n; i++ ) {
			result[ i ] = binary( i, result );
		}
		return result;
	}
	
	private int binary( int number, int[] result ) {
		if ( number <= 0 ) return 0;
		
		if ( result[ number ] == 0 ) {
			return binary( number / 2, result ) + ( ( number % 2 == 1 ) ? 1 : 0 );
		}
		return result[ number ];
	}
	
	
	@Override
	public int[] solution( Integer arg ) {
		return countBits( arg );
	}
	
	@Override
	public String getType( ) {
		return "UP BOTTOM";
	}
}
