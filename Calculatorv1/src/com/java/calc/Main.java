package com.java.calc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("нажмите 1 для арабского подсчета 2 для римского.0 для выхода");
			int result = sc.nextInt();
			switch (result) {
			case 1: {
				ArabicOperation.calculate();
				break;
			}
			case 2: {
				RomanianOperation.calculate();
				break;
			}
			case 0: {
				System.exit(0);
				sc.close();
			}
			default: {
				System.out.println("Неверный ввод.");
			}
			}
		}
	}
}
