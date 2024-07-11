package Problem4;

import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        //Get a line of text
        System.out.println("Enter a line of text:");
        String line = scan.nextLine();

        Scanner scanLine = new Scanner(line);

        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                //Not an integer, do nothing and continue
            }
        }

        System.out.println("The sum of the integers on this line is " + sum);
    }
}
