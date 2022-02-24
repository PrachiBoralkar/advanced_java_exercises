package hash_set;
/*Write a Java program to get an element in a tree set which is strictly greater than the given element. 
Sample Input/output
TreeSet : {10,22,36,25,16,70,82,89,14}
Strictly greater than 76 : 82                                          
Strictly greater than 31 : 36
*/
import java.util.TreeSet;
import java.util.Iterator;

  public class Exercise_4 {
  public static void main(String[] args) {
 
   TreeSet <Integer>tree_num = new TreeSet<Integer>();
   TreeSet <Integer>treeheadset = new TreeSet<Integer>();
     
  
   tree_num.add(10);
   tree_num.add(22);
   tree_num.add(36);
   tree_num.add(25);
   tree_num.add(16);
   tree_num.add(70);
   tree_num.add(82);
   tree_num.add(89);
   tree_num.add(14);
   
   System.out.println("Strictly greater than 76 : "+tree_num.higher(76));
   System.out.println("Strictly greater than 31 : "+tree_num.higher(31));
   }    
}
