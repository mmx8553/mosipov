package ru.job4j.ProjectTracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @since 10.05.2017
 */
public class FindTest {
	/** Test 1 of 3.  */
    @Test
    public void testHeals()  {
        assertThat((new Doctor("Айболит").heals(new Person("Болиголованов"))), is("Доктор Айболит лечит Болиголованов"));
    }
}