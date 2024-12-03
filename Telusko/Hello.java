// import java.io.*;

// class Human{
//     private int age;
//     private String name;
//     public int getAge() {
//         return age;
//     }
//     public String getName() {
//         return name;
//     }
//     public void setAge(int age) {
//         this.age = age;
//     }
//     public void setName(String name) {
//         this.name = name;
//     }
    

// }




// class Hello{
//     public static void main(String[] args) {
//         String name = "Suryansh";
//         System.out.println(VM.current().addressOf(name));
//         name+=" Singh";
//         System.out.println(name);
//         System.out.println(&name);
//     }
// }


// class A{
//     public A(){
//         super();     //super is used to claa the parameterized constructor of parent class
//         System.out.println("inside a");
//     }
//     public A(int n){
//         super();     //super is used to claa the parameterized constructor of parent class
//         System.out.println("inside a int");
//     }
// }
// class B extends A{
//     public B(){
//         super();     //super is used to claa the parameterized constructor of parent class
//         System.out.println("inside b");
//     }
//     public B(int n){
//         super(n);     //super is used to claa the parameterized constructor of parent class
//         System.out.println("inside b int");
//     }
// }

// class Hello{

    
//     public static void main(String[] args) {
//         B obj = new B(5);
//     }
// }




//Method OverRiding

// class A{
//     public void show(){
//         System.out.println("in class A show");
//     }
//     public void config(){
//         System.out.println("in class A config");
//     }
// }
// class B extends A{
//     public void show(){
//         System.out.println("in class B show");
//     }
//     public void config(){
//         System.out.println("in class B config");
//     }
// }

// class Hello{
//     public static void main(String[] args) {
//         B objB = new B();
//         objB.show();
//         objB.config();
//     }
// }











//Packages in JAVA

// import Calculator.AdvanceCalc;
// import Calculator.NormalCalc;

// public class Hello {

//     public static void main(String[] args) {
//         AdvanceCalc obj = new AdvanceCalc();
//         double anss = obj.sqrtt(3);
//         System.out.println(anss);
//         NormalCalc obj2 = new NormalCalc();
//         int summ = obj2.add(4, 8);
//         System.out.println(summ);
//     }
// }









//Access Modifier

//if you want to access anything from different Packages ,  you have m=to make taht variable and method public which you want to access
// by default they are deafult 
// deafult can be accessed in samer package
// in one file you have to  make only one class , and in one class only one class can be public












//polymorphism
// poly -> many
// morphism -> behaviour

//1. compile time (earlybind)
//2 . run time polymorphism (late binding)

//method overloading  : compile time
//metjod overriding : runt ime polymorphism

/* -- in previous lecture we had discussed what is polymorphism 
-- in this lecture we are further talking about run time polymorphism
-- suppose we have some class A , B and C
-- class B and C extends A 
-- in All three class we have show() method 
-- main() method of Demo we create object of A, B and C but we create only reference of A which can hold
object of A, B and C .
class A{
public void show(){
    Systeem.out.println("in show A");
}
}
class B extends A{
public void show(){
    Systeem.out.println("in show B");
}
}

class C extends A{
public void show(){
    Systeem.out.println("in show C");
}
}

public class Demo{
    public static void main(String []args){
        A obj =new A();  
        obj.show();  //Output: in show A

        obj =new B(); //reference is A (we can use reference of parents) and create object of B  and assign to parents reference variable.
        obj.show();  //Output: in show B

        obj =new B();  //reference is A (we can use reference of parents) and create object of C and assign to parents reference variable.
        obj.show();  //Output: in show C

 
    }
}

Note: during compile time we donot which show() method is called from which class.
    -- we can know during run time which show method is called this is known as run time polymorphism.
  -- all this concept is class dynamic method dispatch  */




  //we use final to make constant
  //no one can inherit your final class
  // noone can override final method