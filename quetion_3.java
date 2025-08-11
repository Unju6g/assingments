

import java.util.Scanner;


public class quetion_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // --- Multiplication Table ---
        System.out.print("Enter a number for multiplication table: ");
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }


        // --- Fibonacci Series ---
        int First = 0, Second = 1;
        System.out.print("\nFibonacci series: " + First + " " + Second);
        for (int i = 2; i < n; i++) {
            int next = First + Second;
            System.out.print(" " + next);
            First = Second;
            Second = next;
        }


        // --- Armstrong Number Check ---
        System.out.print("\n\nEnter a number to check Armstrong: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;


        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, 3);
            number /= 10;
        }


        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }


    }
}



