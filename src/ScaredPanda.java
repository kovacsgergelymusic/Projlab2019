
public class ScaredPanda extends Panda {
	public void GetScared(){
		System.out.println("GetScared()");
	}
	public void Step() {
		System.out.println("Step()");
	}
	public void Update(Observable ob) {
		System.out.println("Update()");
	}
}
