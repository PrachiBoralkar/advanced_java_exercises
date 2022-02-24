package map;
/*Write a Java program to get the value of a specified key in a map. Get value of key 3 in above map in exercise 1.
*/
import java.util.*;  
public class Exercise_2 {  
    public static void main(String args[]){  
   HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
   hash_map.put(1,"Red");
  hash_map.put(2,"Green");
  hash_map.put(3,"Black");
  hash_map.put(4,"White");
  hash_map.put(5,"Blue");
     
   String val=(String)hash_map.get(3); 
   
   System.out.println("Value for key 3 is: " + val);
 }
}
