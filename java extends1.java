package pentakota;
class Test extends A
{
	public static void main(String[] args)
	{
		A a = new A();
	
		System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.x);
		System.out.println(a.y);
	}
}

class A extends  B
{
	int i = 34;
	int j = 45;
}

class B extends C
{
	int x = 56;
}

class C
{
	int y = 67;
}


