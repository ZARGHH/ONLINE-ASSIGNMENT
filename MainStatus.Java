
class MainStatus 

{
	String s="PASS";
	void display()
	{
System.out.println("IF 80% OR ABOVE FIRST DIVISION");
System.out.println("IF 70% OR ABOVE SECOND DIVISION");
System.out.println("IF 60% OR ABOVE THIRD DIVISION");
	}
	public static void main(String[] args) 
	{
		System.out.println("START OF JAVA CODE");
		System.out.println("S IS"+new MainStatus().s);
		new MainStatus().display();
		System.out.println("END OF JAVA CODE");
	}
}
