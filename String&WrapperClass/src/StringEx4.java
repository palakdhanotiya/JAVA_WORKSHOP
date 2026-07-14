
public class StringEx4 {
	public static void main(String [] args) {
		String s1 = "Palak Dhanotiya";
		String s2 = "Dhanotiya";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		System.out.println(s1.toUpperCase());
		System.out.println("Gaming".toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.length());
		
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2,8));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('a',3));
		System.out.println(s1.indexOf('k'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.indexOf(""));
		System.out.println("  ram          kumar  ".trim());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Palak Dhanotiya"));
		System.out.println(s1.equals("Palak dhanotiya"));
		System.out.println(s1.equalsIgnoreCase("palak dhanotiya"));
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}

}
