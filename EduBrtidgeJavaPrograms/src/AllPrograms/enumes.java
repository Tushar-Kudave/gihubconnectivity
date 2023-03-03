package AllPrograms;
public class enumes {
	enum weekdays{MONDAY, TUESDAY, WEDNSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// enums - to represent a fixed set of constants.
		// what is enum - grouping similar kind of constants as a unit. constants means static
		//and final
		//enum are introduces in JDK 1.5 onwards
		// before that similar kind of constants are grouped by declaring them as static and final in one class
		//enum -  keyword
		//variables of enumeration can be defined directly without nay new keywords.
		//enum can methods, constructor and fields
		//java enums extend Enum class exist in java.lang package.
		
		weekdays w1 = weekdays.MONDAY;
		System.out.println(w1);
		weekdays w2 = weekdays.TUESDAY;
		System.out.println(w2);
		weekdays w3 = weekdays.WEDNSDAY;
		System.out.println(w3);
		weekdays w4 = weekdays.THURSDAY;
		System.out.println(w4);
		weekdays w5 = weekdays.FRIDAY;
		System.out.println(w5);
		weekdays w6 = weekdays.SATURDAY;
		System.out.println(w6);
		weekdays w7 = weekdays.SUNDAY;
		System.out.println(w7);	
	}

}
