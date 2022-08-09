package Java.Oops;

public class Encapsulation1 {
	
	private int a=20;
	
	public int getA() {         //non-void method
		return a;
		
	}
public void setA(int a) {      //
     this.a=a;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
 Encapsulation1 en=new Encapsulation1();
 en.getA();
 System.out.println(en.getA());
 en.setA(50);
 System.out.println(en.getA());
 en.setA(30);
 System.out.println(en.getA());  
 
 Encapsulation1 abc =new Encapsulation1();
 abc.getA();
 System.out.println(abc.getA());
 abc.setA(60);
 System.out.println(abc.getA());
	
	}
}

