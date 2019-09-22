package pentakota;
class A 
{
  int i = 45;
  int j = 78;
}

class B extends A
{
	int i = 458;
	int j = 788;
	B(int i, int j)
	{
		System.out.println(i);    //
		System.out.println(this.j);  //788
		System.out.println(super.j);  //78	
	}
}

class Test
{
	public static void main(String[] args)
	{
		B b = new B(23,45      );
	}
}



   
