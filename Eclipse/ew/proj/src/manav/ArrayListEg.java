package manav;
import java.util.*;
public class ArrayListEg {
	public static void main(String args[]) {
		 SortedMap<Integer, String> tm
         = new TreeMap<Integer, String>();

     // Inserting the Elements
     tm.put(3, "Geeks");
     tm.put(2, "For");
     tm.put(1, "Geeks");
     /**
     for (Map.Entry mapElement : tm.entrySet()) {
         int key = (int)mapElement.getKey();

         // Finding the value
         String value = (String)mapElement.getValue();

         System.out.println(key + " : " + value);
     **/
      for(int i=0;i<=tm.size();i++) {
    	  System.out.println(tm.get(i));
      }
     
     }
	}
