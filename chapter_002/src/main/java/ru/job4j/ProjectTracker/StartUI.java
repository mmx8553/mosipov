package ru.job4j.ProjectTracker;
/**
 * Основной Класс - запуск пользовательского интерфейса работы с трекером.
 * @author mosipov
 * @since 18.06.2017
 * @version 1
 *
 */
public class StartUI {
	/** диапазон допустимых значений. */
    private int[] selectRange = new int[]{1, 2};
	/** Inteface Input. */
    private Input input;
	/** Tracker. */
    private Tracker tracker;
	/**	коструктор с параметрами.
	*	@param tracker Tracker **param**
	*	@param iface Input **param**
	*/
    StartUI(Tracker tracker, Input iface) {
        this.input = iface;
        this.tracker = tracker;
    }
	/** init of main class method.
	*/
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        selectRange = menu.getMenuRange();
        do {
            menu.show();
            menu.select(this.input.ask("Select menu :", selectRange));
        } while ((this.input.ask("Exit ? (y)").equals("y")) ? false : true);
    }
	/** @param args String[] **param**
	*/
     public static void main(String[] args) {
        //new StartUI(new Tracker(), new ConsoleInput()).init();
		new StartUI(new Tracker(), new ValidateInput()).init();
    }
}