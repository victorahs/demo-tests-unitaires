package demo_tests_unitaires.demo_tests_unitaires;

import org.junit.Test;

import dev.utils.StringUtils;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance() {

		int result = StringUtils.levenshteinDistance("chien", "chine");
		assertEquals(2, result);

		int result1 = StringUtils.levenshteinDistance("chat", "chats");
		assertEquals(1, result1);

		int result3 = StringUtils.levenshteinDistance("machins", "machines");
		assertEquals(1, result3);



	}

	
	@Test(expected = RuntimeException.class)
	
	public void testLevenshteinDistanceExeption() {

	
		int result= StringUtils.levenshteinDistance(null, null);
	

	}
}
