package CollectionFramework;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> info = new ArrayList<>();
		info.add("Tushar Kudave");
		info.add("Siddhant Mane");
		info.add("Kshitj More");
		System.out.println("Student Info : " +info);
		
		info.add(2, "Yahiya Mujawar");
		System.out.println(info.size());
		System.out.println(info);
		
		System.out.println(info.hashCode());
		
	}

}
