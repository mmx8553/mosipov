package ru.job4j;
/**
 * класс = корень дерева классов.
 * @author mosipov
 * @since 10.05.2017
 * @version 1
 *
 */
public class Person {
	/** name. */
    private String name;
	/**	age. */
    private int age;
	/**	construct emty one.  */
    public Person() {
        this("noname");
    }
	/** @param name String **param** */
    public Person(String name) {
        this.name = name;
    }
	/**
 	 * @param name String **param**
 	 * @param age int **param**
	 */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /**
	 * @param
     * @return  String
     */
    public String getName() {
        return name;
    }
}
