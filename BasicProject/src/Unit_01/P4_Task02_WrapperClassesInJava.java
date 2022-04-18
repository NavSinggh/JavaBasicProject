package Unit_01;


/*
 * The Wrapper Class In JavaProvides the mechanism to convert primitive into object and why?
 * Because we want to use predefined method of those objects
 * - Boolean dat type -> Boolean 
 * obj ->obj.toString();
 */
public class P4_Task02_WrapperClassesInJava {
	

	public static void main(String[] args) {
        
		// Converting int into integer
		
		 int a = 20;
		 
		 String s = ""+ a + "";
		 
		 Integer i = Integer.valueOf(a); // Converting int into Integer explicitly
		 Integer j = a; // Autoboxing, now compiler will write Integer.valueOf(a) internall
		 
		 System.out.println(a + " " + i + " " + j );
		 
		 System.out.println(i.toString());                                                                                                                          
		 
		 //a.toString() can not be done due to a is int not object
		 
		 //autoboxing : Converting primitve into objects
		 
		 byte b = 10;
		 
		 Byte byteobj = b;
		 
		 System.out.println(byteobj);
		 
		 //Unboxing: Converting Objects to primitives
		 
		 byte bytevalue=byteobj;
		 System.out.println(bytevalue);
		 
		                                                                                                                                                                                  
		                                                                    
		

	}

}
