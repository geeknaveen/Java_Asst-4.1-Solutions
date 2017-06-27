//Assignment 4.1*******
//Write a program to demonstrate the use of method overloading and method overriding.

package asst4_1;

//NOTE:
// 1) In overloading, child class will get more priority than object class.
// 2) When we pass null in m1() String version method got executed, since the child class methods gets more priority.
// 3) In overloading method resolution is always taken care by compiler based on reference type. 
//    Runtime object wont play any role.

//Overloading is a method refers to methods with same name and different number of parameters

//Declaring Class OverloadingEX
public class OverloadingEx  
{
	public void m1(Object o) 
	{
		System.out.println("Object here");
	}
 
	public void m1(String s) 
	{
		System.out.println("String here");
	}
 
	public static void main(String[] args) 
	{
		OverloadingEx t = new OverloadingEx();
		t.m1("Naveen"); //String here
		t.m1(new Object()); //Object here
		
		//Passing  null in m1() String version method 
		t.m1(null); //String here
}
	}

 
 