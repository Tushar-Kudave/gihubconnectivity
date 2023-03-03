package AllPrograms;

class this_class{
	String name;
	String stream;
	
	this_class(){
		System.out.println("in a default constructor. ");
	}
	this_class(String name, String stream){
		this();
		this.name = name;
		this.stream = stream;
		System.out.println("inside parameterized constuctor. ");
		System.out.println(name+" "+stream);
	}
}

public class this_concept {
	public static void main(String[] args) {
		
		new this_class("Kshitij","IT");
		}
}
