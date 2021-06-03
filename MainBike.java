class Ride
{
	void riding()
	{
		System.out.println(" bike is  used for riding");
		System.out.println(" BIKE IS USED FOR SPEEDING");
}
}
class Speed
{
	void speeding( Ride ref)
	{
		ref.riding();
		
	}
}
class MainBike 
{
	public static void main(String[] args) 
	{
		System.out.println("START OF JAVA CODE");
		Speed s=new Speed();
		s.speeding(new Ride());
   System.out.println("END OF JAVA CODE");
	}
}
