package ru.job4j.ProjectTracker;
/**
 * класс = Item.
 * @author mosipov
 * @since 21.05.2017
 * @version 1
 *
 */
public class Item {
	/** id. */
    private String id;
	/** name. */
    public String name;
	/**	description. */
    public String description;
	/**	create date. */
    public long create;
	/**	construct emty one.  */
    public Item() {
    }
	/** @param name String **param** */
    public Item(String name, String description, long create) {
        this.name = name;
		this.description = description;
		this.create = create;
    }
    /**
	 * @param
     * @return  String
     */
    public String getName() {
        return this.name;
    }
    /**
	 * @param
     * @return  String
     */
    public String getDescription() {
        return this.description;
    }
    /**
	 * @param
     * @return  String
     */
    public String getCreate() {
        return this.create;
    }
    /**
	 * @param
     * @return  String
     */
    public String getId() {
        return this.id;
    }
    /**
	 * @param
     * @return  String
     */
    public void setId(String id) {
        this.id = id;
    }

}
