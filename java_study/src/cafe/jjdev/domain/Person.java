package cafe.jjdev.domain;

public class Person {
	public String name;
	public int age;
	public Person(){}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("김용", 29);
	}
}
