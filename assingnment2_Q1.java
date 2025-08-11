abstract class shape{
    abstract void calculatearea();

    void display(){
        System.out.println("Displaying the area...");
    }
}
class circle extends shape{
    double radius;

    circle(double radius){
        this.radius =radius;

    }
    @Override
    void calculatearea(){
        double area = Math.PI*radius*radius;
        
        System.out.println("area of circle is:"+area);
    

    }
}
class rectangle extends shape{
    double length,width;
    rectangle(double length,double width){
        this.length =length;
        this.width=width;

    }
    @Override
    void calculatearea(){
        double area =length*width;
        System.out.println("area of rectangle is :"+area);


    }
}
public class assingnment2_Q1 {
    public static void main (String[]args){
        shape circle =new circle(5);
        circle.display();
        circle.calculatearea();
        System.out.println();

        shape rectangle= new rectangle(4,6);
        rectangle.display();
        rectangle.calculatearea();

    }

    
}
