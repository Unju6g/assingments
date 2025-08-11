import java.util.Scanner;


public class quetion_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


       
        // 1D Array - Avg, Max, Min
       
        int[] nums = new int[10];
        int sum = 0, max, min;


        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
        }


        max = min = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] > max) max = nums[i];
            if (nums[i] < min) min = nums[i];
        }


        System.out.println("\n--- 1D Array Results ---");
        System.out.println("Average = " + (sum / 10.0));
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);


               // Task 2: 2D Array - Matrix + Transpose
        
        int[][] matrix = new int[3][3];


        System.out.println("\nEnter 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nTranspose of Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }


       
        //  Bubble Sort
     
        System.out.println("\nSorting the 1D array using Bubble Sort...");
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }


        System.out.println("Sorted Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();


       //binary search
        System.out.print("\nEnter number to search (Binary Search): ");
        int key = sc.nextInt();


        int low = 0, high = nums.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (nums[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }


        if (!found) {
            System.out.println("Element not found.");
        }


        sc.close();
    }
}


