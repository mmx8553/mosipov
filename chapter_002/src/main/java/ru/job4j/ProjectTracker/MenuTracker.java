package ru.job4j.ProjectTracker;
/**
 * @since 18.06.2017
 */

public class MenuTracker {
	/** var. */
    private Input input;
	/** var. */
    private Tracker tracker;
	/** var. */
    private UserAction[] actions = new UserAction[10];
	/** @param input Input  **param**
	*	@param tracker Tracker  **param**  */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
	/** method. */
    public void fillActions() {
        this.actions[0] = new AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] = new EditItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new FindItemById();
        this.actions[5] = new ItemsListByName();
        this.actions[6] = new ExitSystem();
    }
	/** @param key int  **param**
	*/
    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }
	/** method. show all menu. */
    public void show() {
        for (UserAction action:this.actions) {
            if (action != null) {
                System.out.println(new StringBuilder().append(action.key()).append(". ").append(action.info()).toString());
            }
        }
    }
	/** some comment. */
    private class AddItem implements UserAction {
		/**  @return  int  */
        public int key() {
            return 0;
        }
		/** @param input Input  **param**
		 *	@param tracker Tracker  **param**  */
        public void execute(Input input, Tracker tracker) {
            //String name = input.ask("");
            tracker.add(new Item(input.ask("Name:"), input.ask("Description:"), (long) System.currentTimeMillis()));
        }
		/**  @return  String  */
        public String info() {
            return "Add new Item";
        }
    }
	/** some comment about class. */
    private static class ShowItems implements UserAction {
		/**  @return  int  */
        public int key() {
            return 1;
        }
		/** @param input Input  **param**
		 *	@param tracker Tracker  **param**  */
        public void execute(Input input, Tracker tracker) {
            //String name = input.ask("");
            System.out.println("Items List :");
            for (Item item : tracker.findAll()) {
                System.out.println(String.format("%s %s %s", item.getId(), item.getName(), item.getDescription()));
            }
        }
		/**  @return  String  */
        public String info() {
            return "Show all items ( id / name / description )";
        }
    }

	/** some comment about class. */
    private class DeleteItem implements UserAction {
		/**  @return  int  */
        public int key() {
            return 3;
        }
		/** @param input Input  **param**
		 *	@param tracker Tracker  **param**  */
        public void execute(Input input, Tracker tracker) {
            //String name = input.ask("");
            Item itemInstanceToProceed = new Item();
            itemInstanceToProceed.setId(input.ask("Id="));
            tracker.delete(itemInstanceToProceed);
        }
		/**  @return  String  */
        public String info() {
            return "Delete Item.";
        }
    }

	/** some comment about class. */
    private class FindItemById implements UserAction {
		/**  @return  int  */
        public int key() {
            return 4;
        }
		/** @param input Input  **param**
		 *	@param tracker Tracker  **param**  */
        public void execute(Input input, Tracker tracker) {
            Item itemInstanceToProceed = new Item();
            itemInstanceToProceed = tracker.findById(input.ask("Id="));
            System.out.println(String.format(" Found: %s %s %s", itemInstanceToProceed.getId(), itemInstanceToProceed.getName(), itemInstanceToProceed.getDescription()));
        }
		/**  @return  String  */
        public String info() {
            return "Find Item by ID: (id, name, desc)";
        }
    }

	/** some comment about class. */
    private class ItemsListByName implements UserAction {
		/**  @return  int  */
        public int key() {
            return 5;
        }
		/** @param input Input  **param**
		 *	@param tracker Tracker  **param**  */
        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findByName(input.ask("Name? = "))) {
                System.out.println(String.format("%s %s %s", item.getId(), item.getName(), item.getDescription()));
            }
        }
		/**  @return  String  */
        public String info() {
            return "Items List by NAME: (id, name, desc)";
        }
    }
}

/** some comment about class. */
class EditItem implements UserAction {
	/**  @return  int  */
    public int key() {
        return 2;
    }
	/** @param input Input  **param**
	 *	@param tracker Tracker  **param**  */
    public void execute(Input input, Tracker tracker) {
        Item itemInstanceToProceed = new Item();
        itemInstanceToProceed.setId(input.ask("Enter Item Id :"));
        itemInstanceToProceed.setName(input.ask("Enter Item Name :"));
        itemInstanceToProceed.setDescription(input.ask("Enter Item Desc :"));
        tracker.update(itemInstanceToProceed);
    }
	/**  @return  String  */
    public String info() {
        return "Edit item";
    }
}

/** some comment about class. */
class ExitSystem implements UserAction {
	/**  @return  int  */
    public int key() {
        return 6;
    }
	/** @param input Input  **param**
	 *	@param tracker Tracker  **param**  */
    public void execute(Input input, Tracker tracker) {
    }
	/**  @return  String  */
    public String info() {
        return "Exit.";
    }
}