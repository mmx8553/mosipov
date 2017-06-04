package ru.job4j.ProjectTracker;
/**
 * 123.
 */
public class StartUI {
	/** Some text. */
    private Input input;
	/** @param iface Input **param**
	*/
    StartUI(Input iface) {
        this.input = iface;
    }
	/** Some text. */
	public static void mainMenuPrint() {
        String text = new String("\n"
                                             + "0. Add new Item\n"
                                            + "1. Show all items\n"
                                            + "2. Edit item\n"
                                            + "3. Delete item\n"
                                            + "4. Find item by Id\n"
                                            + "5. Find items by name\n"
                                            + "6. Exit Program\n");
        System.out.println(text);
    }
	/** Some text. */
	public void wrongEnterance() {
        System.out.println(" wrong! try again ");
    }
	/** Some text. */
    public void init() {
        Tracker tracker = new Tracker();
        String answer;
        Item itemInstanceToProceed;
        do {
            StartUI.mainMenuPrint();
            answer = input.ask("Select");

            switch (Integer.valueOf(answer)) {
                case 0 :
                    tracker.add(new Item(input.ask("Name:"), input.ask("Description:"), (long) System.currentTimeMillis()));
                    break;
                case 1:
                    System.out.println("Items List :");
                    for (Item item : tracker.findAll()) {
                        System.out.println(String.format("%s %s %s", item.getId(), item.getName(), item.getDescription()));
                    }
                    break;
                case 2:
                    System.out.println("Edit Item.");
                    itemInstanceToProceed = new Item();
                    itemInstanceToProceed.setId(input.ask("Enter Item Id :"));
                    itemInstanceToProceed.setName(input.ask("Enter Item Name :"));
                    itemInstanceToProceed.setDescription(input.ask("Enter Item Desc :"));
                    tracker.update(itemInstanceToProceed);
                    break;
                case 3:
                    System.out.println("Delete Item.");
                    itemInstanceToProceed = new Item();
                    itemInstanceToProceed.setId(input.ask("Id="));
                    tracker.delete(itemInstanceToProceed);
                    break;
                case 4:
                    System.out.println("Find Item by ID.");
                    itemInstanceToProceed = new Item();
                    itemInstanceToProceed = tracker.findById(input.ask("Id="));
                    System.out.println(String.format(" Found: %s %s %s", itemInstanceToProceed.getId(), itemInstanceToProceed.getName(), itemInstanceToProceed.getDescription()));
                    break;
                case 5:
                    System.out.println("Items List by NAME :");
                    for (Item item : tracker.findByName(input.ask("Name? = "))) {
                        System.out.println(String.format("%s %s %s", item.getId(), item.getName(), item.getDescription()));
                    }
                    break;
				default:
					wrongEnterance();
					break;
			}
        } while (!answer.equals("6"));
    }
	/** @param args String[] **param**
	*/
    public static void main(String[] args) {
        new StartUI(new ConsoleInput()).init();
    }
}