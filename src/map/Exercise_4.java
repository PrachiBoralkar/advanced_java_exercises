package map;
/*Write a Java program to get the first (lowest) key and the last (highest) key currently in a tree map. Create a tree map with TreeMap<String><String>
// Put elements to the map
 tree_map1.put("C2", "Red");
 tree_map1.put("C1", "Green");
 tree_map1.put("C4", "Black");
 tree_map1.put("C3", "White");
 */
import java.util.*;
import java.util.Map.Entry;  
public class Exercise_4 {  
     public static void main(String args[]) {


  TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

 
  tree_map1.put("C2", "Red");
  tree_map1.put("C1", "Green");
  tree_map1.put("C4", "Black");
  tree_map1.put("C3", "White");

  System.out.println("Orginal TreeMap content: " + tree_map1);
  System.out.println("Greatest key: " + tree_map1.firstKey());
  System.out.println("Least key: " + tree_map1.lastKey());
 }
}
