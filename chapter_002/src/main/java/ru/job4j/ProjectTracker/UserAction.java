package ru.job4j.ProjectTracker;
/**
 * @since 18.06.2017
 */

public interface UserAction {
    int key();

    void execute(Input input, Tracker tracker);

    String info();
}