package p1;
class test
{
	public static void main(String[] args)
	{
		char c='s';
		switch(c)
		{
		case'a':
			System.out.println("hello");
			break;
		case'b':
			System.out.println("done matching");
			break;
			default:
				System.out.println("no matching condition occur");
				break;
		}
	}
}
