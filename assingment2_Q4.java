class Calculator {
    int add(int a, int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a, int b ,int c){
        return a+b+c;
    }
}
public class assingment2_Q4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("sum of 2 integers:"+ calc.add(5,8));
        System.out.println("sum of 2 doubles:"+ calc.add(5.8,8.0));
        System.out.println("sum of 3 integers:"+ calc.add(5,8,8));
    }
    }
    
