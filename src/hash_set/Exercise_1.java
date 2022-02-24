package hash_set;
/*Write a program to remove elements from a SET of integers that are the perfect square.    Sample input /Output :                                                                                                                                    numbers : [2, 3, 4, 5, 6, 7, 8, 9, 10]
After removeAll(perfectSquares) => [2, 3, 5, 6, 7, 8]
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Exercise_1 {

	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<Integer>();
		for (int i = 2; i <= 10; i++) {
			num.add(i);
		}

		Iterator<Integer> itr = num.iterator();
		List<Integer> l = new ArrayList<>();
		while (itr.hasNext()) {
			int n = itr.next();
			for (int i = 1; i <= (n / 2); i++)
				if (n % i == 0 && n / i == i)
					l.add(n);
		}

		num.removeAll(l);
		System.out.println("After removeAll(perfectSquares) =>" + num);
	}
}
