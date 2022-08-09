package Java.Oops;                     //constractor overloading

public class Constructor {
	
	Constructor(){                   //no parameter
		System.out.println("i do not have parameter");
	}
	Constructor(int a){
		System.out.println(" I have a int parameter which is      "+a);
	}
	Constructor(String a){
		System.out.println(" I have a string that is  "+ a);
	}
	void getName() {
		System.out.println("I am shahana");
	}

	public static void main(String[] args) {
		Constructor ct = new Constructor("shahana");
		/////////////(400)
		ct.getName();

	}

}
