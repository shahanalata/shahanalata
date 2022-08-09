package Java.Oops;

public class Childclass implements interface1, interface2 { 
	public void getName() {
		System.out.println("I am the child");
	}
	
  @Override
	public void getTuktuk() {
		System.out.println("This is tiktok");
		
	}


	@Override
	public void getLalala() {
		System.out.println("hello");
		
	}


	@Override
	public void getTiktik() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void getShasha() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Childclass cc= new Childclass();
		cc.getTuktuk();
		cc.getLalala();
		cc.getName();
		
	}
}
