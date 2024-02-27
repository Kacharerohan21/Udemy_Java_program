package JavaTutorial;

public class String_methods {

	public static void main(String[] args) {
		
		String str="This is the string method demo";
		String str1="Hello";
		String str2="Hello";
		String str4="";
		String str5="   the trim method check    ";
		
		//length method
		System.out.println(str.length());
		//I have create the variable 'l' and print the value on this variable  
		int l=str.length();
		System.out.println(l);
		
		//The method helps to find out the char position.
		System.out.println(str.charAt(1));
		
		/*
		 * concat method  
		 * This method add the two string.
		 */
		System.out.println(str.concat(" & I have added the new sentance here"));
		//I have create the new string str3 and print the str3
		//In the string 'str3' method, I have str3 object.
		String str3=str.concat(" & I have added the new sentance here");
		System.out.println(str3);
		
		// Contains method, is verify the string value is present or not. The value is present then True value is displayed else False   
		// valid data 
		System.out.println(str.contains("is"));
		//invalid data
		System.out.println(str.contains("si"));
		
		/*
		 * StartsWith method, is verify the first value is correct or not. The value is present then True value is displayed else False   
		 */
		//valid data
		System.out.println(str.startsWith("This"));
		//invalid data
		System.out.println(str.startsWith("is"));
		
		/*
		 * StartsWith method, is verify the last value is correct or not. The value is present then True value is displayed else False  
		 * */
		// valid data
		System.out.println(str.endsWith("demo"));
		// invalid data
		System.out.println(str.endsWith("this"));
		
		// Equals method check the two string is equal or not
		// valid data
		System.out.println(str1.equals(str2));
		// invalid data
		System.out.println(str.equals(str3));
		
		// indexof method, this is help to check the value which position
		System.out.println(str.indexOf("d"));
		
		// 	Empty and Blank method is used to check the string is empty or not
		// valid 
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		// invalid data
		System.out.println(str4.isEmpty());
		System.out.println(str4.isBlank());
		
		//trim method, this method is reduce the value
		System.out.println(str5.trim());
		
		// lower case is method help to string print the lower case 
		System.out.println(str.toLowerCase());
		
		//Uppercase this method help to string print in the upper case format
		System.out.println(str.toUpperCase());
		
		//replace the value
		System.out.println(str1.replace("h","E"));
		
		char[] charArray = str.toCharArray();
		for(int i=0;i<=charArray.length;i++)
		{
			System.out.println("Index " +i +" is :" + charArray[i]);
		}
		 
		
	}

}
