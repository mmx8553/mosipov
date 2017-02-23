package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;
import com.google.common.base.Joiner;
//import com.google.common.base;



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
		String joined;
		joined = Joiner.on("\n")
                .useForNull("MISSING")
                .join(" ^ ", "^ ^", "");
		assertThat(pnt.piramid(2), is(joined));
	}
}