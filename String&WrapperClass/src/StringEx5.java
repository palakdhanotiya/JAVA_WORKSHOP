
public class StringEx5 {
	public static void main(String[] args) {
		
		//StringBuilder s="Hi";  ----error
		StringBuilder s=new StringBuilder("Palak Dhanotiya");
		//StringBuffer s=new StringBuffer("Palak Dhanotiya");
		
		System.out.println(s);
		s.append(" Gamer");
		System.out.println(s);
		s.append(11);
		System.out.println(s);
		s.insert(2, "llll");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.replace(2,8,"pp");
		System.out.println(s);
		s.delete(2,8);
		System.out.println(s);
		
		
	}

}
