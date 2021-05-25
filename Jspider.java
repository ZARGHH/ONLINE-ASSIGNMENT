class Btm
{
	String name="Zargham";
	long  phone=9748916814L;
	String center="BTM LAYOUT";
	void display()
	{
			System.out.println("Name of the Student"+name);
			System.out.println("Name of the center "+center);
			System.out.println("Student phone number is"+phone);


	}
	}



class Jspider
{
	public static void main(String[] args) 
	{
		Btm cs=new Btm();
		System.out.println("Start of Java Code");
		cs.display();
		System.out.println("End of Java Code");
	}
}
