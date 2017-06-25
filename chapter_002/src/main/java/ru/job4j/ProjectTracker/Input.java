package ru.job4j.ProjectTracker;
/**
 * Interface = Input.
 */
public interface Input {
	/** @param question String **param**
	* 	@return  String
	*/
	String ask(String question);
	/** @param question String **param**
	*	@param range int[] **param**
	* 	@return  int
	*/
	int ask(String question, int[] range);
}