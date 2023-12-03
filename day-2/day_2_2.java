// Day 2 - Part One

import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        while(in.hasNextLine()) {
            String [] line = in.nextLine().split(": ");
            String [] sets = line[1].split("; ");

            int blue = 0, green = 0, red = 0;

            for(int i = 0; i < sets.length; i++) {
                String [] split = sets[i].split(", ");
                for(int j = 0; j < split.length; j++) {
                    String [] balls = split[j].split(" ");
                    int val = Integer.parseInt(balls[0]);

                    if(balls[1].equals("blue")) {
                        blue = Math.max(blue, val);
                    } else if(balls[1].equals("red")) {
                        red = Math.max(red, val);
                    } else if(balls[1].equals("green")) {
                        green = Math.max(green, val);
                    }
                }
            }

            sum += red * green * blue;
        }

        System.out.println("Result: " + sum);
    }
}
