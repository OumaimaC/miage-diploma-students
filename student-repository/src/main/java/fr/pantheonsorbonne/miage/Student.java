package fr.pantheonsorbonne.miage;

public class Student {

	private int id;


	public Student(int id, String name, String title) {
		this.name = name;
		this.title = title;
		this.id = id;

	}

	public void Student1(int id2, String name2, String title2) {
		// TODO Auto-generated constructor stub
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String title;

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return this.getTitle() + " " + this.getName();
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
