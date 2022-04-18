package Unit_01;

import java.util.Scanner;

/*
 * When user takes input from console!
 * 
 * nextLine()           Read User Input [to read Strings]
 * next()               Read next token from the input entered by the user 
 * 
 * nextBoolean()        Reads a boolean value from the user
 * nextByte()           Reads a byte value from the user
 * nextDouble()         reads a double from the user
 * nextInt()            Reads a integer value from the user
 * nextLine()           Reads a String value from the user
 * nextLong()           reads a long value from the user
 * nextShort()          Reads a short value from the user
 */

public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
	        
		Scanner myObj1 = new Scanner(System.in); // Create a scanner object
		Scanner myObj2 = new Scanner(System.in);
		
		
		// Read the First-Token: (_ Space bar )
		
		System.out.println("Name is:" + firstName + "\n ");
		
		String name = myObj2.nextLine(); //(\n)
		String name2 = myObj2.nextLine(); //(\n)
		
		System.out.println("Name is :" +name + "\n");
		System.out.println("Name is:" + name2 + "\n");
		
		boolean b = myObj2.nextBoolean();
		System.out.println(b + "\n");
		
		
		myObj1.close();
		myObj2.close();

	}

}
