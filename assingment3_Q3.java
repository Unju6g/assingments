interface Sellable {
    void displayItemdetails();
    double getPrice();
}
abstract class Product{
    protected String name;
    protected String category;
    protected double basePrice;

public Product( String name , String category, double basePrice) {
 this.name =name;
 this.category =category;
 this.basePrice = basePrice;

}
   
public abstract double calculateDiscount(double price);

}
class ElectronicItem extends Product implements Sellable {
    public ElectronicItem(String name, double basePrice) {
        super(name, "Electronics", basePrice);
    }
    @Override
    public double calculateDiscount(double price){

        return price *0.10;

    }
    @Override
    public void displayItemdetails(){
        System.out.println("Electronic Item : "+ name +" | Category: "+ category );
        System.out.println("Base Price : $"+basePrice+ " | final Price :$ "+ getPrice());
    
    }
    @Override
    public double getPrice(){
        double discount = calculateDiscount(basePrice);
        return basePrice - discount;
    }
}
class ClothingItem extends Product implements Sellable{
    public ClothingItem(String name , double basePrice){
        super (name,"clothing",basePrice);
    }
    @Override
    public double calculateDiscount(double price){
        return price * 0.20;
    }
    @Override
    public void displayItemdetails(){
        System.out.println("clothing Item :"+ name +" | category:"+category+"");
        System.out.println("Base Price :$"+ basePrice +" |Final price :$"+ getPrice());
    }
    @Override
    public double getPrice(){
        double discount = calculateDiscount(basePrice);
        return basePrice -discount;
    }
}
public class assingment3_Q3 {
     public static void main (String []args) {
        Sellable phone =new ElectronicItem("smartphone", 50000);
       Sellable tshirt = new ClothingItem("t-shirt",1000);

        System.out.println("---online marketplace---");
        phone.displayItemdetails();
        System.out.println();
        tshirt.displayItemdetails();
    }

    
}
