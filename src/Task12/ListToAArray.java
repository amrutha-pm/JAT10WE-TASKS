package Task12;

import java.util.ArrayList;

public class ListToAArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList<String> List = new ArrayList<String>();

	        List.add("Amrutha");
	        List.add("Swathi");
	        List.add("Sraya");
	        List.add("Jaya");
	        Object[] L = List.toArray();
	        for (Object i : List.toArray())
	        {
	            System.err.print(i + " ");
	            
	}

}
}