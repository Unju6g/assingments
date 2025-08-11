public class assingment2_Q6 {
    public String name = "Alice";          
    private int age = 20;                  
    protected String course = "Computer Science"; 

    
    public void displayPrivateData() {
        System.out.println("Age: " + age);
    }

       public static void main(String[] args) {
        assingment2_Q6 obj = new assingment2_Q6();
        System.out.println("Name: " + obj.name);
        System.out.println("Course: " + obj.course);
        obj.displayPrivateData();
    }
}

