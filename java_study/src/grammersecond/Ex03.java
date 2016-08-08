package grammersecond;

public class Ex03 {
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();
		int a = 20;
		int b[] = {100,200,300};
		ex03.change(a, b);
		ex03.display(a, b);
	}
	void change(int a, int b[]){
		a += 10;
		b[1] += 10;
	}
	void display(int a, int b[]){
		System.out.print(a+"/"+b[1]);
	}
}
