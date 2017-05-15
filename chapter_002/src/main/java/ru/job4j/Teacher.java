package ru.job4j;
/**
 * класс = ...
 */
public class Teacher extends Profession {
	/** some text is have to be here. */
    private String placeOfWork;
	/** @param name String **param** */
    Teacher(String name) {
        super(name);
    }
	/**
 	 * @param person Person **param**
     * @return  String
     */
    String teaches(Person person) {
        return ("Учитель " + this.getName() + " учит " + person.getName());
    }
}
