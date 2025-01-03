public class StaticNonStaticExample{
    //Static field: belongs to the class
    static String staticField="I am a static field";
    
    //Non-static field: belongs to an Instance
    String nonStaticField;
    
    //Constructor to initialize the non-static field
    public StaticNonStaticExample(String value){
    this.nonStaticField=value;
    }
    
    //Static method: can access static fields only
    static void displayStaticField(){
    System.out.println(staticField);
    }
    
    //Non-static method: can access both static and non-static fields
    void displayField(){
    System.out.println("Static Field:"+ staticField);
    System.out.println("Non-Static Field:"+ nonStaticField);
    }
    
    public static void main(String []args){
    //Accessing static field and method directly using the class name
    System.out.println(StaticNonStaticExample.staticField);
    StaticNonStaticExample.displayStaticField();
    StaticNonStaticExample example=new StaticNonStaticExample("I am a non-static field");
    example.displayField();
    }
    }