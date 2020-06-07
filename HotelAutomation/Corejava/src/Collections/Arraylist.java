package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
	
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Lala");
		aList.add("Lulu");
		aList.add("Pagla");
		aList.add("Pulu");
		
		System.out.println(aList);
		aList.add("Xolo");
		aList.add(3,"Zaila");
		System.out.println(aList);
		
		//iterating the arraylist
		for(String tata: aList)
			System.out.println(tata);
		System.out.println(" ");
		
		Collections.sort(aList);
		for(String gets : aList)
			System.out.println(gets);
		System.out.println(" ");
		Collections.sort(aList,Collections.reverseOrder());
		for(String ar : aList)
		
			System.out.println(ar);
		
	
		
	}

}
