abstract class Person {
    protected String name;
    protected String id;

    public Person (String name , String id){
        this.name = name;
        this.id = id;
    }

    public abstract String getRole();

    public void displayInfo() {
        System.out.println("name:"+ name +" ,id:"+id+" ,role:"+ getRole());
    }
}
interface Login{
    boolean login(String username ,String password);
}

class Student extends Person implements Login {
    private String studentusername ="student123";
    private String studentpassword ="stud@123";

    public Student (String name , String id) {
        super(name,id);
    }
    
    @Override
    public String getRole(){
        return "Student";
    }

    @Override
    public boolean login (String username , String password){
        return username.equals(studentusername) && password.equals (studentpassword);
    }
    }


    class Faculty extends Person implements Login{
        private String facultyusername ="faculty123";
        private String facultypassword ="fac@123";

        public Faculty (String name ,String id){
            super (name ,id);

        }
        @Override
        public String getRole(){
            return "Faculty";
        }
        @Override
        public boolean login(String username , String password){
            return username.equals(facultyusername) && password.equals(facultypassword);
        }

     }
     public class assingment3_Q2{
        public static void main (String []args){
        Person student = new Student ("gunjan", "s101");
         Person faculty = new Faculty ("dr.shaha", "f202");
            Login studentLogin = (Login) student;
            Login FacultyLogin = (Login) faculty;

            System.out.println("----student login----");
            if (studentLogin.login("student123","stud@123")){
                student.displayInfo();
                System.out.println("login successful!\n");
            }else{
                System.out.println("invalid student credentials\n");
            }
            System.out.println("----Faculty Login----");
            if(FacultyLogin.login("faculty123","fac@123")){
                faculty.displayInfo();
                System.out.println("login successful\n");
            }else{
                System.out.println("invalid faculty credentials\n");
            }
        }
     }

