package ru.job4j;
/**
 * класс = ...
 */
public class Teacher extends Profession {
	/** some text is have to be here. */
    private String placeOfWork;
	/** @param name String **param** */
    public Teacher(String name) {
        super(name);
    }
	/**
 	 * @param person Person **param**
     * @return  String
     */
    public String teaches(Person person) {
        return String.format("Учитель %s учит %s", this.getName(), person.getName());
    }
}
