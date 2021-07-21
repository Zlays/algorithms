package it.zlays.utils;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Arrays;

@Data
@NoArgsConstructor
public abstract class Trackerd< O, I > {
	private static final Logger logger = LogManager.getLogger( Trackerd.class );
	
	protected long start;
	protected long end;
	
	public void timeStart( ) {
		this.start = System.currentTimeMillis( );
	}
	
	public long timeStop( ) {
		this.end = System.currentTimeMillis( );
		return this.end - this.start;
	}
	
	public O run( I arg ) {
		this.timeStart( );
		O result = this.solution( arg );
		long timeElapsed = this.timeStop( );
		
		System.out.printf(
				"(%s) Value: %s needs: %s ms%n", this.getType( ),
				arg instanceof int[][] ? Arrays.deepToString( ( Object[] ) arg ) : arg,
				timeElapsed );
		
		
		return result;
	}
	
	
	public abstract O solution( I arg );
	
	public abstract String getType( );
}
