package Intermediate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JunitTest {
	Blackjack blackjack = new Blackjack();
	UniqueSum uniquesum = new UniqueSum();
	Toohot toohot = new Toohot();
	
	@Test
	public void test() {
		assertEquals(21, blackjack.playBlackJack(18, 21));
		assertEquals(20, blackjack.playBlackJack(20, 18));
		assertEquals(0, blackjack.playBlackJack(22, 22));
		
		assertEquals(6, uniquesum.sumofthree(1, 2, 3));
		assertEquals(0, uniquesum.sumofthree(3, 3, 3));
		assertEquals(2, uniquesum.sumofthree(1, 1, 2));
		
		//isummer = false
		assertTrue(toohot.isItHot(60, false));
		assertTrue(toohot.isItHot(70, false));		
		assertTrue(toohot.isItHot(90, false));
		assertTrue(!toohot.isItHot(59, false));
		assertTrue(!toohot.isItHot(91, false));
		//issummer = true
		assertTrue(toohot.isItHot(60, true));
		assertTrue(toohot.isItHot(90, true));
		assertTrue(toohot.isItHot(100, true));
		assertTrue(!toohot.isItHot(59, true));
		assertTrue(!toohot.isItHot(101, true));

	}

}
