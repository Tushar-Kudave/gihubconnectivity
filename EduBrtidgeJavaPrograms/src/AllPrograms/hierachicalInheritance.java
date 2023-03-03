package AllPrograms;
// hierachical inhertance
class Person{
	public void show(){
		System.out.println("I am a person");
	}
}
class Student extends Person{
	public void show1() {
		System.out.println("I am a student who is a person");
	}
}
class Teacher extends Person{
	public void show2() {
		System.out.println("I am a reacher who is a person");
	}
}
class Doctor extends Person{
	public void show3() {
		System.out.println("I am a Doctor who is a person");
	}
}
public class hierachicalInheritance {
	public static void main(String[] args) {
		Teacher t= new Teacher();
		t.show2();
		
		Student s = new Student();
		s.show1();
		
		Doctor d = new Doctor();
		d.show3();
	}
}
