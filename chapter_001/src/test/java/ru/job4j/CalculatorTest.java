package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс для тестирования.
 * @author mosipov
 * @since 18.12.2016
 * @version 1
 *
 */
public class CalculatorTest {
	/**
     * Test of getResult is zero.
     */
	@Test
	public void whenGetResultThenReturnZero() {
		Calculator calc = new Calculator();
		assertThat(calc.getResult(), is(0.0));
	}
	/**
     * Test of getResult is zero in adding.
     */
	@Test
	public void whenAddThenReturnSum() {
		Calculator calc = new Calculator();
		calc.add(1, 2);
		assertThat(calc.getResult(), is(Double.parseDouble("3.0")));
	}
	/**
     * Test of getResult is zero in div.
     */
	@Test
	public void whenDivThenReturnDivRez() {
		Calculator calc = new Calculator();
		calc.div(1, 2);
		assertThat(calc.getResult(), is(Double.parseDouble("0.5")));
	}

}
