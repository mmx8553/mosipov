package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;

/**
 * Класс для тестирования.
 * @author mosipov
 * @since 25.12.2016
 * @version 1
 *
 */
public class PointTest {
	/**
     * Test of distanceTo is zero.
     */
	@Test
	public void testDistanceTo() {
		Point pA = new Point(Double.parseDouble("2"), 2.0);
		Point pB = new Point(Double.parseDouble("4"), 2.0);
		assertThat(pA.distanceTo(pB), is(Double.parseDouble("2")));
	}
	/**
     * Test of getResult is zero.
     */
	@Test
	public void testExistOfTriangle() {
		Point pA = new Point(1, 2);
		Point pB = new Point(Double.parseDouble("2"), 2);
		Point pC = new Point(Double.parseDouble("4"), 2);
		Triangle triangleNotExist = new Triangle(pA, pB, pC);
		assertThat(triangleNotExist.area(), is(Double.parseDouble("-1")));
	}
	/**
     * Test of 3-4-5 Triangle  square.
     */
	@Test
	public void testTriangleArea() {
		Point pA = new Point(0, 0);
		Point pB = new Point(Double.parseDouble("0"), Double.parseDouble("3"));
		Point pC = new Point(Double.parseDouble("4"), 0);
		Triangle triangleArea = new Triangle(pA, pB, pC);
		assertThat(triangleArea.area(), closeTo(Double.parseDouble("6"), Double.parseDouble("0.01")));
	}

}
