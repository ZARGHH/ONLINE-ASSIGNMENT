class Book1
{
	void read()
	{
		System.out.println("BOOK IS UED FOR READING");
	}
}
class StoryBook
	{
void story(Book1 ref)
{
	ref.read();
}
	}
class MainClass10 
{
	public static void main(String[] args) 
	{
		System.out.println("Start of Java Code");
		StoryBook sc=new StoryBook();
		sc.story(new Book1());
		System.out.println("END OF JAVA CODE");
	}
}
