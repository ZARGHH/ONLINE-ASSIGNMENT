class College
{
	static String name="MD ALAM";
	int rollnumber=12;
	static void detail()
	{
		System.out.println("Display my details ");
		}
		void exam()
	{
			System.out.println("Exam of College will start");
	}
}

class MainCollege 
{
	static String clgname="BBIT";
	int uan=23456;
	void display()
	{
		System.out.println("Display the college Detail");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Code");
		College ref=new College();
		College.detail();
		System.out.println( "Name of Student is"+ College.name);
		System.out.println( "Name of the College"+clgname);
		System.out.println("Roll Number of the Student is"+ref.rollnumber);
		new MainCollege().display();
		System.out.println( "Name of the College"+clgname);
		System.out.println( "College uan number is"+ new MainCollege().uan);
		ref.exam();
         System.out.println("End of Java Code");
		
	}
}
