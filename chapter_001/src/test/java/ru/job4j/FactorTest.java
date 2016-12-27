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
public class FactorTest {
	/**
     * Test of factorial.
     */
	@Test
	public void testFactorialOneToFive() {
		Factor fct = new Factor();
		assertThat(fct.calc(5), is(120));
	}
}