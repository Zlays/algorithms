package easy;

import it.zlays.easy.counting_bits.CountingBitsBottomUp;
import it.zlays.easy.counting_bits.CountingBitsUpBottom;
import org.junit.Test;
import it.zlays.test.SimpleTest;
import it.zlays.test.TestCase;

public class CountingBitsTest extends SimpleTest< int[], Integer > {
	
	@Test
	public void countingBitsBottomUp( ) {
		CountingBitsBottomUp countingBottomUp = new CountingBitsBottomUp( );
		this.equalsAll( countingBottomUp );
	}
	
	@Test
	public void countingBitsUpBottom( ) {
		CountingBitsUpBottom countingBottomUp = new CountingBitsUpBottom( );
		this.equalsAll( countingBottomUp );
	}
	
	@Override
	public TestCase< int[], Integer >[] getCases( ) {
		return new TestCase[] {
				new TestCase( new int[] { 0, 1, 1 }, 2 ),
				new TestCase( new int[] { 0, 1, 1, 2, 1, 2 }, 5 ),
				new TestCase( new int[] { 0, 1, 1, 2, 1, 2, 2, 3, 1 }, 8 )
		};
	}
}
