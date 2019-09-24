package training;
import java.util.*;
class Test
{
	public static void main(String[] args)
	{
      ArrayList a1 = new ArrayList();
      a1.add("value1");
      a1.add("value");
      a1.add("value3");
      a1.add("value4");
      System.out.println(a1);
      ArrayList a2 = new ArrayList();
      a2.add("value1");
      a2.add("value2");
      System.out.println(a2);
      System.out.println(a1.retainAll(a2));
      System.out.println(a1);
      System.out.println(a1.size());
      System.out.println(a1);
	}
}
