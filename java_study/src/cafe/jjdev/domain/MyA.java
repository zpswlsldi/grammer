package cafe.jjdev.domain;
import java.util.Calendar;

public class MyA extends Object{
	/*최소한 클래스를 만들고 싶으면 Object 클래스를 참조해야 한다. 
	//이는 생략했을 경우 컴파일러에서 자동으로 실행한다.
	 *  
*/	int x;
	public static void main(String[] args){
		/*
		Object o1 = new Object();
		Object o2 = new Object();
		o1 = o2;
		System.out.println(o1.equals(o2));
		//두 객체참조변수가 같은 객체를 가리키고 있는가?(같은 참조값을 갖는가?)
		//String 클래스 내에서는 Object 클래스에 대해 overriding되어 있다. 유일하게. 
		//그래서 equals 메서드의 경우, String 클래스에 대해서는 안에 담겨있는 문자열 내용이 같으면 boolean값을 리턴한다.
		*/
		//Calendar C = new Calendar(); Calendar 클래스는 추상 클래스인데, 추상 클래스는 자기 자신의 객체 생성 불가.
		Calendar C = Calendar.getInstance(); //Calendar 클래스에 한하여 자식 클래스의 객체를 생성한다.
		System.out.println(C);//
		/*A a1 = new A();
		a1.x = 10;
		A a2 = new A();
		a2.x = 20;
		System.out.println(a1.x);
		System.out.println(a1.toString());*/
	}
	/*
	@Override
	public String toString(){
		return "A [x=" + x + "]";
	}
	
	@Override
	public boolean equals(Object obj){
		if(this.x == ((A)obj).x){
			return true;
		}
		return this == obj;
	}
	//java script == 와 java ==는 다르다. */
}
