package methodVariable.methodpractice;

public class ChampionsLeague {

	public static void main(String[] args) {
		
	Mets Metsobj = new Mets();
	Yankee Yankeeobj = new Yankee();
	   
	   Metsobj.bestPlayer();
	   Yankeeobj.bestplayer();
	   Mets.Stadium();
	   Yankee.Stadium();
	   

		// static --> keyword
			// 1. static method/variable --> can go inside static method or non static method, 
			// if in the same class it can go directly , but if in different class we need to
		// specify name of the class. method name();
		
			// 2. non-static method/variable --> can go inside non-static method in the same class directly 
			// if we still have to call non static methods inside static, we should create Objects of the class
			// SamE CLASS OR DIFFERENT CLASS
	   

	}
     //public void worldXI() {
	// Mets Metsobj = new Mets();
	 //Metsobj.bestPlayer();
	 
 }
	
	
//}
