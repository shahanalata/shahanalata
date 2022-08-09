package Java.Oops;

public class Childdish extends absTract{
	 
	public void getName() {
		System.out.println("I am the child");
	}

	@Override
	void getGrocery() {
		System.out.println("This is grocery");
		// TODO Auto-generated method stub   ///regular method not override!!!!
		
	}
	
	

	public static void main(String[] args) {
		Childdish cc= new Childdish();
		cc.getCar(); 
		cc.getGrocery();

	}

}
