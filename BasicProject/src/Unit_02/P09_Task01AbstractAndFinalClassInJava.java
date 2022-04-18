package Unit_02;


abstract class bike{
int a;
 bike()
 {
	 System.out.println("inside bike constructor:"+a+"\n");
 }
 abstract void run();//abstract method(0-100%)
   void display() {
	   System.out.println("the is display method!");
   }
}
 
 class honda extends bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
	 
 }
 public class P09_Task01AbstractAndFinalClassInJava {
	 public static void main(String[] args) {
		 bike obj=new honda();
		 //obj.run();
		 obj.display();
		 //can not be instantiated
		 //bike obj2=new bike
	 }
 }
 
 //Final class
  final class Super{
	  public int data=30;
	  void display() {
		  System.out.println(data);
	  }
  }
 /*
    public class sub extends Super{
    void display2(){
    display();
    }
    }
    
  */
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 