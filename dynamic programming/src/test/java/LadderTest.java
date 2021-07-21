import it.zlays.fibonacci.FibonacciMemo;
import it.zlays.ladder.LadderBase;
import it.zlays.ladder.LadderMemo;
import org.junit.Assert;
import org.junit.Test;

public class LadderTest {
	
	@Test
	public void LadderBaseTest( ) {
		LadderBase ladderBase = new LadderBase( );
		Assert.assertEquals( 1, ( long ) ladderBase.run( 0 ) );
		Assert.assertEquals( 4, ( long ) ladderBase.run( 3 ) );
		Assert.assertEquals( 121415, ( long ) ladderBase.run( 20 ) );
		Assert.assertEquals( 1132436852, ( long ) ladderBase.run( 35 ) );
	}
	
	@Test
	public void LadderMemoTest( ) {
		LadderMemo ladderMemo = new LadderMemo( );
		Assert.assertEquals( 1, ( long ) ladderMemo.run( 0 ) );
		Assert.assertEquals( 4, ( long ) ladderMemo.run( 3 ) );
		Assert.assertEquals( 121415, ( long ) ladderMemo.run( 20 ) );
		Assert.assertEquals( 1132436852, ( long ) ladderMemo.run( 35 ) );
	}
	
}
