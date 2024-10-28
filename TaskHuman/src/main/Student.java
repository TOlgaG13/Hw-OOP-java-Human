package main;

public class Student extends Human {
	private int id;
	private String groupName;

	public Student(String name, String lastName, main.Human.Gender gender, int id, String groupName) {
		super(name, lastName, gender);
		this.id = id;
		this.groupName = groupName;
	}

	public Student(String name, String lastName, main.Human.Gender gender) {
		super(name, lastName, gender);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", groupName=" + groupName + ", toString()=" + super.toString() + "]";
	}

}
