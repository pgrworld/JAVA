package training;
class Test
{
	public static void main(String[] args)
	{
	String str = new String("gowrav rahul");
	String str2 = new String("gowrav rahul");
	System.out.println(str);
	System.out.println(str.equals(str2));
	System.out.println(str.concat("pentakota"));
	System.out.println(str.compareTo(str2));
	System.out.println(str.startsWith("gowrav"));
	System.out.println(str.endsWith("l"));
	System.out.println(str.contains("w"));
	System.out.println(str.replace("gowrav", "swaroop"));
	System.out.println(str.indexOf("rahul"));
	System.out.println(str.substring(4,9));
	}
}
