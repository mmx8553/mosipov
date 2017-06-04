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
}