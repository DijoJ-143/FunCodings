package com.ust.Task.Taskgiven.flames;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.println("\nEnter first person name");
			String f_name = sc.nextLine().toLowerCase().trim();

			// escaping
			if (f_name.equals("exit")) {
				sc.close();
				System.out.println("Program closed");
				return;
			}

			System.out.println("\nEnter second person name");
			String s_name = sc.nextLine().toLowerCase().trim();

			// validating whether the names are similar
			if (f_name.equals(s_name)) {
				System.out.println("Try with unique names");

			}

			Flames.determineRelationship(f_name, s_name);

		}
	}

}
