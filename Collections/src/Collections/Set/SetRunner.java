package Collections.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class AscendingNumbers implements Comparator<Integer> {

	@Override
	public int compare(Integer number1, Integer number2) {

		return Integer.compare(number1, number2);
	}

}

class DescendingNumbers implements Comparator<Integer> {

	@Override
	public int compare(Integer number1, Integer number2) {

		return Integer.compare(number2, number1);
	}

}

public class SetRunner {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList(List.of(1, 2, 3, 4, 543, 4, 35, 34243, 5, 34, 54));

		List<Integer> number2 = List.of(2, 1, 4, 6, 5, 756, 7, 56, 757, 5675);

		Set<Integer> myNumber = new TreeSet<>(number2);

		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		AscendingNumbers ascending = new AscendingNumbers();
		DescendingNumbers descending = new DescendingNumbers();

		System.out.println(myNumber);

		System.out.println(Collections.max(numbers));
		System.out.println(Collections.min(numbers));
		System.out.println(numbers);
		numbers.sort(ascending);
		System.out.println(numbers);
		numbers.sort(descending);
		System.out.println(numbers);
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("Tree Set : " + treeSet);
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("Linked Hash Set : " + linkedHashSet);
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("Hash Set : " + hashSet);

	}

}
