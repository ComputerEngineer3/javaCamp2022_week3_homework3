package oopWithNLayeredApp_kodlamaio.entities;

public class Instructor {
	private int id;
	private String firstName;
	private String lastName;
	private String imageUrl;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String firstName, String lastName, String imageUrl) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.imageUrl = imageUrl;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
}
