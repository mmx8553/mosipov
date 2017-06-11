package ru.job4j.ProjectTracker;
//import java.util.Scanner;
/**
 * Interface = Input implementation.
 */
public class StubInput implements Input {
	/** 000. */
	private String[] answers;
	/** 000. */
	private int position = 0;
	/** @param answers String[] **param**
	*/
	public StubInput(String[] answers) {
		this.answers = answers;
	}
	/** @param question String **param**
	* 	@return  String
	*/
	public String ask(String question) {
		return this.answers[position++];
	}
}