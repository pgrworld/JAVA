package p1;
class test
{
   String text1 = "value1";
   String text2 = "value2";
   String text3 = "value3";
   int i = 255;
   
    public void display_Emp_Details()
    {
    	System.out.println(text1);
    	System.out.println(text2);
    	System.out.println(text3);
    	System.out.println(i);
    }
}
class test2 
{
	public static void main(String[] args)
	{
		test t1 = new test();
		t1.display_Emp_Details();
	}
}
