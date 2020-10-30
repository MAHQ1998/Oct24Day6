package methodVariable.methodpractice;

public class Static_NonStatic {
	
	//Create static and no static methods & variables and call them in the same class
	//inside another static and non-static methods 

	public static void main (String[]args) {
		HappyColombusDay();
		Static_NonStatic PlanA = new Static_NonStatic();
		PlanA.GoShopping();
		
		
		
		
	}
    public void  GoShopping() {
    	System.out.println("Supper Market");
    	LetsgoPlay();
    	
    }
    
    public void LetsgoPlay () {
    	
    	System.out.println("Cricket");
    
    }
    
    public static void HappyColombusDay() {
    	System.out.println("But It's Rainning");
    	
    }
}
