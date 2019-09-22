 package pentakota;
class A
{
  int method1(int i)
  {
	  return i;
  }
  int method2(int x)
  {
	  return x;
  }
  
  int method3(int y)
  {
	  return y;
  }
  
}

class Test
{
	public static void main(String[] args)
	{
		A a =  new A();
		System.out.println(a.method1(23));
		System.out.println(a.method2(34));
		System.out.println(a.method3(56));
	}
}
