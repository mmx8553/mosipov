package ru.job4j.ProjectTracker;
/**
 * Interface = Input implementation.
 * Ручной ввод.
 *
 * @author mosipov
 * @since 24.06.2017.
 * @version 1
 *
 */
public class MenuOutEception  extends RuntimeException {
	/**	Исключение при выходе из диапазона.
	*	@param msg String **param**
	*/
    public MenuOutEception(String msg) {
        super(msg);
    }

}
