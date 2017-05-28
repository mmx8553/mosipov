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
    private String name;
	/**	description. */
    private String description;
	/**	create date. */
    private long create;
	/** @param name String **param** */
	public void setName(String name) {
		this.name = name;
	}
	/** @param description String **param** */
	public void setDescription(String description) {
		this.description = description;
	}
	/** @param create long **param** */
	public void setCreate(long create) {
		this.create = create;
	}
	/**	construct emty one.  */
    public Item() {
    }
	/**
	*	@param name String **param**
	*	@param description String **param**
	*	@param create long **param**
	*/
    public Item(String name, String description, long create) {
        this.setName(name);
		this.setDescription(description);
		this.setCreate(create);
		//в конструкторе вызов методов - чем грозит ?
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
     * @return  long
     */
    public long getCreate() {
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
	 * @param id String  **param**
     */
    public void setId(String id) {
        this.id = id;
    }

}
