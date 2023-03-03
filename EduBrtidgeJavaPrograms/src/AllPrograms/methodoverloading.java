package AllPrograms;

public class methodoverloading {
	
	public void Setlang() {
		System.out.println("Default lang is java");
	}
	public void Setlang(String lang) {
		System.out.println("Now Preferrd lang is "+lang);
	}
	public void Setlang(String Defaultlang, String lang) {
		System.out.println("Default lang is Java and Preferrd lang is "+lang);
	}
	public void Setlang(String defaultlang, String lang, int preference) {
		System.out.println("Default lang is Java and Preferrd lang is "+lang+" and it is "+preference+"th priority.");
	}
	
	
	public static void main(String[] args) {
		methodoverloading m = new methodoverloading();
		m.Setlang();
		m.Setlang("C++");
		m.Setlang("Java", "C++");
		m.Setlang("Java", "C++", 5);
	}

	
}
