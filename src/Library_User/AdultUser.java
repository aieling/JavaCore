package Library_User;

public class AdultUser implements LibraryUser{
	protected int age;
	protected String bookType;
	
	
	@Override
	public void registerAccount() {
		if(this.getAge() > 12) {
			System.out.println("You have successfully registered under an Adult account");
		}
		else {
			System.out.println("Sorry, age must be greater than 12 to register as an adult");
		}
		
	}

	@Override
	public void requestBook() {
		if(this.getBookType().toLowerCase() == "fiction") {
			System.out.println("Book issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult fiction books");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	

}
