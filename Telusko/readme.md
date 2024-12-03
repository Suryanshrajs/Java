string builder is not threadsafe
string buffer is threadsafe

//java does not supoprt multiple inheitence


//every  class in java extends objects class by default
//Super is used to call the  constructor of the parent class , if you do not want to pass parameter then also its fine   :  super()
//this is uesd to call the constructor of same class     :   this()



what are the packages in java ?
basically packages in java are like a folder in which we usually keep the same type of class / files  , jisse hume ek hi jgh pe sari class mil j aye jo ek dusre se related hai



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






//Lecture 58

In this lecture we are discussing about object class:

-- every class in java inherit object class
-- in this lecture we see some member method of object class

public native int hashCode();
public boolean equals( Object);
public  String toString();

1)hashCode() method:
In Java, the hashCode () method is a method that is defined in the Object class, 
which is the parent class of all classes in Java. It returns an integer value that 
represents the unique hash code of an object.

2)equals(Object) method:
equals(Object obj) is the method of Object class. This method is used to compare 
the given objects. It is suggested to override equals(Object obj) method to get our own equality condition on Objects.

3)toString() method:
We typically generally do use the toString() method to get the string representation of an object. It is very important 
and readers should be aware that whenever we try to print the object reference then internally toString() method is invoked. 
If we did not define the toString() method in your class then the Object class toString() method is invoked otherwise our 
implemented or overridden toString() method will be called.

case 1: class which not override object class toString(), hashCode(), equals() method
class Mobile{
   String model;
   int price;
}

class Main{
    public static void main(String []args){
       Mobile mb1=new Mobile();
       mb1.model="Apple";
       mb1.price=100000;

      Mobile mb2=new Mobile();
      mb2.model="Apple";
      mb2.price=100000;

   
System.out.println(mb1); //Internally mb1.toString() is called and print Mobile@4617c264
System.out.println(mb2); // Internally mb2.toString() is called and print Mobile@36baf30c
 

        //use of equals() method to compare to object
        boolean result =mb1.equals(mb2); //right now it give false result because by default implementation of equals() method compare reference of two objects
        System.out.println(result); //false 

        //use of hashCode()
       System.out.println(mb1.hashCode()); //1175962212
       System.out.println(mb2.hashCode());  //918221580 , provide some unique value 
    }
}

case 2: class can override object class hashCode(), toString(), equals()
class Mobile{
    String model;
    int price;

    @Override
    public String toString(){
        return "Model: "+model+" and price: "+price;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mobile other = (Mobile) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
 
}

class Main{
    public static void main(String []args){
        Mobile mb1=new Mobile();
        mb1.model="Apple";
        mb1.price=100000;

        Mobile mb2=new Mobile();
        mb2.model="Apple";
        mb2.price=100000;

        //use of toString() method,  overrides method 
        System.out.println(mb1); //Internally mb1.toString() is called and print Model: Apple and price: 100000
        System.out.println(mb2); // Internally mb2.toString() is called and print Model: Apple and price: 100000
 
        //use of equals() method to compare two object, overrides method
        boolean result =mb1.equals(mb2); //right now it give true result because we override equals() method
        System.out.println(result); //true

        //use of hashCode()
       System.out.println(mb1.hashCode()); //1967873639 due to overrides hashcode method
       System.out.println(mb2.hashCode());  //1967873639  

       System.out.println(mb1==mb2); 
    }
}

Note: it is not mandatory to override every member method of object class but it is advice able 
to override toString() and equals() method to compare and print own object.







//Lecture 59