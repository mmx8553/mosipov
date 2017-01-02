package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;

/**
 * Класс для тестирования.
 * @author mosipov
 * @since 02.01.2017
 * @version 1
 *
 */
public class PaintTest {
	/**
     * Test of 1 piramid.
     */
	@Test
	public void testPiramidOne() {
		Paint pnt = new Paint();
		StringBuilder sb = new StringBuilder();
		assertThat(pnt.piramid(1), is(sb.append("^").append("\n").toString()));
	}
	/**
     * Test of 2 piramid.
     */
	@Test
	public void testPiramidTwo() {
		Paint pnt = new Paint();
		StringBuilder sb = new StringBuilder();
		assertThat(pnt.piramid(2), is(sb.append(" ^ ").append("\n").append("^ ^").append("\n").toString()));
	}
}