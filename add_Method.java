package JavaTutorial;

public class add_Method {

	public static void main(String[] args) {
		finalGrades("Jack" ,90);
		finalGrades("Tom",70);
		finalGrades("Jery",80);
		finalGrades("phip",60);
		finalGrades("Yasmin",100);
		finalGrades("JJ",35);
		finalGrades("Jagan",34);

	}	
		public static void finalGrades(String studentname, int Score)
		{
			String Grades;
			if(Score>=90 && Score<=100)
			{
				Grades="A";
			}
			else if(Score>=80 && Score<90)
			{
				Grades="B";
			}
			else if(Score>=60 && Score<80)
			{
			Grades="C";
			}
			else if(Score>=35 && Score<60)
			{
			Grades="D";
			}
			
			else
			{
				Grades="Fails";
			}
			System.out.println("Student Name :" +studentname+"\nStudent percentage :" +Score+ "\nStudent Grade:" +Grades +"\n");
		}
	

}
