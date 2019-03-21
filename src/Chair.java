public class Chair extends Thing {
	private boolean occupied;
	public void Step() {
		if (!occupied) {
			Notify();
		}
	}
	public void Notify() {
		for (Observer o:observers) {
			o.Update(this);
		}
	}
	public boolean GetOccupied() {
		return occupied;
		}
	public void Detach(Observer o) {
		observers.remove(o);
	}
}
