package Method;

class PrintUtil {  
    // Method with one parameter  
    public void print(String message) {  
        System.out.println(message);  
    }  
    // Overloaded method with two parameters  
    public void print(String message, int times) {  
        for (int i = 0; i < times; i++) {  
            System.out.println(message);  
        }  
    }  
}  

class Animal {  
    // Method to be overridden  
    public void sound() {  
        System.out.println("Animal makes a sound");  
    }  
}  

class Dog extends Animal {
    // Overriding method  
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
       System.out.println("Hello");
    }
}

class Test
{
    public static void main(String args[])
    {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x)->System.out.println(2*x);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
    }
}

