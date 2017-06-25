package ru.job4j.ProjectTracker;
import java.util.Scanner;
/**
 * Interface = Input implementation.
 */
public class ConsoleInput implements Input {
	/** 000. */
	private Scanner scanner = new Scanner(System.in);
	/** @param question String **param**
	* 	@return  String
	*/
	public String ask(String question) {
		System.out.println(question);
		return scanner.next();
	}
	/** @param question String **param**
	 *  @param range int[] **param**
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