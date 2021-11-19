package Main;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ex1 = "232425";
		String ex2 = "23324256";
		String ex3 = "444445";
		
		System.out.println("Test 1: " + ascending(ex1));
		System.out.println("Test 2: " + ascending(ex2));
		System.out.println("Test 3: " + ascending(ex3));

		int ex4 = 3;
		int ex5 = 5;
		int ex6 = 1;
		int ex7 = 0;

		squarePatch(ex4);
		squarePatch(ex5);
		squarePatch(ex6);
		squarePatch(ex7);

	}

	public static boolean ascending(String numbers) {

		List<Integer> cons = new ArrayList();

		if (numbers.length() % 2 == 0) {
			for (int i = 0; i < numbers.length() - 1; i += 2) {
				cons.add(Integer.parseInt(numbers.substring(i, i + 2)));
			}

			System.out.println("itemizing numbers");
		}

		else {

			for (int i = 0; i < numbers.length() - 2; i += 2) {
				cons.add(Integer.parseInt(numbers.substring(i, i + 3)));
			}

		}

		System.out.println("Preparing to run through items");

		for (int k = 0; k < cons.size() - 1; k++) {
			if (cons.get(k + 1) != cons.get(k) + 1) {
				return false;
			}
		}

		return true;
	}

	public static void squarePatch(int num) {

		if (num == 0) {
			System.out.println("\n");
			System.out.println("[]");
		}

		else {
			int[][] square = new int[num][num];

			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					square[i][j] = num;
				}
			}
			System.out.println("\n");

			for (int k = 0; k < square.length; k++) {
				System.out.println(Arrays.toString(square[k]));
			}
		}

	}

}
