import it.zlays.ladder.LadderBase;
import it.zlays.ladder.LadderMemo;
import org.junit.Test;
import utils.BasicTest;
import utils.TestCase;

public class LadderTest extends BasicTest< Long, Integer > {
	
	@Test
	public void LadderBaseTest( ) {
		LadderBase ladder = new LadderBase( );
		this.equalsAll( ladder );
	}
	
	@Test
	public void LadderMemoTest( ) {
		LadderMemo ladder = new LadderMemo( );
		this.equalsAll( ladder );
	}
	
	@Override
	public TestCase< Long, Integer >[] getCases( ) {
		return new TestCase[] {
				new TestCase( 1L, 0 ),
				new TestCase( 4L, 3 ),
				new TestCase( 121415L, 20 ),
				new TestCase( 1132436852L, 35 )
		};
	}
}
