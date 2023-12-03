// Day 1 - Part Two

import java.util.*;

public class Main {
    static String [] validNumbers = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static int isValidNum(String text) {
        for(int i = 0; i < validNumbers.length; i++) {
            if(text.contains(validNumbers[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        while(in.hasNext()) {
            String input = in.next();
            System.out.println(input);

            String num = "";
            int first = -1, last = -1;
            for(int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(first == -1 && Character.isDigit(c)) {
                    num = "";
                }
                if(Character.isDigit(c)) {
                    int a = Integer.parseInt(String.valueOf(c));
                    if(first == -1) first = a;
                    last = a;
                    num = "";
                    continue;
                }

                num += input.charAt(i);
                int number = isValidNum(num);

                if(number != -1) {
                    int value = number + 1;
                    if(first == -1) first = value;
                    last = value;

                    char lastChar = num.charAt(num.length() - 1);
                    num = lastChar != 'e' && lastChar != 'o' && lastChar != 't' ? "" : "" + lastChar;
                }
            }

            sum += first * 10 + last;
        }

        System.out.println("Result: " + sum);
    }
}
