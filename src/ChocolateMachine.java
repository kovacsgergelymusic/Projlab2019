import java.util.Random;
public class ChocolateMachine extends Thing{
	public void Whistle() {
		Notify();
	}
	public void Step() {
		Random rand=new Random();
		if (rand.nextInt(1)<2) { //most még mindig csinálja
			Whistle();
		}
	}
	public void Notify() {
		for (Observer o:observers) {
			o.Update(this);
		}
	}
	public void Detach(Observer o) {
		observers.remove(o);
	}
}
