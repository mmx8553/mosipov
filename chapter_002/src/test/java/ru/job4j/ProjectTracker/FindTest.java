package ru.job4j.ProjectTracker;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.core.Is.is;

/**
 * @since 10.05.2017
 */
public class FindTest {
        /** Test 1 of many.  */
        @Test
        public void testFindById() {
            Tracker tracker = new Tracker();
            Item item = tracker.add(new Item("name01", "desc01", 101));
            Assert.assertEquals(item.getId(), tracker.findById(item.getId()).getId());
        }
    /** Test 1 of many.  */
        @Test
        public void testAddAndFindByName() {
            Tracker tracker = new Tracker();
            Item item = tracker.add(new Item("name01", "desc01", 101));
            item = tracker.add(new Item("name02", "desc02", 102));
            Item itemSecond = tracker.findByName("name02")[0];
            Assert.assertEquals(itemSecond.getName(), (tracker.findByName("name02")[0].getName()));
        }
    /** Test 1 of many.  */
    @Test
    public void testAddAndFindAll() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("name01", "desc01", 101));
        item = tracker.add(new Item("name02", "desc02", 102));
        item = tracker.add(new Item("name03", "desc03", 103));
        item = tracker.add(new Item("name03", "desc33", 133));
        Assert.assertThat(tracker.findAll().length, is(4));
    }
    /** Test 1 of many.  */
    @Test
    public void testDelete() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("name01", "desc01", 101));
        item = tracker.add(new Item("name02", "desc02", 102));
        item = tracker.add(new Item("name03", "desc03", 103));
        item = tracker.add(new Item("name03", "desc33", 133));
        tracker.delete(tracker.findByName("name01")[0]);
        tracker.delete(tracker.findByName("name02")[0]);
        Assert.assertThat(tracker.findAll().length, is(2));
    }
    /** Test 1 of many.  */
    @Test
    public void testFindByName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("name01", "desc01", 101));
        item = tracker.add(new Item("name02", "desc02", 102));
        item = tracker.add(new Item("name03", "desc03", 103));
        item = tracker.add(new Item("name03", "desc33", 133));
        Assert.assertThat(tracker.findByName("name03").length, is(2));
    }
    /** Test 1 of many.  */
    @Test
    public void testUpdate() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("name01", "desc01", 101));
        String tempId = item.getId();
        Item itemChanger = new  Item("name55", "desc55", 155);
        itemChanger.setId(tempId);
        tracker.update(itemChanger);
        Assert.assertThat(itemChanger.getId(), is(tracker.findById(tempId).getId()));
        Assert.assertThat(itemChanger.getName(), is(tracker.findById(tempId).getName()));
        Assert.assertThat(itemChanger.getDescription(), is(tracker.findById(tempId).getDescription()));
        Assert.assertThat(itemChanger.getCreate(), is(tracker.findById(tempId).getCreate()));
    }
    /** Test 1 of 3.  */
    @Test
    public void testStubInput() {
        Tracker tracker = new Tracker();
		new StartUI(tracker, new StubInput(new String[] {"0", "n1", "d1", "n", "1", "y"})).init();
			Assert.assertThat(tracker.findAll()[0].getName(), is("n1"));
    }
    /** Test 2 of 3.  */
    @Test
    public void testStubInputUpdate() {
        Tracker tracker = new Tracker();
        new StartUI(tracker, new StubInput(new String[] {"0", "n1", "d1", "n", "0", "n2", "d2", "y"})).init();
        String tempId = tracker.findByName("n1")[0].getId();
        new StartUI(tracker, new StubInput(new String[] {"2", tempId, "n55", "d55", "y"})).init();
		Assert.assertThat(tracker.findByName("n55")[0].getDescription(), is("d55"));
    }
    /** Test 3 of 3.  */
    @Test
    public void testStubInputDelete() {
        Tracker tracker = new Tracker();
        new StartUI(tracker, new StubInput(new String[] {"0", "n1", "d1", "n", "0", "n2", "d2", "y"})).init();
        String tempId = tracker.findByName("n1")[0].getId();
        new StartUI(tracker, new StubInput(new String[] {"3", tempId, "y"})).init();
		Assert.assertThat(tracker.findAll().length, is(1));
    }
}