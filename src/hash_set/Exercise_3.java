package hash_set;
/*Write a Java program to get the first and last elements in a tree set.
Sample Input/Output
Tree set:                                                              
[Black, Green, Orange, Red, White]                                     
First Element is: Black                                                
Last Element is: White 
*/
import java.util.TreeSet;
public class Exercise_3 {
public static void main(String[] args) {
TreeSet<String> tree_set = new TreeSet<String>();
tree_set.add("Red");
tree_set.add("Green");
tree_set.add("Orange");
tree_set.add("White");
tree_set.add("Black");
System.out.println("Tree set: ");
System.out.println(tree_set);

 
  Object first_element = tree_set.first();
  System.out.println("First Element is: "+first_element);

  
  Object last_element = tree_set.last();
  System.out.println("Last Element is: "+last_element);
}
}
