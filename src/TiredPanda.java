
public class TiredPanda extends Panda {
	private boolean tired;
	public void Sit(boolean tired) {
		System.out.println("Sit()");
	}
	public void Step() {
		System.out.println("Step()");
	}
	public void Update(Observable ob) {
		System.out.println("Update(Observable ob");
	}

}
