package org.example;

import java.util.Scanner;
import java.util.TreeMap;

public class ArabicToRomanConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			System.out.println(toRoman(sc.nextInt()));
		}
	}

	public static String toRoman(int num) {
		StringBuilder romNum = new StringBuilder();
		if (num <= 0) {
			System.out.print(("There is no zero in the Roman numeral system."));
		} else {
			final TreeMap<Integer, String> romanMap = new TreeMap<>() {{
				put(0, null);
				put(1, "I");
				put(4, "IV");
				put(5, "V");
				put(9, "IX");
				put(10, "X");
				put(40, "XL");
				put(50, "L");
				put(90, "XC");
				put(100, "C");
				put(400, "CD");
				put(500, "D");
				put(900, "CM");
				put(1000, "M");
			}};
			do {
				int floorValue = romanMap.floorKey(num);
				romNum.append(romanMap.get(floorValue));
				num = num - floorValue;
			} while (num != 0);
		}
		return romNum.toString();
	}
}