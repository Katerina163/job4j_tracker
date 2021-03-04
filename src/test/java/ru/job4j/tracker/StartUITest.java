package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }
    @Test
    public void whenEditItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String editName = "New item name";
        String id = String.valueOf(item.getId());
        Input in = new StubInput(
                new String[] {"0", id, editName, "1"}
        );
        UserAction[] actions = {
                new EditAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(editName));
    }
    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        String id = String.valueOf(item.getId());
        Input in = new StubInput(
                new String[] {"0" , id, "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
    @Test
    public void whenShowAll() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("item"));
        Item[] name = tracker.findAll();
        Input in = new StubInput(
                new String[] {"0" , "1"}
        );
        UserAction[] actions = {
                new ShowAllActions(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(name[0]));
    }
    @Test
    public void whenFoundId() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("item"));
        String id = String.valueOf(item.getId());
        Item[] name = tracker.findAll();
        Input in = new StubInput(
                new String[] {"0" , id, "1"}
        );
        UserAction[] actions = {
                new FoundIdAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find item by Id" + System.lineSeparator() +
                        "1. Exit Program" + System.lineSeparator() +
                        name[0] +  System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find item by Id" + System.lineSeparator() +
                        "1. Exit Program" + System.lineSeparator()
        ));
    }
    @Test
    public void whenFoundName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        String name = "item";
        Item item = tracker.add(new Item(name));
        Item[] it = tracker.findAll();
        Input in = new StubInput(
                new String[] {"0" , name, "1"}
        );
        UserAction[] actions = {
                new FoundNameAction(out),
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Find items by name" + System.lineSeparator() +
                        "1. Exit Program" + System.lineSeparator() +
                        it[0] +  System.lineSeparator() +
                        "Menu." + System.lineSeparator() +
                        "0. Find items by name" + System.lineSeparator() +
                        "1. Exit Program" + System.lineSeparator()
        ));
    }
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator() +
                        "0. Exit Program" + System.lineSeparator()
        ));
    }
}