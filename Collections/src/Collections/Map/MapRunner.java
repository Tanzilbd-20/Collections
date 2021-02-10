package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {

		String string = "This is an awesome occasion. This has never happend before";

		Map<Character, Integer> map = new HashMap<>();

		char[] chars = string.toCharArray();

		for (char character : chars) {
			Integer integer = map.get(character);
			if (integer == null) {
				map.put(character, 1);
			} else {
				map.put(character, integer + 1);
			}
		}
		System.out.println(map);

		Map<String, Integer> stringWord = new HashMap<>();

		String[] word = string.split(" ");

		for (String words : word) {
			Integer integer = stringWord.get(words);
			if (integer == null) {
				stringWord.put(words, 1);
			} else {
				stringWord.put(words, integer + 1);
			}
		}
		System.out.println(stringWord);

	}

}
