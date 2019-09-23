package training;
class Test
{
	public static void main(String[] args)
	{
		String str = new String("swaroop,anna");
		String[] s = str.split(",");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
		
	}
}
