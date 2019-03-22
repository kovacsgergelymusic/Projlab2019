public class Chair extends Thing {
	
	public void Step(boolean occupied) {
		System.out.println("Step()");
		if (!occupied) {
			Notify();
		}
	}
	public void Notify(ArrayList<Observer> observers) {
		System.out.println("Notify()");
		for (Observer o:observers) {
			o.Update(this);
		}
	}
	public boolean GetOccupied(boolean occupied) {
		System.out.println("GetOccupied()");
		return occupied;
		}
	public void Detach(Observer o, ArrayList<Observer> observers) {
		System.out.println("Detach(Observer o)");
		observers.remove(o);
	}
}
