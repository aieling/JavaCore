package Library_User;

public class KidUsers implements LibraryUser{
	protected int age;
	protected String bookType;
	
	
	@Override
	public void registerAccount() {
		if(this.getAge() < 12) {
			System.out.println("You have successfully registered under a Kids account");
		}
		else {
			System.out.println("Sorry, age must be less than 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook() {
		if(this.getBookType().toLowerCase() == "kids") {
			System.out.println("Book issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getBookType() {
		return this.bookType;
	}


	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	
	

}
