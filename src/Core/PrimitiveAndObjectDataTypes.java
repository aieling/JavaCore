package Core;
/**
 * 
 */

/**
 * @author helenekev
 *
 */
public class PrimitiveAndObjectDataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int primitive_num = 5;
		Integer Object_num = 6;
		
		boolean primitive_boolean = true;
		Boolean Object_boolean = false;
		
		float primitive_float = 5F;
		Float Object_float = 6F;
		
		String primitive_string = "Hello ";
		
		double primitive_double = 5D;
		Double Object_double = 6D;
		
		char primitive_char = 'G';
		Character Object_char = 'F';
		
		System.out.printf("int primitive num = %-13s Integer Object_num = %s\n", primitive_num,Object_num);
		System.out.printf("boolean primitive_boolean = %-13s Boolean Object_boolean = %s\n", primitive_boolean, Object_boolean);
		System.out.printf("float primitive_floßat = %-13f Float Object_float = %f\n", primitive_float, Object_float);
		System.out.printf("String_primitive = %s", primitive_string);
		System.out.printf("double primitive_double = %-13f Boolean Object_double = %2f \n", primitive_double, Object_double);
		System.out.printf("char primitive_char = %-13c Char Object_char = %c\n", primitive_char, Object_char);
		
		// Autoboxing : The primitive value is converting to an object of the corresponding wrapper class
		primitive_num = Object_num;
		
		// Unboxing : Converting an object of the wrapper type to its corresponding primitive value
		Object_boolean = primitive_boolean;
		
		// Explicit type casting
		primitive_float = (float) primitive_double;
		// Automatic type conversion 
		primitive_double = primitive_float;
		
		//Type Conversion examples
		Integer tempNumber = 0;
		float tempFloat = 0F;
		Double tempDouble = 0D;
		
		tempNumber = Math.round(Object_float);
		tempFloat = (float)tempFloat;
		tempDouble = (double)(Object_num);
		System.out.println(tempNumber+" "+tempFloat+" "+tempDouble);

	

		
		
		
		
		
	}

}
