package easy;

import it.zlays.easy.fibonacci.FibonacciBottomUp;
import it.zlays.easy.fibonacci.FibonacciUpBottom;
import org.junit.Test;
import utils.BasicTest;
import utils.TestCase;

public class FibonacciTest extends BasicTest< Long, Integer > {
	
	@Test
	public void fibonacciUpBottomTest( ) {
		FibonacciUpBottom fibonacci = new FibonacciUpBottom( );
		this.equalsAll( fibonacci );
	}
	
	@Test
	public void fibonacciBottomUpTest( ) {
		FibonacciBottomUp fibonacci = new FibonacciBottomUp( );
		this.equalsAll( fibonacci );
	}
	
	
	@Override
	public TestCase< Long, Integer >[] getCases( ) {
		return new TestCase[] {
				new TestCase<>( 0L, 0 ),
				new TestCase<>( 1L, 1 ),
				new TestCase<>( 8L, 6 ),
				new TestCase<>( 610L, 15 ),
				new TestCase<>( 832040L, 30 ),
				new TestCase<>( 1134903170L, 45 )
		};
	}
}
