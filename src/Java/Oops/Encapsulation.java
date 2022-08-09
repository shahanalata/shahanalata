 package Java.Oops;

public class Encapsulation { 
	
	private int a =20; 
	String x ="Laa Laa";                 //it can be private also, no matter in this class
	
	public void getName() {                          //void method don't return anything
		System.out.println("I am the void method");
	
	}
	public int getNumber() {
		System.out.println("I am the return type method.");  //no void method
	
		return a;
	}
	public String getSome() {
		return x;
	}
	
	

	public static void  main(String[]args) {
	Encapsulation obj=new Encapsulation();
	obj.getName();
	obj.getNumber();                          //void method returns nothing, only code execute
	System.out.println(obj.getNumber());      //print only return type method 
    System.out.println(obj.getSome());
	}
}

