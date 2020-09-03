package Core;

public class Course {
	private String code, name, instructor;
	public Course(String code, String name, String instructor) {
		this.code = code;
		this.name = name;
		this.instructor = instructor;
	}
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public String getInstructor() {
		return instructor;
	}

	
}
