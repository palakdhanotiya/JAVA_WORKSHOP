class N{
	int x=90;
	String y="Ram";
	void m(int a) {
		x = a;
		y = y+x;
	}
	void show() {
		System.out.println(x+y);
	}
	
}
public class ClassObjectQues6 {
	public static void main(String [] args) {
		N n1 = new N();
		N n2 = new N();
		n1.m(15);
		n2.m(10);
		n1.show();
		n2.show();
	}

}
