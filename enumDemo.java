package Samplejava;

public class enumDemo {
	enum GameLevel{
		
		low,
		medium,
		high
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//assign enum variable
		GameLevel a=GameLevel.high;
		System.out.println(a);
		
		//use Enu in switch
		switch(a) {
		   case low:
			   System.out.println("low level");
			   break;
		   case medium:
			   System.out.println("medium level");
			   break;
		   case high:
			   System.out.println("high level");
			   break;
			   
		}
		//Enum by loop
		for (GameLevel level :	GameLevel.values()) {
			System.out.println(level);
		}

	}

}
