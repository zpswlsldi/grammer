package mainprint;

public class Main {

	public static void main(String[] args) {
		/*A a = new A();
		a.x = 10;
		int y = 20;
		
		int m = a.x;
		int n = y;
		m = 100;
		n = 200;
		System.out.println(a.x);
		System.out.println(y);*/
		
		int x = 5;
		A a = new A();
		a.x = 5;
		change(x);
		change(a);
		System.out.println(x);
		System.out.println(a.x);
	}
	static void change(int x){
		x = 10;
	}
	static void change(A a){
		a.x = 10;
	}
}
