package ru.job4j.ProjectTracker;
/**
 * Interface = Input.
 * @author mosipov
 * @since 18.06.2017
 * @version 1
 *
 */
public interface Input {
	/**	Вопрос-ответ.
	*	@param question String **param**
	* 	@return  String
	*/
	String ask(String question);
	/**	Вопрос-ответ с проверкой диапазона.
	*	@param question String **param**
	*	@param range int[] **param**
	* 	@return  int
	*/
	int ask(String question, int[] range);
}