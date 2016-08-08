package grammersecond;

public class Ex02 {
	static int[] arNum={7,9,1,4,5};
	public static void main(String[] args) {
		int out,in;
		Ex02 ex02 = new Ex02();
		
		for(out=arNum.length-1;out>0;out--){
			for(in=0;in<out;in++){
				if(arNum[in]>arNum[in+1]){
					ex02.swap(in,in+1);
				}
			}
		}
		ex02.display();
	}
	void swap(int one, int two){
		int temp = arNum[one];
		arNum[one] = arNum[two];
		arNum[two] = temp;
	}
	void display(){
		for(int index=0;index<arNum.length;index++){
			System.out.print(arNum[index]);
		}
	}
}
