class Object4
{
 static String s="Zargham";
 static boolean b= true;
 static char ch= 'm';
	static void detail()
	{
		System.out.println("Detais area as foolows");
		System.out.println(s);
		System.out.println(b);
		System.out.println(ch);
	}
	void print()
	{
		System.out.println("ALL DEATILS ARE PRINTED");
	}
}
class MAINOBJECT4 
{
	public static void main(String[] args) 
	{
		String profession= "ENGINEER";
		System.out.println("START OF JAVA PROGRAM");
Object4.detail();
new Object4().print();
System.out.println(profession);
System.out.println("END OF JAVA PROGRAM");
	}
}
