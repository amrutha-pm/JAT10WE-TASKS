package Task12;

import java.util.ArrayList;
public class RemoveElementsArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> List = new ArrayList<String>();
	        // ArrayList <String> List1=new ArrayList <String>();
	        List.add("welcome");
	        List.add("to");
	        List.add("collections");
	        List.add("framework");
	        List.remove("welcome");
	        // by using clear we can remove all the elements directly

	       List.clear();
	        //List1.addAll(List);
	         //List.add("Anu");
	        // List1.removeAll(List);
	        for (int i = 0; i < List.size(); i++) 
	        {
	            System.out.println(List.get(i)); 
		
	}
	        
	     //   System.out.println("All items are removed");

}
}