package main;
import java.util.Comparator;
import java.util.Arrays;

public class Group {
	private String groupName;
	private Student[] students=new Student[10];
	public Group(String groupName, Student[] students) {
		super();
		this.groupName = groupName;
		this.students = students;
	}
	public Group() {
		super();
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Student[] getStudens() {
		return students;
	}
	public void setStudens(Student[] students) {
		this.students = students;
	}
	public void addStudent(Student student) throws GroupOverflowException{
		for(int i=0;i<students.length;i++) {
			if(students[i]==null) {
				students[i]=student;
				System.out.println("add to group");
				return;
	}
		}
	throw new GroupOverflowException("the group is overcrowded");
}
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
		for(int i=0;i<students.length;i++) {
			if(students[i]!=null) {
				if(students[i].getLastName().equals(lastName)) {
					return students[i];
				}
			}
		}
		throw new StudentNotFoundException("Don't found student.");
	}
	public boolean removeStudentById(int id) {
		for(int i=0;i<students.length;i++) {
			if(students[i]!=null) {
				if(students[i].getId()==id) {
					students[i]=null;
					return true;
				}
			}
		}
		return false;
	}
	public void sortStudentsByLastName() {
		Arrays.sort(students, new StudantLastNameComparator());
	}
		@Override
		public String toString() {
	        sortStudentsByLastName(); 
	        StringBuilder list = new StringBuilder("Group: " + groupName + System.lineSeparator());
	        for (Student student : students) {
	            if (student != null) {
	                list.append(student).append(System.lineSeparator());
	            }
	        }
	        return list.toString();
	    }
	}
	
	
