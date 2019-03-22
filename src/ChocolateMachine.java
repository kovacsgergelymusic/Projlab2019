import java.util.Random;
public class ChocolateMachine extends Thing{
	public void Whistle() {
		System.out.println("Whistle()");
		Notify();
	}
	public void Step(int rand) { //tesztelés alatt nem randomozunk
		System.out.println("Step()");
		if (rand<2) { //most még mindig csinálja
			Whistle();
		}
	}
	
	public void Notify(ArrayList<Observer> observers) {
		System.out.println("Notify()");
		for (Observer o:observers) {
			o.Update(this);
		}
	}
	public void Detach(Observer o, ArrayList<Observer> observers) {
		System.out.println("Detach(Observer o)");
		observers.remove(o);
	}
	
}
