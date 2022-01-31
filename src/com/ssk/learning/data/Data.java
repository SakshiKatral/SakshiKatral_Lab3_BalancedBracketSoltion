package com.ssk.learning.data;

import java.util.Scanner;

public class Data {
	Scanner scanner = new Scanner(System.in);
	public String getDataFromUser() {
		System.out.println("Enter the string ");
		String data = scanner.next();
		return data;
	}
}
