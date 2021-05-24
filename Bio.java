class Bio
{
	String sub="BIO";
	void display()
	{
System.out.println(sub+" is a Science Subject");
System.out.println("I am a Science Student");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Code!");
		System.out.println("sub is"+new Bio().sub);
new Bio().display();
System.out.println("End of Java Code ");
	}
}
