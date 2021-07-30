package it.zlays.medium.stone_game;


import it.zlays.Tracker;

public class StoneGameTopDown extends Tracker< Boolean, int[] > {
	
	public boolean stoneGame( int[] piles ) {
		int x = piles.length;
		int[][] memo = new int[ x + 1 ][];
		for ( int i = 0; i <= x; i++ ) {
			memo[ i ] = new int[ x + 1 ];
		}
		
		return ( Math.max(
				stoneGame( piles, 1, 0, false, false, x, memo ),
				stoneGame( piles, 0, 1, true, false, x, memo ) ) >
				Math.max(
						stoneGame( piles, 2, 0, false, true, x, memo ),
						stoneGame( piles, 0, 2, true, true, x, memo ) )
		);
	}
	
	public int stoneGame( int[] piles, int inizio, int fine, boolean side, boolean turn, int length, int[][] memo ) {
		if ( inizio + fine == length ) return 0;
		
		if ( ( memo[ inizio + 1 ][ fine ] == 0 ) )
			memo[ inizio + 1 ][ fine ] = stoneGame( piles, inizio + 1, fine, false, ! turn, length, memo );
		if ( ( memo[ inizio ][ fine + 1 ] == 0 ) )
			memo[ inizio ][ fine + 1 ] = stoneGame( piles, inizio, fine + 1, true, ! turn, length, memo );
		
		if ( turn ) {
			if ( piles[ ( side ) ? fine : inizio ] + memo[ inizio + 1 ][ fine ] >
					piles[ ( side ) ? fine : inizio ] + memo[ inizio ][ fine + 1 ] ) {
				inizio++;
			} else {
				fine++;
			}
		}
		
		return Math.max(
				piles[ ( side ) ? fine : inizio ] + memo[ inizio + 1 ][ fine ],
				piles[ ( side ) ? fine : inizio ] + memo[ inizio ][ fine + 1 ]
		);
	}
	
	@Override
	public Boolean solution( int[] arg ) {
		return stoneGame( arg );
	}
	
	@Override
	public String getType( ) {
		return "TOP DOWN";
	}
}
