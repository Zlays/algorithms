package it.zlays.medium.unique_path;

import it.zlays.models.UniquePathInput;
import it.zlays.utils.Trackerd;

public class UniquePathsBottomUp extends Trackerd< Long, UniquePathInput > {
	
	@Override
	public Long solution( UniquePathInput arg ) {
		
		long[][] grid = new long[ arg.getX( ) ][];
		for ( int i = 0; i < grid.length; i++ ) {
			grid[ i ] = new long[ arg.getY( ) ];
		}
		
		for ( int i = 0; i < grid.length; i++ ) {
			grid[ i ][ 0 ] = 1;
		}
		
		for ( int i = 0; i < arg.getY( ); i++ ) {
			grid[ 0 ][ i ] = 1;
		}
		
		for ( int i = 1; i < grid.length; i++ ) {
			for ( int j = 1; j < arg.getY( ); j++ ) {
				grid[ i ][ j ] = grid[ i - 1 ][ j ] + grid[ i ][ j - 1 ];
			}
		}
		
		return grid[ arg.getX( ) - 1 ][ arg.getY( ) - 1 ];
	}
	
	@Override
	public String getType( ) {
		return "BOTTOM-UP";
	}
}
