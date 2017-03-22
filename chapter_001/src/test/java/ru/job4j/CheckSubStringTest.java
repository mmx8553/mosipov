package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;

/**
 * Класс для тестирования.
 * @author mosipov
 * @since 21.03.2017
 * @version 1
 *
 */
public class CheckSubStringTest {
	/**
     * Test of 3 cell array.
     */
	@Test
	public void testStringContainsSub() {
		CheckSubString chss = new CheckSubString();
		assertThat(chss.contains("asdfg", "sdf"), is(true));
	}
}