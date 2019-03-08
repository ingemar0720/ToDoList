import java.util.ArrayList;

public class ToDoList {

	ArrayList<Item> items = new ArrayList<>();
	
	public void addItem(Item item) {
		this.items.add(item);	
	}

	public ArrayList<Item> getItems() {
		return this.items;
	}

}
