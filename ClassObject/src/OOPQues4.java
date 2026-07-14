class P1{
	static int x=10;
	String y;
	void show() {
		System.out.println(x+" "+y);
	}
	P1(){
		System.out.println("Hi");
		x=15;
	}
	P1(String a,int b){
		this();
		System.out.println("OK");
		x+=b;
		y+=a;
	}
	static{
		x++;
		System.out.println("INCAPP");
	}
	{
		x++;
		y="PP";
		System.out.println("Hello");
	}
}
public class OOPQues4 {
	public static void main(String[] args) {
		System.out.println(P1.x);
		P1 m1 = new P1();
		P1 m2 = new P1("palak",12);
		m1.show();
		m2.show();
	}
}