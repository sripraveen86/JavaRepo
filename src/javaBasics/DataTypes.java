package javaBasics;

import java.util.ArrayList;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j = 20;
		int k = 30;
		char a = 'a';
		boolean bool = true;
		double d = 20.30;
		String str = "Basic Java";
		System.out.println(bool);

		if (j == i) {
			System.out.println("j is greater than i");
		} else {
			System.out.println("i is greater than j");
		}

		if (i > j & i > k) {
			System.out.println("i is highest");
		} else if (j > i & j > k) {
			System.out.println("j is highest");
		} else {
			System.out.println("k is highest");
		}
		int q;
		// for(i=1;i<11;i++) {
		// System.out.println(i);
		// }

		while (i < 11) {
			System.out.println(i);
			i++;
		}

		Object m[] = new Object[5];

		m[1] = "String";

		ArrayList qw = new ArrayList();
		qw.add(100);
		qw.add("Praveen");

	}
}
