package ru.job4j.ProjectTracker;
/**
 * @since 18.06.2017
 */

public interface UserAction {
	/**  @return  int  */
     int key();
	/** @param input Input  **param**
	 *	@param tracker Tracker  **param**  */
 void execute(Input input, Tracker tracker);
	/**  @return  String  */
    String info();
}