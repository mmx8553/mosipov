package ru.job4j.ProjectTracker;
/**
 * @since 18.06.2017
 */

public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private UserAction[] actions = new UserAction[10];
    

    public MenuTracker(Input input, Tracker tracker){
        this.input = input;
        this.tracker = tracker;
    }

    public void fillActions() {
        this.actions[0] = new AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] = new EditItem();
        this.actions[3] = new DeleteItem();
        this.actions[4] = new FindItemById();
        this.actions[5] = new ItemsListByName();
        this.actions[6] = new ExitSystem();



    }

    public void select(int key) {
        this.actions[key].execute(this.input, this.tracker);
    }

    public void show() {
        for (UserAction action:this.actions) {
            if (action != null) {
                System.out.println(new StringBuilder().append(action.key()).append(". ").append(action.info()).toString());
            }
        }
    }

    private class AddItem implements UserAction {
        public int key() {
            return 0;
        }

        public void execute(Input input, Tracker tracker) {
            //String name = input.ask("");
            tracker.add(new Item(input.ask("Name:"), input.ask("Description:"), (long) System.currentTimeMillis()));
        }

        public String info() {
            return "Add new Item";
        }
    }

    private static class ShowItems implements UserAction {
        public int key() {
            return 1;
        }

        public void execute(Input input, Tracker tracker) {
            //String name = input.ask("");
            System.out.println("Items List :");
            for (Item item : tracker.findAll()) {
                System.out.println(String.format("%s %s %s", item.getId(), item.getName(), item.getDescription()));
            }
        }

        public String info() {
            return "Show all items ( id / name / description )";
        }
    }


    private class DeleteItem implements UserAction {
        public int key() {
            return 3;
        }

        public void execute(Input input, Tracker tracker) {
            //String name = input.ask("");
            Item itemInstanceToProceed = new Item();
            itemInstanceToProceed.setId(input.ask("Id="));
            tracker.delete(itemInstanceToProceed);
        }

        public String info() {
            return "Delete Item.";
        }
    }


    private class FindItemById implements UserAction {
        public int key() {
            return 4;
        }

        public void execute(Input input, Tracker tracker) {
            Item itemInstanceToProceed = new Item();
            itemInstanceToProceed = tracker.findById(input.ask("Id="));
            System.out.println(String.format(" Found: %s %s %s", itemInstanceToProceed.getId(), itemInstanceToProceed.getName(), itemInstanceToProceed.getDescription()));
        }

        public String info() {
            return "Find Item by ID: (id, name, desc)";
        }
    }


    private class ItemsListByName implements UserAction {
        public int key() {
            return 5;
        }

        public void execute(Input input, Tracker tracker) {
            for (Item item : tracker.findByName(input.ask("Name? = "))) {
                System.out.println(String.format("%s %s %s", item.getId(), item.getName(), item.getDescription()));
            }
        }

        public String info() {
            return "Items List by NAME: (id, name, desc)";
        }
    }
}


class EditItem implements UserAction {

    public int key() {
        return 2;
    }

    public void execute(Input input, Tracker tracker) {
        Item itemInstanceToProceed = new Item();
        itemInstanceToProceed.setId(input.ask("Enter Item Id :"));
        itemInstanceToProceed.setName(input.ask("Enter Item Name :"));
        itemInstanceToProceed.setDescription(input.ask("Enter Item Desc :"));
        tracker.update(itemInstanceToProceed);
    }

    public String info() {
        return "Edit item";
    }
}

class ExitSystem implements UserAction {

    public int key() {
        return 6;
    }

    public void execute(Input input, Tracker tracker) {
    }

    public String info() {
        return "Exit.";
    }
}