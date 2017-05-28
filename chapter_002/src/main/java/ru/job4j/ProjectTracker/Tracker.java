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
	/** some text is have to be here.  Item Id autoincrement - to String */
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
		for (int i = 0; i < 100; i++) {
			if (this.items[i].getId().equals(item.getId())) {
				this.items[i] = item;
				break;
			}
		}
	}
	/**
 	 * @param item Item **param**
     */
    public void delete(Item item) {
        if (position > 0) {
            for (int i = 0; i < position; i++) {
                if (item != null && (items[i].getId().equals(item.getId()))) {
                    items[i] = this.items[--position];
                    this.items[position] = null;
                    break;
                }
            }
        }
    }
	/** @return  Item[] */
    public Item[] findAll() {
        Item[] foundItems = new Item[100];
        int localCounter = 0;
        for (Item item : this.items) {
            if (item != null) {
                foundItems[localCounter++] = item;
            }
        }
        Item[] itemsResult = new Item[localCounter];
        System.arraycopy(foundItems, 0, itemsResult, 0, localCounter);
        return itemsResult;
    }
	/**
	*	@param key String **param**
	*	@return  Item[]
	*/
    public Item[] findByName(String key) {
        Item[] itemsName = new Item[100];
        int localCounter = 0;
        for (Item item : this.items) {
            if (item != null && key.equals(item.getName())) {
                itemsName[localCounter++] = item;
            }
        }
        Item[] itemsResult = new Item[localCounter];
        System.arraycopy(itemsName, 0, itemsResult, 0, localCounter);
        return itemsResult;
    }
	/**
	 * @param id String **param**
     * @return  Item
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (item != null && id.equals(item.getId())) {
                result = item;
                break;
            }
        }
        return result;
    }
	/**
     * @return  String
     */
	public String generateID() {
		return String.format("id%d", itemIdCounter++);
	}
	/**
     * @return  int
     */
	public int getActualItemsCount() {
		return position;
	}

}
