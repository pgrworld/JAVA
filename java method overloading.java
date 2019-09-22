package pentakota;
class A
{
	void add(int i, int j)
	{
		System.out.println(i+j);
	}
	void add(String str)
	{
		System.out.println(str);
	}	
	
}

class Test
{
	public static void main(String[] args)
	{
		A a = new A();
		a.add(12,23);
		a.add("haii anna");
		
	}
}
