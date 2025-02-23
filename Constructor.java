//Example of Default Constructor in Java
class DefaultExample {
    int number;
    String text;

    //Explicit default constructor
    public DefaultExample() {
        number=42;
        text="Hello, World!";
    }
}
//Example of Parameterized Constructor in Java
class Student {
    String name;
    int age;
    
    //Parameterized Constructor
    Student(String name1, int age1)
    {
        name=name1;
        age=age1;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
// Example of using `this` in default constructor
class Example {
    int x;
    int y;

     //Default constructor 
    Example(){
        this(10,20); // Calls the parameterized constructor
        System.out.println("Default constructor called");
    }
     // Parameterized constructor
     Example(int x, int y){
        this.x=x; //Refers to the instance variable 'x'
        this.y=y; //Refers to the instance variable 'y'
        System.out.println("Parameterized constructor called");
    }
    void show(){
        System.out.println("x:" +x);
        System.out.println("y:" +y);
    }
}
// Example of using `this` in parameterized constructor
class Example1{
    int p;
    int q;

    //Parameterized constructor
    Example1(int p, int q){
        this.p=p; //Refers to the instance variable 'p'
        this.q=q; //Refers to the instance variable 'q'
    }
    void show1(){
        System.out.println("p:" +p+",q:" +q);
    }
}
public class Constructor{
    public static void main(String []args)
    {
        DefaultExample obj=new DefaultExample();
        System.out.println("Number:"+obj.number);
        //Output: 42
        System.out.println("Text:"+obj.text);
        //Output: Hello World!
         //Create an object using the parameterized constructor
         Student student1=new Student("Alice",20);
         student1.display();
         Student student2=new Student("Bivek",21);
         student2.display();
         Example e1=new Example(); //Calls the Default constructor
        e1.show();
        Example1 ob=new Example1(5,15); //Calls the parameterized constructor
        ob.show1();
    }
}