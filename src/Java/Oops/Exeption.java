package Java.Oops;
                                           //exeption handlind, exeption in java is ERROR, 2 kinds of exeption
public class Exeption {                   ///1.Checked/compile-time exeption-- it need to fixed  before execution 
	                                       //2.Unchecked/runtime- after run/execute the code,error is shown in consule.
/*public void getDiv(int a, int b) {      //compile means writing the code
	System.out.println(a/b);
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Exeption ex= new Exeption(10,5);
        
		int[]run= {150,60,45,80,100};
	    System.out.println(run[3]);
	    
	    System.out.println("The code is executing");
	    
	    try {
	                                                           //try-catch block handling to others,                                                                       
	    System.out.println(run[10]);                           //code execution is continue next for this block
	    }
	    catch(ArrayIndexOutOfBoundsException e) {       //(exception)-super class
	    	
	    }
	    finally {    
	    System.out.println("Blah Blah");	                                           
	                                                //finally is a key word in java, if try -catch block is not working 
	    }
	                                                 // anyhow we can use finally,any code inside the finally block
	                                                 //it must be execute
	                                                 
	    System.out.println("The execution is complete");
	}
}
