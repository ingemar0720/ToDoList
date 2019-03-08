import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	private static ToDoList list = new ToDoList();
	
	public static void main(String[] args){
		boolean exit = false;
		do {
			showMenu();
			int input = readInput();
			if (input==9) exit=true;
		} while (!exit);
	}
	
	public static void showMenu(){
		System.out.println("Welcome to To Do List Application");
		//showCurrentList();
		System.out.println("Menu: ");
		System.out.println("1. List all to do list");
		System.out.println("2. Add new item");
		System.out.println("3. Delete an item");
		//System.out.println("4. Mark an item as complete");
		System.out.println("9. Quit");
		System.out.print("Enter your choice: ");
	}
	
	public static int readInput(){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.nextLine();
		
		switch(input){
		case 1:
			System.out.println("All items:");
			List<Item> items = list.getItems();
			for (Item item: items) {
				System.out.printf("%s: %s (%s)\n", item.getId(), item.getTitle(), item.getDueDate());
			}
			break;
			
		case 2: {
			System.out.println("Add New Item:");
			
			System.out.println("Id: ");
			String id = scanner.nextLine();
			System.out.println("Title: ");
			String title = scanner.nextLine();
			System.out.println("Due Date: ");
			String dueDate = scanner.nextLine();
			
			Item item = new Item(id, title, dueDate);
			list.addItem(item);
		}
			
			break;
			
		case 3: {
			System.out.println("Delete Item:");
			
			System.out.println("Id: ");
			String id = scanner.nextLine();
			
			list.deleteItem(id);
		}
			break;
			
		case 9:

			break;
		default:
			System.out.println("Invalid choice");
		}
		
		System.out.println("");
		return input;
	}
	
	public static void showCurrentList(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Fix bug no 1");
		list.add("Fix bug no 2");
		list.add("Fix bug no 3");
		
		for (String s : list){
			System.out.println(s);
		}
		
	}
}