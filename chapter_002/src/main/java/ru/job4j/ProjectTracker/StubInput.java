package ru.job4j.ProjectTracker;
/**
 * Interface = Input implementation - auto input answers.
 * @author mosipov
 * @since 18.06.2017
 * @version 1
 *
 */
public class StubInput implements Input {
	/** auto answers. */
	private String[] answers;
	/** answer pointer. */
	private int position = 0;
	/**	конструктор с параметром.
	*	@param answers String[] **param**
	*/
	public StubInput(String[] answers) {
		this.answers = answers;
	}
	/**	 Автоответ.
	*	@param question String **param**
	* 	@return  String
	*/
	public String ask(String question) {
		return this.answers[position++];
	}
	/** Автоответ в проверкой диапазона ответов.
	*	@param question String **param**
	*	@param range int[] **param**
	* 	@return  int
	*/
	public int ask(String question, int[] range) {
		int key = Integer.valueOf(this.ask(question));
		boolean exist = false;
		for (int value:range) {
			if (value == key) {
				exist = true;
				break;
			}
		}
		if (exist) {
			return key;
		} else {
			throw new MenuOutEception("Menu out of range");
		}
	}
}