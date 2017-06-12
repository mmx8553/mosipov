package ru.job4j.StrategyPattern;

import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;

/**
 * @since 11.06.2017
 */
public class StrategyTest {
    /** Test 1 of many.  */
    @Test
    public void testSquare() {
        ByteArrayOutputStream localOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(localOut));
        new Paint(new Square()).draw();
        StringBuilder sb = new StringBuilder();
        sb.append("Square".toString()).append("\r\n");
        Assert.assertThat(localOut.toString(), is(sb.toString()));
    }    
	/** Test 2 of many.  */
	@Test
    public void testTriangle() {
        ByteArrayOutputStream localOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(localOut));
        new Paint(new Triangle()).draw();
        StringBuilder sb = new StringBuilder();
        sb.append("Triangle".toString()).append("\r\n");
        Assert.assertThat(localOut.toString(), is(sb.toString()));
    }
}