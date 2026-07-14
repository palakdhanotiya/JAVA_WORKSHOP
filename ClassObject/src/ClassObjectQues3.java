class AAA{
	int x;
	String y;
	void m() {
		x=23;
	}
	void show() {
		System.out.println(x+y);
	}
}
public class ClassObjectQues3 {
	public static void main() {
		AAA a = new AAA();
		//a.x=10;
		a.m();
		a.x=10;
		AAA b = new AAA();
		b.y = "ram";
		b.m();
		b.x = 90;
		
		a.show();
		b.show();
	}

}
