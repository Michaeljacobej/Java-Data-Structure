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

public class method {
    
}
