import java.util.Random;
public class SlotMachine extends Thing {
	public void Jingle() {
		System.out.println("Jingle()");
		Notify();
	}
	public void Step(int random) {
		System.out.println("Step()");
		
		if (random<2) {	//most még mindig csinálja
			Jingle();
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
