package it.zlays.easy.divisor_game;

import it.zlays.utils.Trackerd;

public class DivisorGame extends Trackerd< Boolean, Integer > {
	
	public boolean divisorGame( int n ) {
		return ( n % 2 ) == 0;
	}
	
	@Override
	public Boolean solution( Integer arg ) {
		return divisorGame( arg );
	}
	
	@Override
	public String getType( ) {
		return "";
	}
}
