
public class Item {
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	private String id;
	private String title;
	private String dueDate;
	
	public Item(String id, String title, String dueDate) {
		super();
		this.id = id;
		this.title = title;
		this.dueDate = dueDate;
	}
}
