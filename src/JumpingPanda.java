
public class JumpingPanda extends Panda{
	public void Jump(Tile tile){
		System.out.println("Jump()");
		tile.JumpedOn();
	}
	public void Step() { //check if TODO
		System.out.println("Step()");
	}
	public void Update(Observable ob) {
		System.out.println("Update(Observable ob)");
	} //check if TODO
}
