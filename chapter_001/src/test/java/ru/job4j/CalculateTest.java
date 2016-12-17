package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс для тестирования.
 * @author mosipov
 * @since 15.12.2016
 * @version 1
 *
 */
public class CalculateTest {

	 /**
     * Test of printout.
     */

	 @Test
	public void whenExecuteMainThenPrintToConsole() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		Calculate.main(null);
		assertThat(out.toString(), is("Hello world\r\n"));
	}

	/**
     * Test of add.
     */

	 @Test
	public void whenExecuteAddThenReturnZero() {
		Calculate calc = new Calculate();
		int intAdd = calc.add();
		assertThat(intAdd, is(0));
	}

}