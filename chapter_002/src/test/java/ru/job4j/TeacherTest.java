package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @since 10.05.2017
 */
public class TeacherTest  {
	/** Test 1 of 3.  */
    @Test
    public void testHeals()  {
        assertThat(new Teacher("Знайка").teaches(new Person("Незнайка")), is("Учитель Знайка учит Незнайка"));
    }
}