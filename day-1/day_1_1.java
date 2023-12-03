// Day 1 - Part One

import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        while(in.hasNext()) {
            String input = in.next();
            System.out.println(input);

            int first = -1, last = -1;
            for(int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if(Character.isDigit(c)) {
                    int val = Integer.parseInt(String.valueOf(c));
                    if(first == -1) first = val;
                    last = val;
                }
            }

            sum += first * 10 + last;
        }

        System.out.println("Result: " + sum);
    }
}
