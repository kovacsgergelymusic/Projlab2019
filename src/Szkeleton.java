import java.util.Scanner;

public class Szkeleton {
	public static void main(String args[])
	{
		PrintMenu();
	}
	  private static void PrintMenu(){
		  while (true)
		  {
		  Scanner sc=new Scanner(System.in);
		  try {
		  	System.out.print("Új teszt:\n1. Játékgép csilingel\n2. Csokiautomata sípol\n3. Fáradékony panda fotel mellett megy el\n4. Panda mozog\n5. Orángután mozog\n6. Sor felbomlik\n7. Egy panda lezuhan\n8. Egy orángután lezuhan ");
		  	 switch (sc.nextInt()){
			  	case 1: //1 Játékgép csilingel
	                 System.out.println("Játékgép csilingel, a mellette lévo csempén…,"
	                 		+ "\n\t1. ...ijedos panda van, amelyik..."
	                 		+ "\n\t2. ...ugró panda van."
	                 		+ "\n\t3. ...fáradékony panda van.");
	                 switch (sc.nextInt()){
	                 	case 1:{
	                 		System.out.println("Játékgép csilingel, a mellette lévo csempén ijedos panda van, amelyik..."
	                 				+ "\n\t1. ...húz más pandákakat"
	                 				+ "\n\t2. ...nem húz más pandákat.");
	                 		 switch (sc.nextInt()){
		                 		 case 1:
		                 			System.out.println("Játékgép csilingel, a mellette lévo csempén ijedos panda van, amelyik húz más pandákakat:");
		                 			 JatekgepCsilingel();
		                 			break;
		                 		 case 2:
		                 			System.out.println("Játékgép csilingel, a mellette lévo csempén ijedos panda van, amelyik nem húz más pandákat:");
		                 			JatekgepCsilingel();
		                 			break;
	                 		 }
	                 		 break;
	                 	}
	                 	case 2:{
	                 		System.out.println("Játékgép csilingel, a mellette lévo csempén ugró panda van:");
	                 		JatekgepCsilingel();
	                 		break;
	                 	}
	                 	case 3:{
	                 		System.out.println("Játékgép csilingel, a mellette lévo csempén fáradékony panda van:");
	                 		JatekgepCsilingel();
	                 		break;
	                 	}
	                 }
	                 break;
			  	case 2: //Csokiautomata sípol
			  		 System.out.println("Csokiautomata sípol, a mellette lévo csempén…,"
		                 		+ "\n\t1. ...ugró panda van, amelyik…"
		                 		+ "\n\t2. ...fáradékony panda van."
		                 		+ "\n\t3. ...ijedos panda van.");
			  		 switch (sc.nextInt()){
	                 	case 1:{
	                 		System.out.println("Csokiautomata sípol, a mellette lévo csempén ugró panda van, amelyik…"
	                 				+ "\n\t1. ...sor végén áll, és a csempe hátralévo élettartama…"
	                 				+ "\n\t2. ...sor közepén áll, és a csempe hátralévo élettartama…"
	                 				+ "\n\t3. ...egyedül áll, és a csempe hátralévo élettartama…");
		                 	switch (sc.nextInt()){
		                 		 case 1:
		                 			System.out.println("Csokiautomata sípol, a mellette lévo csempén ugró panda van, amelyik sor végén áll, és a csempe hátralévo élettartama…"
		                 					+ "\n\t1. ...1."
		                 					+ "\n\t2. ...5.");
		                 			switch(sc.nextInt()) {
		                 				case 1:
		                 					System.out.println("Csokiautomata sípol, a mellette lévo csempén ugró panda van, amelyik sor végén áll, és a csempe hátralévo élettartama 1:");
		                 					CsokiautomataSipol();
		                 					break;
		                 				case 2:
		                 					System.out.println("Csokiautomata sípol, a mellette lévo csempén ugró panda van, amelyik sor végén áll, és a csempe hátralévo élettartama 5:");
		                 					CsokiautomataSipol();
		                 					break;
		                 			}
		                 			break;
		                 		 case 2:
		                 			System.out.println("Csokiautomata sípol, a mellette lévo csempén ugró panda van, amelyik sor közepén áll, és a csempe hátralévo élettartama…"
		                 					+ "\n\t1. ...1."
		                 					+ "\n\t2. ...5.");
		                 			switch(sc.nextInt()) {
		                 				case 1:
		                 					System.out.println("Csokiautomata sípol, a mellette lévo csempén ugró panda van, amelyik sor közepén áll, és a csempe hátralévo élettartama 1:");
		                 					CsokiautomataSipol();
		                 					break;
		                 				case 2:
		                 					System.out.println("Csokiautomata sípol, a mellette lévo csempén ugró panda van, amelyik sor közepén áll, és a csempe hátralévo élettartama 5:");
		                 					CsokiautomataSipol();
		                 					break;
		                 			}
		                 			break;
		                 		 case 3:
			                 		System.out.println("Csokiautomata sípol, a mellette lévo csempén ugró panda van, egyedül áll, és a csempe hátralévo élettartama…"
			                 				+ "\n\t1. ...1."
		                 					+ "\n\t2. ...5.");
			                 		switch(sc.nextInt()) {
		                 				case 1:
		                 					System.out.println("Csokiautomata sípol, a mellette lévo csempén ugró panda van, egyedül áll, és a csempe hátralévo élettartama 1:");
		                 					CsokiautomataSipol();
		                 					break;
		                 				case 2:
		                 					System.out.println("Csokiautomata sípol, a mellette lévo csempén ugró panda van, egyedül áll, és a csempe hátralévo élettartama 5:");
		                 					CsokiautomataSipol();
		                 					break;
			                 		}
			                 		break;
	                		 }
	                 		 switch (sc.nextInt()){
		                 		 case 1:
		                 			System.out.println("Csokiautomata sípol, a mellette lévo csempén fáradékony panda van:");
		                 			 JatekgepCsilingel();
		                 			break;
		                 		 case 2:
		                 			System.out.println("Csokiautomata sípol, a mellette lévo csempén ijedos panda van:");
		                 			JatekgepCsilingel();
		                 			break;
	                 		 }
	                 		 break;
	                 	}
	                 	case 2:{
	                 		System.out.println("Csokiautomata sípol, a mellette lévo csempén fáradékony panda van:");
	                 		JatekgepCsilingel();
	                 		break;
	                 	}
	                 	case 3:{
	                 		System.out.println("Csokiautomata sípol, a mellette lévo csempén ijedos panda van:");
	                 		JatekgepCsilingel();
	                 		break;
	                 	}
	                 }
			  	case 3: //Fáradékony panda elfárad
			  		System.out.println("Fáradékony panda elfárad");
			  		FaradekonyPandaElfarad();
			  	case 4: //Panda mozog
			  		System.out.println("Panda mozog");
			  		PandaMozog();
			  	case 5: //Orángután mozog
			  		System.out.println("Orángután mozog");
			  		OrangutanMozog();
			  	case 6: //Sor felbomlik
			  		System.out.println("Sor felbomlik");
			  		SorFelbomlik();
			  	case 7: //Egy panda lezuhan
			  		System.out.println("Egy panda lezuhan");
			  		EgyPandalezuhan();
			  	case 8: //Egy orángután lezuhan
			  		System.out.println("Egy orángután lezuhan");
			  		EgyOrangutanlezuhan();
			  		
		  	 }
		  }catch (Exception e){
			  System.out.println("Helytelen input!");
	            //e.printStackTrace();
		  }
		  }
	  }
	  public static void  JatekgepCsilingel()
	  {
		  System.out.println("Játékgép csilingel");
	  }
	  public static void  CsokiautomataSipol()
	  {
		  System.out.println("Csoki");
	  }
	  public static void  FaradekonyPandaElfarad()
	  {
		  
	  }
	  public static void  PandaMozog()
	  {
		  
	  }
	  public static void  OrangutanMozog()
	  {
		  
	  }
	  public static void  SorFelbomlik()
	  {
		  
	  }
	  public static void  EgyPandalezuhan()
	  {
		  
	  }
	  public static void  EgyOrangutanlezuhan()
	  {
		  
	  }
}
