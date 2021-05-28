class Pan
{
	String name;
	int age;
	String place;
	Pan( String na,int ag,String pl)
	{
		name=na;
		age=ag;
		place=pl;
	}

}
class MainPan 
{
	public static void main(String[] args) 
	{
		System.out.println("Start Of Java Code");
		Pan p1=new Pan("Zargham",23,"Kolkata");
		System.out.println("Name of the Pan Holder ="+p1.name);
		System.out.println("Age of the holder is ="+p1.age);
		System.out.println("Place of the Pan Holder ="+p1.place);
		System.out.println("***********************");
		Pan p2=new Pan("Ayush",29,"Punjab");
		System.out.println("Name of the Pan Holder"+p2.name);
		System.out.println("Age of the holder is ="+p2.age);
		System.out.println("Place of the Pan Holder"+p2.place);
		System.out.println("***********************");
		Pan p3=new Pan("Udit",42,"Mangalore");
		System.out.println("Name of the Pan Holder="+p3.name);
		System.out.println("Age of the holder is ="+p3.age);
		System.out.println("Place of the Pan Holder ="+p3.place);
		System.out.println("***********************");
		System.out.println("End oF Java Code");
	}
}
