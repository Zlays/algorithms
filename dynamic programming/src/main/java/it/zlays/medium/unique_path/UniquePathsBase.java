package it.zlays.medium.unique_path;

import it.zlays.models.UniquePathInput;
import it.zlays.utils.Trackerd;

public class UniquePathsBase extends Trackerd< Long, UniquePathInput > {
	
	public Long uniquePaths( int x, int y ) {
		if ( x == 1 || y == 1 ) return 1L;
		return uniquePaths( x - 1, y ) + uniquePaths( x, y - 1 );
	}
	
	@Override
	public Long solution( UniquePathInput arg ) {
		return uniquePaths( arg.getX( ), arg.getY( ) );
	}
	
	@Override
	public String getType( ) {
		return "BASE";
	}
}
