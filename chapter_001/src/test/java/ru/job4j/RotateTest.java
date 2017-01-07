package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;

/**
 * Класс для тестирования.
 * @author mosipov
 * @since 07.01.2017
 * @version 1
 *
 */
public class RotateTest {
	/**
     * Test of 3 cell array.
     */
	@Test
	public void testArrayRotate() {
		int[][] arrRemake = {{1, 2}, {3, 4}};
		int[][] arrCompare = {{2, 4}, {1, 3}};
		Rotate rtt = new Rotate();
		assertThat(arrCompare, is(rtt.doRotate(arrRemake)));
	}
}