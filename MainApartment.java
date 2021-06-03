class Apartment
{
	void Floor(String ownername,int floor)
	{
		System.out.println(" floor method executed");
        System.out.println("Owner name is"+ownername);
		System.out.println("flooe number is"+floor);
}
void Floor(String Direction, char sex)
	{
System.out.println("floor method exceuted");
System.out.println(" The Direction of Flat is"+Direction);
System.out.println("Gender of the Owner is"+sex);
	}
}

class MainApartment 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Code");
		Apartment sc=new Apartment();
		sc.Floor("MR GUPTA",1);
		sc.Floor("Left",'M');
		System.out.println("End of Java Code");

	}
}
