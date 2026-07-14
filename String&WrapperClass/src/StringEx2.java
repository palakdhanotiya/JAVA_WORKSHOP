public class StringEx2{
	public static void main(String[] args) {
		String s1 = new String("Palak");
		String s2 = "Palak";
		String s3 = new String("Palak");
		String s4 = "Palak";
		String s5 = new String("Palak");
		String s6 = "Palak";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		System.out.println(s1==s3); //compare the address of String objects
		System.out.println(s2==s4);
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2)); //compare the data of the String objects
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		s1 = "Ram";
		s2 = null;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//System.out.println(s2.equals(s1);     -----NullPointerException
	}
	
}