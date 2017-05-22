package ru.job4j.ProjectTracker;
/**
 * класс = Tracker.
 * @author mosipov
 * @since 21.05.2017
 * @version 1
 */
public class Tracker {
	/** some text is have to be here. */
    private Item[] items = new Item[100];
	/** some text is have to be here. */
    private int itemIdCounter = 1;
	/** some text is have to be here. */
    private int position = 0;
	/**
 	 * @param item Item **param**
     * @return  Item
     */
    public Item add(Item item) {
		item.setId(this.generateID());
		this.items[position++] = item;
		return item;
    }
	/**
 	 * @param item Item **param**
     */
    public void update(Item item) {
    }
	/**
 	 * @param item Item **param**
     */
    public void delete(Item item) {
    }
	/**
     * @return  Item[]
     */
    public Item[] findAll() {
		return new Item[1];
    }
	
	public Item[] findByName(String key){
		
	}
	/**
	 * @param id String **param**
     * @return  Item
     */
	public Item findById(String id){
		for (Item item:this.items){
			if id.equals(item.getId()){
				return item;
				// ??? - доживет ли переменная до return-на ?
			}
		}
	}
	
	/**
     * @return  String
     */
	public String generateID() {
		return String.format("id" + %04d, itemIdCounter++);
		//can go out of range need - log / exception / test
	}
}


