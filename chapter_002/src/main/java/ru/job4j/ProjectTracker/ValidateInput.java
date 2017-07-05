package ru.job4j.ProjectTracker;
/**
 * Класс - наследник консольного ввода - с проверкой формата ввода.
 * @author mosipov
 * @since 24.06.2017
 * @version 1
 */
public class ValidateInput extends ConsoleInput {
	/** @param question String **param**
	 *  @param range int[] **param**
	 * 	@return  int
	 */
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutEception moe) {
                System.out.println("Please select key from menu...");
                //moe.printStackTrace(System.err);
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter valid format number...");
            }
        } while (invalid);
        return value;
    }
}
