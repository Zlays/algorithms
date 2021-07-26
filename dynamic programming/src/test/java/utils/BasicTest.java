package utils;

import it.zlays.utils.Tracker;
import lombok.Getter;
import org.junit.Assert;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;


@Getter
public abstract class BasicTest< O, I > {
	
	public void equalsAll( Tracker< O, I > algorithm ) {
		for ( TestCase< O, I > testCase : this.getCases( ) ) {
			if ( testCase.getExpected( ) instanceof int[] ) {
				Assert.assertArrayEquals( ( int[] ) testCase.getExpected( ), ( int[] ) algorithm.run( testCase.getInput( ) ) );
			} else if ( testCase.getExpected( ) instanceof List ) {
				Assert.assertEquals( new TreeSet< Object >( ( Collection< ? > ) testCase.getExpected( ) ),
						new TreeSet< Object >( ( Collection< ? > ) algorithm.run( testCase.getInput( ) ) ) );
			} else {
				Assert.assertEquals( testCase.getExpected( ), algorithm.run( testCase.getInput( ) ) );
			}
		}
		
	}
	
	public abstract TestCase< O, I >[] getCases( );
}
