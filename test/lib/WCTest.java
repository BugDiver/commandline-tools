package lib;

import org.junit.Test;
import static org.junit.Assert.*;

public class WCTest {
	@Test
	public void tstForCountingCharactersOfAGivenString() {
		String text = "Hello world!!!!";
		WC wc = new WC(text);

		assertEquals(wc.countChars() ,15);
	}
}