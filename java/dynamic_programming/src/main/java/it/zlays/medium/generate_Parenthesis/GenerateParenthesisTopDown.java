package it.zlays.medium.generate_Parenthesis;


import it.zlays.Tracker;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisTopDown extends Tracker< List< String >, Integer > {
	
	public List< String > generateParenthesis( int n ) {
		List< String > result = new ArrayList( );
		generateParenthesis( n, 0, 0, "", result );
		return result;
	}
	
	public void generateParenthesis( int n, int open, int closed, String s, List< String > result ) {
		if ( open == n && closed == n ) {
			result.add( s );
			s = "";
		}
		
		if ( open < n )
			generateParenthesis( n, open + 1, closed, s + "(", result );
		
		if ( closed < n && closed < open )
			generateParenthesis( n, open, closed + 1, s + ")", result );
		
	}
	
	@Override
	public List< String > solution( Integer arg ) {
		return generateParenthesis( arg );
	}
	
	@Override
	public String getType( ) {
		return "TOP DOWN";
	}
}
