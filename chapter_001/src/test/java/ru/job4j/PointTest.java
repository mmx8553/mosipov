package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
/**
 * Класс для тестирования.
 * @author mosipov
 * @since 25.12.2016
 * @version 1
 *
 */
public class CalculatorTest {
	/**
     * Test of getResult is zero.
     */
	@Test
	public void testExistOfTriangle() {
		Point pA = new Point(1, 2);
		Point pB = new Point(4, 2);
		Point pC = new Point(6, 2);
		Triangle triangleNotExist = new Triangle(pC, pB, pC);
		assertThat(triangleNotExist.area(), closeTo(except, -1));
	}

}
