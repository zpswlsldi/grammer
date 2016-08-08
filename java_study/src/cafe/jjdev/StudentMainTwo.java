package cafe.jjdev;

public class StudentMainTwo {

	public static void main(String[] args) {
		Ban ban = new Ban();
		ban.init("303");
		Student st1 = new Student();
		ban.insertStudentList(st1, "누눈", 15, false);
		Student st2 = new Student();
		ban.insertStudentList(st2, "나난", 17, true);
		ban.printStudentList();
	}

}
