import java.util.ArrayList;
//Timer osztály
public class Timer {
	//Feliratkozottak léptetése
	public void Tick(ArrayList<Steppable> steppables, int random, ArrayList<Observer> observers) {
		System.out.println("Tick()");
		for (Steppable s:steppables){
			//s.Step(random, observers);
		}
	}
	//Leiratkozás
	public void RemoveSteppable(Steppable s) {
		System.out.println("RemoveSteppable(Steppable s)");

	}
}
