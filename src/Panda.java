import java.util.ArrayList;
public class Panda extends Animal implements Observer {
	private Animal puller;
	private ArrayList<Observable> observables;
	public void Move(int side) {}
	public void Step() {}
	public boolean CollideWithPanda(Panda p){return true;}
	public boolean CollideWithOrangutan(Orangutan o){return true;}
	public boolean CaughtbyOrangutan(Orangutan o){return true;}
	public Animal GetPuller(){return puller;}
	public void SetPuller(Animal a){puller=a;}
	public void Destroy(){}
	public void GetScared(){}
	public void Jump(){}
	public void Sit(){}

}
