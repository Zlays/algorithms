package it.zlays.medium.stone_game;

import it.zlays.utils.Tracker;

public class StoneGameBottomUp extends Tracker< Boolean, int[] > {
	
	public boolean stoneGame( int[] piles ) {
		int x = piles.length;
		int[][] memo = new int[ x + 1 ][];
		for ( int i = 0; i < x; i++ ) {
			memo[ i ] = new int[ x ];
		}
		
		memo[ 0 ][ 0 ] = Math.max( piles[ 0 ], piles[ x - 1 ] );
		memo[ 0 ][ 1 ] = memo[ 0 ][ 0 ] + piles[ x - 2 ];
		memo[ 1 ][ 0 ] = memo[ 0 ][ 0 ] + piles[ 2 ];
		;
		
		for ( int i = 1; i < x; i++ ) {
			for ( int j = 1; j < x; j++ ) {
				if ( ( i + j ) % 2 == 0 )
					memo[ i ][ j ] = Math.max( memo[ i - 1 ][ j ] + piles[ i ], memo[ i ][ j - 1 ] + piles[ j ] );
				else
					memo[ i ][ j ] = Math.max( memo[ i - 1 ][ j ] - piles[ i ], memo[ i ][ j - 1 ] - piles[ j ] );
			}
		}
		
		return memo[ x - 1 ][ x - 1 ] > 0;
	}
	
	
	@Override
	public Boolean solution( int[] arg ) {
		return stoneGame( arg );
	}
	
	@Override
	public String getType( ) {
		return "BOTTOM UP";
	}
}
