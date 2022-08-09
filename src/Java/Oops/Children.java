package Java.Oops;

public class Children extends Parentclass{
	 public void getGrocery(int a) {
		 System.out.println("I am the child");
	 }
	 public void getGrocery(String name) {
		 System.out.println("shahana");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Children ch=new Children();
      ch.getGrocery(40);
      ch.getGrocery("shahana", null);
      ch.getGrocery(null);
      
	}

}
