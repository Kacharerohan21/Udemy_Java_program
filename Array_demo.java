package JavaTutorial;

public class Array_demo {

	public static void main(String args[])
	{
		int myIntArray[]= {10,20};
		int []myIntArray1;
		myIntArray1 =new int[10];
		myIntArray1[0]=100;
		myIntArray1[1]=30;
		
		System.out.println("index 0 : " +myIntArray[0]);
		System.out.println("index 1: " + myIntArray[1]);
		System.out.println("index 0 : " +myIntArray1[0]);
		System.out.println("index 1 : " +myIntArray1[1]);
		System.out.println("index 2 : " +myIntArray1[2]);
		
		String myStringArray[]= {"Rohan","Rohit","Rahul"};
		System.out.println("\n String Array");
		System.out.println("\nIndex 0 : " + myStringArray[0]);
		System.out.println("Index 1 : " +myStringArray[1]);
		System.out.println("Index 2 : "+ myStringArray[2]);
		
		int len=myIntArray.length;
		int len1=myIntArray1.length;
		int len2=myStringArray.length;
		
		System.out.println("\n");
		System.out.println("Length of Integer Array :" +len);
		System.out.println("Length of integer Array :" +len1);
		System.out.println("Length of String Array : " +len2);
		
		
	}
}
