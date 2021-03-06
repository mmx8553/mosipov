package ru.job4j;
/**
 * класс = doc.
 * @author mosipov
 * @since 10.05.2017
 * @version 1
 */
public class Doctor extends Profession {
	/** @param name String **param** */
    public Doctor(String name) {
        super(name);
    }
	/** some text is have to be here. */
    private String specialization;
	/**
 	 * @param person Person **param**
     * @return  String
     */
    public String heals(Person person) {
        return String.format("Доктор %s лечит %s", this.getName(), person.getName());
    }
	/**
     * @return  String
     */
	public String getSpecialization() {
		return this.specialization;
	}
}


