package list_impl;
//Write a Java program to iterate through all elements in a linked list starting at the specified position.Position no 1. sample list is //of //colors with element "Red","Green","White","Black","Yellow".
//Output will be "Green","White","Black","Yellow".

import java.util.LinkedList;
import java.util.Iterator;
public class Exercise_4 {
public static void main(String[] args) {
   LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("White");
        l_list.add("Black");
        l_list.add("Yellow");
 Iterator p = l_list.listIterator(1);

 while (p.hasNext()) {
 System.out.println(p.next());
 }
 }
}