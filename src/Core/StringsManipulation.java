package Core;
/**
 * 
 */

/**
 * @author helenekev
 *
 */
public class StringsManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myString = "This is a Hello World";
		String str= "";
		System.out.println(myString);
		System.out.println(myString.charAt(10));
		System.out.println(myString.length());
		/*Compares this string to the specified object. The result is true if and 
		only if the argument is not null and is a String object that represents 
		the same sequence of characters as this object */
		System.out.println(myString.equals("This is"));
		/* Concatenates the specified string to the end of this string */
		System.out.println(myString.concat(", Hello"));

	}

}
