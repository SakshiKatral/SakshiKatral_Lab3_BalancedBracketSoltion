package com.ssk.learning.main;

import java.util.Scanner;

import com.ssk.learning.data.Data;
import com.ssk.learning.operation.BalancedBracketOperation;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Data data = new Data();
		String str = "";
		do{
			String string = data.getDataFromUser();
			BalancedBracketOperation balancedBracketOperation = new BalancedBracketOperation();

			boolean result = balancedBracketOperation.checkBracketBalanced(string);
			if(result) {
				System.out.println("The entered string has Balanced Brackets");
			}
			else {
				System.out.println("The entered string do not contain Balanced Brackets");
			}

			System.out.println("Do you want to continue if yes press 'y' else press any key to exit");
			str = scanner.next();
		}while(str.equalsIgnoreCase("y"));

		System.out.println("Exited successfully");
		if(scanner!=null){
			scanner.close();
		}
	}

}
