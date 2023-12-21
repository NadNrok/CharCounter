package ua.com.fm.cc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Counter {
	String str;

	public Counter(String str) {
		this.str = str;
		if (str == null) {
			System.out.println("The string cannot be null");
		} else {
			System.out.println(str);
		}
	}

	public Map<Character, Integer> performCount() {
		Map<Character, Integer> charCount = new LinkedHashMap<>();

		for (char c : str.toCharArray()) {
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		return charCount;
	}

	public void outputToConsole() {
		for (Map.Entry<Character, Integer> entry : performCount().entrySet()) {
			System.out.println("\"" + entry.getKey() + "\" - " + entry.getValue());
		}

	}

}
