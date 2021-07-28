package it.zlays.easy.good_pairs;

import it.zlays.Tracker;

public class GoodPairsBottomUp extends Tracker< Integer, int[] > {
	
	public int numIdenticalPairs( int[] nums ) {
		int x = nums.length;
		int[] memo = new int[ 101 ];
		int result = 0;
		
		for ( int i = 0; i < x; i++ ) {
			result += memo[ nums[ i ] ];
			memo[ nums[ i ] ]++;
		}
		
		return result;
	}
	
	@Override
	public Integer solution( int[] arg ) {
		return numIdenticalPairs( arg );
	}
	
	@Override
	public String getType( ) {
		return "BOTTOM UP";
	}
}
