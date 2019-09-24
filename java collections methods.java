package training;
import java.util.*;

class Test
{
	 public static void main(String[] args)
	 {
		 HashSet hs = new HashSet();
		 System.out.println(hs.add("A"));
		 hs.add("B");
		 hs.add("c");
		 System.out.println(hs);
		 HashSet hs2 = new HashSet(hs);
		 System.out.println(hs2);
		 System.out.println(hs2.remove("b"));
		 
	 }
}  
