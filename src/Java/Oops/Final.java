package Java.Oops;

public class Final { 
	//declaring final variable 
	int x=10;
    final int age = 18;  
   
    void display() {  
    System.out.println("hello");  
    // reassigning value to age variable   
    // gives compile time error  
     //age = 55;  
    }  
    public void getNumber() {
    	x=18;                    //variable value cannot change when there have a final variable
    	
    }
    public final void getName()  {                            // final method cannot be overridden
    	
    }
      
    public static void main(String[] args) {  
      
    Final obj = new Final();  
    // gives compile time error  
    obj.display();  
    }  
	

}