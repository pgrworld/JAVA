package training;
import java.util.*;
class Test
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add("rahul");
		a1.add("anna");
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
		a2.addAll(a1);
		System.out.println(a2);
		System.out.println(a2.remove("rahul"));
		System.out.println(a1.removeAll(a2));
		System.out.println(a2.contains("anna"));  
		
	}
}
