package Java.Oops;

public class Extraclass {

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
    System.out.println(abc.getA());
     abc.setA(60);
     System.out.println(abc.getA());
	}

}
