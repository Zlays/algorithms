package it.zlays;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

@Data
@NoArgsConstructor
public abstract class Tracker< O, I > {
	
	protected Instant start;
	private Runtime runtime = Runtime.getRuntime( );
	
	public void timeStart( ) {
		this.start = Instant.now( );
	}
	
	public Duration timeStop( ) {
		return Duration.between( this.start, Instant.now( ) );
	}
	
	public O run( I arg ) {
		String tmpValue;
		if ( arg instanceof int[][] )
			tmpValue = Arrays.deepToString( ( Object[] ) arg );
		else if ( arg instanceof int[] )
			tmpValue = Arrays.toString( ( int[] ) arg );
		else
			tmpValue = String.valueOf( arg );
		
		this.runtime.gc( );
		//memory
		long usedMemoryBefore = this.runtime.totalMemory( ) - this.runtime.freeMemory( );
		
		//time
		this.timeStart( );
		O result = this.solution( arg );
		//time
		Duration timeElapsed = this.timeStop( );
		
		//memory
		long usedMemoryAfter = this.runtime.totalMemory( ) - this.runtime.freeMemory( );
		long usedMemory = usedMemoryAfter - usedMemoryBefore;
		
		System.out.printf(
				"(%s) Value: %s Time: %s ns Memory: %s %n",
				this.getType( ),
				tmpValue,
				timeElapsed.toNanos( ),
				usedMemory );
		
		return result;
	}
	
	
	public abstract O solution( I arg );
	
	public abstract String getType( );
}
