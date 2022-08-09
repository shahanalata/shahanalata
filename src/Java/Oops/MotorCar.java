package Java.Oops;

public class MotorCar extends Train{

	public  void wheel() {
		System.out.println("it has two wheel");   //main method create on child class,all methods are come in same class
	}                                           //if i create main method in paraent class it shows only grant parent's method
public static void main(String[] args) {
	MotorCar mc= new MotorCar();
	mc.speed();
	mc.wheel();
	mc.getName();
}
}
