package cafe.jjdev.domain;

import java.util.Calendar;

public class A extends Object{
	int x;
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		switch(c.get(Calendar.DAY_OF_MONTH)){
		case 0:
			System.out.println("일요일");break;
		case 1:
			System.out.println("월요일");break;
		case 2:
			System.out.println("화요일");break;
		case 3:
			System.out.println("수요일");break;
		case 4:
			System.out.println("목요일");break;
		case 5:
			System.out.println("금요일");break;
		case 6:
			System.out.println("토요일");break;
		}
		
	}
	
	
}
