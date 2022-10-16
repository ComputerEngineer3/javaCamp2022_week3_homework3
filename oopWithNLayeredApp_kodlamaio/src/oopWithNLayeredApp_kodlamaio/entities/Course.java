package oopWithNLayeredApp_kodlamaio.entities;

public class Course {
	private int id;
	private int instructorId;
	private int categoryId;
	private String name;
	private String description;
	private String imageUrl;
	private double unitPrice;
	
	public Course() {
		
	}

	public Course(int id, int instructorId, int categoryId, String name, String description, String imageUrl,
			double unitPrice) {
		this.id = id;
		this.instructorId = instructorId;
		this.categoryId = categoryId;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	
	
	
}
