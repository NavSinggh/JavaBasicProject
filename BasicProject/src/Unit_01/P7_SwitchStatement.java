package Unit_01;

import java.util.Scanner;

/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
       
       Scanner myObj= new Scanner(System.in);
       
		int ch;
		System.out.println("enter 1 for current year \n enter 2 for current month\n enter 3 for current day");
		   ch = myObj.nextInt();
		   
		 
			 switch(ch) {
			 case 1:
				 System.out.println("year is 2022");
				 break;
			 case 2:
				 System.out.println("current month is april");
				  break;
			 case 3 :
				  System.out.println("current day is saturday");
				  break;
			 case 4:
				 System.out.println("not applicable");
				 break;
				 default:
					 break;
	           }
			 
       }
}