class Milk
{
	String name;
	double cost;
	String catg;

	Milk(String n1,double c1, String ct )//parametarized constructor
	{
		name=n1;
		cost=c1;
		catg=ct;
	}

}

class MainMilk 
{
	public static void main(String[] args) 
	{
	System.out.println("Start of java code!");
	Milk s1=new Milk("AMULTAZA",24,"COW");
	System.out.println("NAME OF THE MILK IS"+s1.name);
	System.out.println( "Cost of Milk is"+s1.cost);
	System.out.println("Category of Milk"+s1.catg);
	System.out.println("********************");
	Milk s2=new Milk("AMULGOLD",30,"Buffalo");
	System.out.println("NAME OF THE MILK IS"+s2.name);
	System.out.println( "Cost of Milk is"+s2.cost);
	System.out.println("Category of Milk"+s2.catg);
	System.out.println("********************");
		Milk s3=new Milk("APPORVA",27,"Goat");
	System.out.println("NAME OF THE MILK IS"+s3.name);
	System.out.println( "Cost of Milk is"+s3.cost);
	System.out.println("Category of Milk"+s3.catg);
	System.out.println("********************");
	System.out.println("End of Java Code");

	}
}
