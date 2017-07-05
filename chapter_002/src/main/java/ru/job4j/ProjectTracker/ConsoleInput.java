package ru.job4j.ProjectTracker;
import java.util.Scanner;
/**
 * Interface = Input implementation.
 * Ручной ввод.
 *
 * @author mosipov
 * @since 18.06.2017
 * @version 1
 *
 */

/**
 * Interface = Input implementation.
 */
public class ConsoleInput implements Input {
	/** Экземпляр системного потока ввода.
	*/
	private Scanner scanner = new Scanner(System.in);
	/**	Фунция получения ответа от пользователя.
	*	@param question String **param**
	* 	@return  String
	*/
	public String ask(String question) {
		System.out.println(question);
		return scanner.next();
	}
	/**	Фунция получения ответа от пользователя с проверкой диапазона вывода.
	*	@param question String **param**
	*	@param range int[] **param**
	*	@return  int
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