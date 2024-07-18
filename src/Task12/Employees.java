package Task12;
import java.util.TreeMap;
import java.util.TreeSet;
public class Employees {

	 TreeMap<Integer, String> treemap = new TreeMap<>();

	    public void addValues() {
	        treemap.put(1, "Anu");
	        treemap.put(2, "Amrutha");
	        treemap.put(3, "Anil");
	        treemap.put(4, "Rithwik");
	        treemap.put(5, "Hari");
	    }
	    // by using the key we can also set values in alphabetical order
	    public void displayMap() {

	        // for(String mapelement: treemap.values()){
	        // System.out.println(mapelement);
	        // }
	        for (String mapelement : new TreeSet<String>(treemap.values())) {
	            System.out.println(mapelement);
	        }
	    }

	    public static void main(String[] args) {
	        Employees em = new Employees();
	        em.addValues();
	        em.displayMap();
	}

}
