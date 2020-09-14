package Core;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsefulMethods {

	public static void main(String[] args) {
		/* Compares this string to the specified object. 
		The result is true if and only if the argument is 
		not null and is a String object that represents the same 
		sequence of characters as this object */
		
		String firstName = "Helene";
		String firstName2 = "Helene";
		String firstName3 = "helene";
		boolean isEqual = firstName.equals(firstName3);
		boolean isEqualIgnCase = firstName.equalsIgnoreCase(firstName3);
		System.out.println(isEqual);
		System.out.println(isEqualIgnCase);
		
		String hello = "Hello World";
		
		/* Substring Returns a string that is a substring of this string. The substring begins 
		 with the character at the specified index and extends to the end of this string*/ 
		System.out.println(hello.substring(6));
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.append(" World"));
		System.out.println(sb.insert(5, " New"));
		System.out.println(sb.replace(5, 9, " Old"));
		System.out.println(sb.reverse());
		
		/* Bitwise et Operator shifting */
		int x = 10;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(x<<2);
		
		/* prder elements in an array */
		int[] ordArray = {4,2,9,13,1,0};
		Arrays.sort(ordArray);
		System.out.println(Arrays.toString(ordArray));
		
		
		/* Regex */
		//Split Splits this string around matches of the given regular expression.
		String reg = "Don't repeat yourself";
		reg.split(" ");
		
		/*
		 * The java lang.string.trim()is a built-in function that eliminates leading and trailing spaces. 
		 * The Unicode value of space character is ‘\u0020’. The trim() method in java checks this Unicode 
		 * value before and after the string, if it exists then removes the spaces and returns the omitted string.
		 */
		String[] names = {"Doe,John","Doe, Jane","Doe,James"," Doe,Joan"};
		for(String name:names) {
			System.out.println("\nFirst Name:"+(name.trim()).substring(4).trim());
			System.out.println("\nSecond Name:"+name.trim().substring(0, 3).trim());
		}
		
		cssMatcher();

	}
	/* Matcher */
	public static void patternMatcher() {
		
		String[] found =  {"youhavefoundme", "youdidntfindme", "notinthisone", "itisfoundhere"};

            String patternString = "(found)";

            Pattern pattern = Pattern.compile(patternString);

            for(int i = 0; i < found.length; i++) {
                Matcher matcher = pattern.matcher(found[i]);
                if(matcher.find()) {
                    System.out.println("I found it! : "+found[i]);
                }

            }

	}
	
	/* Matcher */
	public static void cssMatcher() {
		
		String found =  "#22";

            String patternString = "#\\d{3,}[a-zA-Z]{0,3}";

            Pattern pattern = Pattern.compile(patternString);


                Matcher matcher = pattern.matcher(found);
                if(matcher.find()) {
                    System.out.println("I found it! : "+found);
                }

      

	}

}
