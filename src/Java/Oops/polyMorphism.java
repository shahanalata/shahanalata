package Java.Oops;
                                       //2 types polymorphism-overloading(static polymorphism), overriding
public class polyMorphism {            //same method name in same class, we should change only parameter
	                                   //overloading polymorphism
	public void GetName(){
		System.out.println("i have no parameter");
	}                                                //compile
	
	public void getName(String name) {
		System.out.println("i have 1 string perameter");//
		
	}
	public void getName(String name,String name1) {
		System.out.println("I have 2 String parameter");
	
	}
	public void getName(int a) {
		System.out.println("I have 1 int parameter");
	}

	public static void main(String[] args) {
		polyMorphism pm= new polyMorphism();
		pm.getName("Mohammad");                   // depends on the reference type
		pm.getName(50);
		pm.getName("Mohammad", null);
		

	}

}
