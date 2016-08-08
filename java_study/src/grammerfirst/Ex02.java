package grammerfirst;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = null;
		try{
			int num = 0;
			scan = new Scanner(System.in);
			System.out.print("입력한 숫자 : ");
			num = scan.nextInt();
			if(num<=0){//음수?
				System.out.println("자연수만 입력해 주십시오.");
			}else if(num%2 == 0){//2n?
				System.out.println("위 숫자는 짝수입니다.");
			}else if(num%2 == 1){//2n+1?
				System.out.println("위 숫자는 홀수입니다.");
			}
		}catch(Exception ex){
			System.out.println("자연수만 입력하십시오.");//예외 사항 발생하면 출력
		}finally{
			if(scan != null) try{scan.close();} catch(Exception ex){}	
		}
	}
}
