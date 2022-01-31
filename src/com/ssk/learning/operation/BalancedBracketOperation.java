package com.ssk.learning.operation;

import java.util.EmptyStackException;
import java.util.Stack;

public class BalancedBracketOperation {
	public boolean checkBracketBalanced(String data) {
		Stack<Character> stack = new Stack<>();
			try { 
				for(int i = 0; i < data.length(); i++) {
					char ch = data.charAt(i);

					if(ch == '(' || ch == '{' || ch == '[') {
						stack.push(ch);
						continue;
					}

					char temp;
					switch (ch) {
					case ')':
						temp = stack.pop();	
						if(temp == '{' || temp == '[') {
							return false;
						}
						break;
					case ']':
						temp = stack.pop();	
						if(temp == '{' || temp == '(') {
							return false;
						}
						break;
					case '}':
						temp = stack.pop();	
						if(temp == '(' || temp == '[') {
							return false;
						}
						break;
					}
				}
				return stack.isEmpty();

			}catch (EmptyStackException e) {
				return false;
			}
	}
}
