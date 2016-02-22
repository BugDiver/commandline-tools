package lib;

import org.junit.Test;
import static org.junit.Assert.*;

public class WCTest {
	@Test
	public void testForCountingCharactersOfAGivenString() {
		String text = "Hello world!!!!";
		WC wc = new WC(text,"foo");

		assertEquals(wc.countChars() ,15);
	}

	@Test
	public void testForCountingWordsOfAGivenString() {
		String text = "Hello world!!!!";
		WC wc = new WC(text,"bar");
		assertEquals(wc.countWords() ,2);
	}

	@Test
	public void testForCountingLinessOfAGivenString() {
		String text = "Hello world!!!";
		WC wc = new WC(text,"whyYouNeed");
		assertEquals(wc.countLines() ,0);
	}

	@Test
	public void testForCountingLinessOfAGivenStringWithMultipleLines() {
		String text = "Hello world\nHow are you?";
		WC wc = new WC(text,"getLost");
		assertEquals(wc.countLines() ,1);
	}

	@Test
	public void testForFormatedResultOfAGivenString() {
		String text = "Hello world!!\nHow are you?";
		WC wc = new WC(text,"something");
		String expected = "\t1\t5\t26\tsomething";
		assertEquals(wc.formatedResult() , expected);
	}
}