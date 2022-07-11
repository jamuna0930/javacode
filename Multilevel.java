
//Multilevel Inheritance in java

package oops;


class GrandFather{
	
	 void house() {
		
		System.out.println(" 3 BHK House:");
		
	}
}

class Father extends GrandFather{
	
	 void land() {
		
		System.out.println(" 5 Arcs of Land:");
	}
}

class Son extends Father{
	
	  void car() {
		
		System.out.println(" Own Audi Car:");
	}
}



public class Multilevel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Son obj = new  Son();
         
		 obj.house();
		 obj.land();
		 obj.car();
    
	}

}