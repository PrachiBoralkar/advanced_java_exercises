package list_impl;
/*Write a Java program to insert elements into the linked list at the first and last position. Insert color "Pink" at first and "Blue" at last position in linked list in exercise 4.
*/
import java.util.LinkedList;
public class Exercise_5 {
	public static void main(String[] args) {
		
		LinkedList <String> l_list = new LinkedList <String> ();
		
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		System.out.println("Original linked list: ");
		System.out.println("Let add the Yellow color after the Red Color: " + l_list);
		l_list.add(0, "Pink");
		l_list.add(6, "Blue");
		System.out.println("The linked list:" + l_list);
	}
}
