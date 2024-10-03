package sept.Task;

public class Sept_20 {
    public static void main(String[] args) {
        // Input int - a,b,c - a = 10, b = 20, c = 45
        // Max → a,b,c → c
        int a = 10;
        int b = 20;
        int c = 45;
        int large = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(large);

        // Input → int score = 85

        // String grade →
        //  score >= 90 → A
        //  score >= 80 → B
        //  score >= 70 → C

        int score = 85;
        String grade = score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : "D"));
        System.out.println(grade);

        //Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz"
        // instead of the number,and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."

        for (int i = 0; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);

            }


        }

    }
}
