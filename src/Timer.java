import java.util.ArrayList;
//Timer oszt�ly
public class Timer {
	//Feliratkozottak l�ptet�se
	public void Tick(ArrayList<Steppable> steppables, int random, ArrayList<Observer> observers) {
		System.out.println("Tick()");
		for (Steppable s:steppables){
			//s.Step(random, observers);
		}
	}
	//Leiratkoz�s
	public void RemoveSteppable(Steppable s) {
		System.out.println("RemoveSteppable(Steppable s)");

	}
}
