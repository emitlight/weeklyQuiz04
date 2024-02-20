package weeklyQuiz04;

import java.util.Scanner;
import java.util.Stack;

public class WeeklyQuiz04 {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
            return stack.isEmpty();
        }
    }
    public static void main(String[] args) {
        int count = 1;
        while(count <= 3) {
            Scanner scan = new Scanner(System.in);
            System.out.println("괄호 문자열 입력: ");
            String bracket = scan.nextLine();

            System.out.println("Input: " + bracket + " => Output: " + isValid(bracket));

            count++;
        }
    }
}
