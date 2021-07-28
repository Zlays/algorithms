package it.zlays.easy.divisor_game;


import it.zlays.Tracker;

public class DivisorGame extends Tracker< Boolean, Integer > {
	
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
