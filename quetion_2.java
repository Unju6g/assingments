//Create a Java program to input a number and check if it is:
//Even or Odd
//Prime or not
//Map to weekday using switch-case (1=Monday … 7=Sunday)
import java.util.Scanner;
public class quetion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();


        if (n % 2 == 0) {


            System.out.println("n is even :" + n);
        } else {
            System.out.println("n is odd:" + n);
        }




        boolean isprime = true;
        if (n <= 1) {
            isprime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            if (isprime) {
                System.out.println(n + "is a prime");
            } else {
                System.out.println(n + "is  not a prime");
            }
        }


        switch (n)
        {
            case 1 :
                System.out.println(" monday");
                break;
            case 2 :
                System.out.println(" tuesday");
                break;
            case 3 :
                System.out.println(" wenesday");
                break;
            case  4:
                System.out.println(" thurseday");
                break;
            case 5 :
                System.out.println(" friday");
                break;
            case 6 :
                System.out.println(" saturday");
                break;
            case 7 :
                System.out.println("sunday");
                break;
            default:
                System.out.println("no weakday (enter only1-7)6");


        }
    }
}


