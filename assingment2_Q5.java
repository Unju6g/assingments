interface MyInterface {
    void show();

}
class Outer{
    class Inner{
        void display(){
            System.out.println("this is inner class.");
        }
    }
    void accessInner() {
        Inner innerObj = new Inner();
        innerObj.display();
    }
}

public class assingment2_Q5 {
    public static void main(String[] args) {
        Outer outerObj = new Outer();
    outerObj.accessInner();
    MyInterface obj = new MyInterface(){
        @Override
        public void show(){
            System.out.println("this is anonymous class.");
        }
    };
    obj.show();
}
}
