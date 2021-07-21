import it.zlays.fibonacci.FibonacciBase;
import it.zlays.fibonacci.FibonacciMemo;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
	
	@Test
	public void fibonacciBaseTest( ) {
		FibonacciBase fibonacciBase = new FibonacciBase( );
		Assert.assertEquals( 0, ( long ) fibonacciBase.run( 0 ) );
		Assert.assertEquals( 1, ( long ) fibonacciBase.run( 1 ) );
		Assert.assertEquals( 8, ( long ) fibonacciBase.run( 6 ) );
		Assert.assertEquals( 610, ( long ) fibonacciBase.run( 15 ) );
		Assert.assertEquals( 832040, ( long ) fibonacciBase.run( 30 ) );
		Assert.assertEquals( 1134903170, ( long ) fibonacciBase.run( 45 ) );
	}
	
	@Test
	public void fibonacciMemoTest( ) {
		FibonacciMemo fibonacciMemo = new FibonacciMemo( );
		Assert.assertEquals( 0, ( long ) fibonacciMemo.run( 0 ) );
		Assert.assertEquals( 1, ( long ) fibonacciMemo.run( 1 ) );
		Assert.assertEquals( 8, ( long ) fibonacciMemo.run( 6 ) );
		Assert.assertEquals( 610, ( long ) fibonacciMemo.run( 15 ) );
		Assert.assertEquals( 832040, ( long ) fibonacciMemo.run( 30 ) );
		Assert.assertEquals( 1134903170, ( long ) fibonacciMemo.run( 45 ) );
	}
	
}
