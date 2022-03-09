import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Swea1224 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			sc.nextInt();
			String expr = sc.next();
			StringBuilder sb = new StringBuilder();
			Stack<Character> stack = new Stack<>();

			for (int i = 0; i < expr.length(); i++) {
				char ch = expr.charAt(i);
				if (Character.isDigit(ch)) {
					sb.append(ch);
				} else if (ch == '+') {
					if (stack.isEmpty()) {
						stack.push(ch);
					} else {
						while (!stack.isEmpty() && stack.peek() != '(') {
							sb.append(stack.pop());
						}
					}
				} else if (ch == '*') {
					if (!stack.isEmpty() && stack.peek() != '+') {
						sb.append(stack.pop());
					}
					stack.push(ch);
				} else if (ch == '(') {
					stack.push(ch);

				} else if (ch == ')') {
					while (!stack.isEmpty() && stack.peek() != '(') {
						sb.append(stack.pop());
					}
					stack.pop();
				}
//				 else if (ch == '/') {
//					while (stack.peek() == '*') {
//						sb.append(stack.pop());
//					}
//				}
			}
			while (!stack.isEmpty())
				sb.append(stack.pop());
			String postFixExpr = sb.toString();

			Stack<Integer> calStack = new Stack<>();
			for (int i = 0; i < postFixExpr.length(); i++) {
				char ch = postFixExpr.charAt(i);
				if (Character.isDigit(ch)) {
					calStack.push(ch - '0');
				} else {
					int num2 = calStack.pop();
					int num1 = calStack.pop();
					int result = 0;
					switch (ch) {
					case '+':
						result = num1 + num2;
						break;
					case '*':
						result = num1 * num2;
						break;
					}
					calStack.push(result);
				}
			}
			System.out.println("#" + tc + " " + calStack.pop());
		}
	}
}
