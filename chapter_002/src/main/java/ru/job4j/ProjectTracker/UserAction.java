package ru.job4j.ProjectTracker;
/**
 * Класс - интерфейс-действие.
 * @author mosipov
 * @since 18.06.2017
 * @version 1
 */

public interface UserAction {
	/**  @return  int
	*/
	int key();
	/**	@param input Input  **param**
	 *	@param tracker Tracker  **param**
	 */
	void execute(Input input, Tracker tracker);
	/**  @return  String
	*/
    String info();
}