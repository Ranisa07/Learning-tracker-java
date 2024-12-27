class Car{

    //Fields (Properties)
    String brand;
    int year;
    
    //Constructor (to initialize objects)
    Car(String brand, int year){
    this.brand=brand;
    this.year=year;
    }
    
    //Method (Behavior)
    void displayInfo(){
    System.out.println("Brand:"+ brand);
    System.out.println("Year:"+year);
    }
}
    //Main class to demonstate objects
    public class Main{
    public static void main(String []args){
    
    //Create an object for Car class
    Car myCar=new Car("Toyota",2020);
    
    //Access fields and call methods
    myCar.displayInfo();
    }
  }



