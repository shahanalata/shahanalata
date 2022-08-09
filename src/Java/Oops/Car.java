package Java.Oops;

public class Car extends absTract{

	public void Color() {
		System.out.println("black");
	}

	@Override
	void getGrocery() {
		System.out.println("i need to buy some grocery");
		// TODO Auto-generated method stub
		
	}
   public static void main(String[] args) {
	Car cc=new Car();
	cc.getCar();
	cc.getGrocery();
	cc.Color();
}
}
	

	
	
	
	



