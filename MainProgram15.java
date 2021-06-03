class Program1
{
	int a=90;
	int b= 80;
	void read(){
	System.out.println(a);
	System.out.println(b);
}
}
class Program2 extends Program1
{
	void execute()
	{
		System.out.println("Execute method initaited");
	}
}
class Program3 extends Program2
{
	double r=7.89;
	
}
class MainProgram15

{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java code");
		Program3 p3=new Program3();
		Program2 p2=p3;
		Program1 p1=p2;
		p1.read();
		p1.execute();
			System.out.println("End of Java code");

	}
}
