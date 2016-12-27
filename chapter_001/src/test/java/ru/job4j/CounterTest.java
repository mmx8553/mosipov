package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;

/**
 * Класс для тестирования.
 * @author mosipov
 * @since 27.12.2016
 * @version 1
 *
 */
public class CounterTest {
	/**
     * Test of summ of even bumbers.
     */
	@Test
	public void testSummOneToTen() {
		Counter cnt = new Counter();
		assertThat(cnt.add(1, 10), is(30));
	}
	/**
     * Test of summ of even bumbers.
     */
	@Test
	public void testSummTreeToFour() {
		Counter cnt = new Counter();
		assertThat(cnt.add(3, 4), is(4));
	}
}