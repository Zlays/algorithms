package utils;

import it.zlays.utils.Trackerd;
import lombok.Getter;
import org.junit.Assert;


@Getter
public abstract class BasicTest< O, I > {
	
	public void equalsAll( Trackerd< O, I > algorithm ) {
		for ( TestCase< O, I > testCase : this.getCases( ) ) {
			if ( testCase.getExpected( ) instanceof int[] ) {
				Assert.assertArrayEquals( ( int[] ) testCase.getExpected( ), ( int[] ) algorithm.run( testCase.getInput( ) ) );
			} else {
				Assert.assertEquals( testCase.getExpected( ), algorithm.run( testCase.getInput( ) ) );
			}
		}
		
	}
	
	public abstract TestCase< O, I >[] getCases( );
}
