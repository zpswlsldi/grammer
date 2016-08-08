package grammersecond;

class ApiEx2{
	int x;
	int y;
	ApiEx2(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "x=" + x + "y=" + y;	
	}
	public ApiEx2 copy(){
		Object obj = null;
		try{
			obj = clone();
		/* 
		java.lang.Object에 있는 clone은 protected로 선언이 되어 있다. 
		따라서 public으로 override하지 않았을 경우는 외부에서 호출할 수 없다.
		clone을 구현할 때는 반드시 java.lang.Cloneable 인터페이스를 implements해야 한다. 
		Cloneable을 구현하지 않는다면 clone 메서드를 호출할 때 CloneNotSupportedException를 발생시킨다.
		Cloneable 인터페이스에는 아무런 메서드도 정의되어 있지 않다고 한다. 
		 */
		}catch(CloneNotSupportedException e){}//현 상태에서는 예외사항이 발생하여 catch문이 발동.
		return (ApiEx2)obj;
	}
	public static void main(String[] args) {
		   ApiEx2 original = new ApiEx2(3, 5);
		   ApiEx2 copy = original.copy();
		   System.out.println(copy);

	}

}
