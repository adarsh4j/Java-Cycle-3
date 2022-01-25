interface firstclass

{

	public void mymethod();	
  
  public void myothermethod();

	public void mymark();

}

class demo implements firstclass

{

	 public void mymethod()

	 {

	 	System.out.println("Ram");

	 }

	 public void myothermethod()

	 {

	 	System.out.println("14");

	 }

	 public void mymark()

	 {

	 	System.out.println("88,99,89,96,90");

	 }

}

public class Experiment1

{

  	public static void main(String args[])

	  {

		demo obj=new demo();

		obj.mymethod();

		obj.myothermethod();

		obj.myhero();

	}

}
