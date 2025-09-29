import java.util.Scanner;
public class lab4_Q1{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter your age");
        String ageinput =sc.nextLine();
        try{
            int age = Integer.parseInt(ageinput);
            System.out.println("your age is:"+age);
        }catch(NumberFormatException e){
            System.out.println("invalid input.please enter a valid number.");

        }finally{
            System.out.println("age validation check complete.");
           
        }

    }
}
