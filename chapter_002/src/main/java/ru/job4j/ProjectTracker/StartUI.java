package ru.job4j.ProjectTracker;
/**
 * @since 18.06.2017
 */
public class StartUI {
	/** Some text. */
    private int[] selectRange = new int[]{1, 2};
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
	/** init method. */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        //todo - start
        selectRange = menu.getMenuRange();
        do {
            try {
            menu.show();
            menu.select(this.input.ask("Select menu :", selectRange));
            } catch (NullPointerException npe) {
                System.out.println("something not found  ");
                npe.printStackTrace();
            }
        } while ((this.input.ask("Exit ? (y)").equals("y")) ? false : true);
    }

	/** @param args String[] **param**  */
     public static void main(String[] args) {
//        Tracker tracker = new Tracker();
//        new StartUI(tracker,new ConsoleInput()).init();

        new StartUI(new Tracker(), new ConsoleInput()).init();

    }
}