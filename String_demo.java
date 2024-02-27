package JavaTutorial;

public class String_demo {

	public static void main(String[] args) {
		//Initializing a string variable with the value "Rohan" 
		String str1="Rohan";
		System.out.println(str1);
		System.out.println(str1.length());
		
		
		//Creating a new string object with the value "Kachare"
		String str2=new String("Kachare");
		System.out.println(str2);
		
		// Add the two string 
		String stradd= str1 +" "+str2;
		System.out.println(stradd);
		
		
		//Concatenate the string " Kachare" to the existing string str1 and store the result in str3
		String str3=str1.concat(" Kachare");
		System.out.println(str3);
		
		// Get the length of the string str3 and by using variable 'l'  
		int l=str3.length();
		System.out.println(l);
		
		int l1=stradd.length();
		System.out.println(l1);
		
	}

}
