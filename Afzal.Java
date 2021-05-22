class Information
{
	int sid=121;
	double cfees=1234.50;
}




class Afzal
{
	public static void main(String[] args) 
	{
		System.out.println("Start Of Java Program");
		Information d=new Information();
		System.out.println("Student id is"+ new Information().sid);
		System.out.println("College fees is"+new Information().cfees);
		d.sid=125;
		d.cfees=1234.89;
		System.out.println("New student id is"+d.sid);
		System.out.println("New College fees is"+d.cfees);
		System.out.println("End of Java Code");

	}
}
