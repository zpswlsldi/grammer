package cafe.jjdev.domain;

public class Circle extends Point{
	int z;
	@Override
	public void print(){
		System.out.println("Circle");
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.x = 1;
		c.y = 2;
		c.z = 3;
	}
}
