package Core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		try {
//			String location = "/Users/helenekev/eclipse-workspace/JavaCore/src/Core/loremIpsum";
//			File file = new File(location);
//			Scanner input = new Scanner(file);
			/*Example with a text file */ 
//			ArrayList<String> data = new ArrayList<String>();
//			while(input.hasNextLine()) {
//				data.add(input.nextLine());
//			}
//			for(String line:data) {
//				System.out.println(line);
//			}
			
			/* Example with a csv file */
//			ArrayList<String[]> data = new ArrayList<String[]>();
//			while(input.hasNextLine()) {
//				String line = input.nextLine();
//				data.add(line.split(","));
//			}
//			for(String[] line:data) {
//				System.out.println(line[0] + " | " + line[1] + " |" + line[2]);
//			}
	
			String location = "/Users/helenekev/eclipse-workspace/JavaCore/src/Core/tables.csv";
			File file = new File(location);
			
			Scanner input = new Scanner(file);
			ArrayList<Course> data = new ArrayList<Course>();
			
			while(input.hasNextLine()) {

				String[] line = input.nextLine().split(",");
				data.add(new Course(line[0],line[1],line[2]));
			}
			
			for(Course course:data) {
				
				System.out.format("%-15s|%-35s|%-25s\n",
						course.getCode(), course.getName(), course.getInstructor());
			}
			
			/* Write in a txt file */
			String location2 = "/Users/helenekev/eclipse-workspace/JavaCore/src/Core/hello.txt";
			File file2 = new File(location2);
			FileWriter writer = new FileWriter(file2,true);
			writer.write("Hello World\n");
			writer.write("hello again\n");
			writer.close();
			
			/* Write in a csv file */
			FileWriter writerCSV = new FileWriter(file,true);
			Course course1 = new Course("CIS335", "Advanced OOP", "Bairon V.");
//			writerCSV.write(course1.getCode() + ",");
//			writerCSV.write(course1.getName() + ",");
//			writerCSV.write(course1.getInstructor() + "\n");
			writerCSV.write(String.format("%s,%s,%s \n", course1.getCode(), course1.getName(), course1.getInstructor() ));
			writerCSV.close();
			
			for(Course courseCSV:data) {
				
				System.out.format("%-15s|%-35s|%-25s\n",
						courseCSV.getCode(), courseCSV.getName(), courseCSV.getInstructor());
			}
			

		}
		
		catch(FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}

	}

}
