package ru.job4j.PeakBankVisitors;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;

/**
 * Created by mosipov on 31.07.2017.
 */
public class ChelBankTestingClass {
    /**
     *  тестирование заполнение случайного времени.
     */
    @Test
    public void timePeriodTesting() {
        boolean isTimeCorrect = true;
        for (int i = 0; i < 1000; i++) {
            isTimeCorrect &= ((MyUtils.getRandomTime() < 2001) & (MyUtils.getRandomTime() > 799));
        }
        Assert.assertThat(isTimeCorrect, is(true));

    }

}
