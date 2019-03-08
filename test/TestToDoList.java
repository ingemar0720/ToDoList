import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TestToDoList {
	private ToDoList list = null;
	
	@Before
	public void setUp() {
		list = new ToDoList();
			}
	@Test
	public void testAddItem() {
		Item item = new Item("Todo1", "Write report", "08/03/2019");
		list.addItem(item);
		ArrayList<Item> items = list.getItems();
		assertEquals(1, items.size());
		boolean exists = false;
		for (Item m : items) {
			if (m.getId().equals("Todo1")) exists = true;
		}
		assertTrue(exists);
	}

}
