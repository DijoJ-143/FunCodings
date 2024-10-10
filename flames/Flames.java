package com.ust.Task.Taskgiven.flames;

import java.util.Set;
import java.util.stream.Collectors;

public class Flames {

	private static final String FLAMES_STRING = "FLAMES";

	public static void determineRelationship(String input1, String input2) {

		// Validating input
		if (input2.isEmpty() || input1.isEmpty()) {
			System.out.println("Input is invalid. Please enter a valid string.");
			return;
		}

		// getting unique characters
		Set<Character> set1 = input1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
		Set<Character> set2 = input2.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

		// removing all common characters
		Set<Character> common = set1.stream().filter(set2::contains).collect(Collectors.toSet());
		
		set1.removeAll(common);
		set2.removeAll(common);
		// getting unique characters count
		int count = set1.size()+set2.size();

		/*
		 * Logic FLAMES
		 * 
		 */

		if (count == 0)
			System.out.println("Both are good friends");
		else {
			char result = FLAMES_STRING.charAt(((count - 1) % FLAMES_STRING.length()));
			switch (result) {
			case 'F':
				System.out.println("Friends😊");

				break;
			case 'L':
				System.out.println("Lovers🥰");

				break;
			case 'A':
				System.out.println("Affection🤗");

				break;
			case 'M':
				System.out.println("Marriage💑");

				break;
			case 'E':
				System.err.println("Enemy😡");

				break;
			case 'S':
				System.out.println("Sister🦘🐇");

				break;

			default:
				break;
			}
		}

	}

}
