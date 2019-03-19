
public class Orangutan extends Animal {
	private int points;
	public void Addpoint() {points++;}
	public void Move(int side) {}
	public boolean CollideWithPanda(Panda p){return true;}
	public boolean CollideWithOrangutan(Orangutan o){return true;}
}
