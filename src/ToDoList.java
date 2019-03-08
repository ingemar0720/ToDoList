import java.util.ArrayList;
import java.util.Iterator;

public class ToDoList {

	ArrayList<Item> items = new ArrayList<>();
	
	public void addItem(Item item) {
		this.items.add(item);	
	}

	public ArrayList<Item> getItems() {
		return this.items;
	}

	public void deleteItem(String itemId) {
		Iterator<Item> i = items.iterator();
		while(i.hasNext()) {
			Item item = i.next();
			if (item.getId().equals(itemId)) {
				i.remove();
			}
		}
	}

}
