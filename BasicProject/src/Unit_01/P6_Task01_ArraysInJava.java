package Unit_01;

/*
 * Normally, an Array is a collection of similar data type of elements which has comtiguous memory locations
 * Java array is an object which contains elements of a similar data type
 * we can store only a fixed set of elements in a java array
 * Size limit issue:
 *   -We can store only the fixed size of elements in the array
 *   -It doesn't grow its sze at runtime
 *   - To solve this problem, collection framework is used in java which grows automatically 
 * - There are two types of array
 *   -Single Dimensional array
 *   -Multidimesional array
 *   
 * -Declare an array in java
 *   - Data type arrayRefVar[];
 *   OR
 *   - DataType[] arrayRefVar;
 *   OR
 *   - DataType[] arrayRefVar;
 *   
 * -Instantiation of an array in java
 *   - arrayRefVar=new datatype[size]
 *   
 */

public class P6_Task01_ArraysInJava {

	public static void main(String[] args) {
		// Declaration 
		int array1[];
		
		int[] array2;
		int []array3;
		
		
		//Can not do it as we have not provide it any memory/space yet!
		//array1[0] = 1;
		
		//Iniatialization, during initialization we have to provide the size of the array
		
		array1 = new int[6]; //{1,2,3,4};
		
		//Assigning values to the java array
		for (int i = 0; i < arrray1.lenght; i++)//length is the property of array
			array[i] = i;
		
		int arrray4[] = {33, 3, 4, 5};

	}

}
