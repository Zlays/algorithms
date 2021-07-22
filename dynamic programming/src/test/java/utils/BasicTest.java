package utils;

import it.zlays.utils.Trackerd;
import lombok.Getter;
import org.junit.Assert;


@Getter
public abstract class BasicTest< O, I > {
	
	public void equalsAll( Trackerd< O, I > algorithm ) {
		for ( TestCase< O, I > testCase : this.getCases( ) ) {
			Assert.assertEquals( testCase.getExpected( ), ( long ) algorithm.run( testCase.getInput( ) ) );
		}
		
	}
	
	public abstract TestCase< O, I >[] getCases( );
}
