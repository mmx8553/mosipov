package ru.job4j.ProjectTracker;
/**
 * @since 18.06.2017
 */
public class StartUI {
	/** Some text. */
    private Input input;
	/** Some text. */
    private Tracker tracker;
	/** @param tracker Tracker **param**
	*	@param iface Input **param**
	*/
    StartUI(Tracker tracker, Input iface) {
        this.input = iface;
        this.tracker = tracker;
    }
	/** helping method. */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        int key = 11;
        do {
            menu.show();
            key = Integer.valueOf(this.input.ask("Select:"));
            menu.select(key);
        } while (key != 6);
                //(!answer.equals("6"));
    }
	/** @param args String[] **param**  */
     public static void main(String[] args) {
//        Tracker tracker = new Tracker();
//        new StartUI(tracker,new ConsoleInput()).init();

        new StartUI(new Tracker(), new ConsoleInput()).init();

    }
}