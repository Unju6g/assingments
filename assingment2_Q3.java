

class Animal{
    void sound()
{
    System.out.println("Animal makes a sound");
}
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("dog barks");
    }

}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

  public class assingment2_Q3 {
public static void main(String[] args) {
    
    Animal myAnimal= new Dog();
    myAnimal.sound();

    myAnimal= new Cat();
    myAnimal.sound();

}
    
}
