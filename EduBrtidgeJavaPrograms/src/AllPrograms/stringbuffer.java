package AllPrograms;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer st = new StringBuffer("Tushar");
		System.out.println(st);
		
		st.append(" Kudave");
		System.out.println(st);
		
		System.out.println(st.capacity());
		
		System.out.println(st.charAt(8));
		
		System.out.println(st.indexOf("Kudave"));
		String s = "Tushar Kudave";
		System.out.println(st.equals(s));
	}

}
