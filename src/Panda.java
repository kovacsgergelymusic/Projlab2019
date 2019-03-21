import java.util.ArrayList;
import java.util.Random;
public class Panda extends Animal implements Observer, Steppable {
	protected Animal puller;
	private ArrayList<Observable> observables;
	public void Move(int side) {}
	
	public boolean CollideWithPanda(Panda p){		
		return false;
	}
	public boolean CollideWithOrangutan(Orangutan o){
		if (puller==null){
			CaughtbyOrangutan(o);
			return true;
			}
		return false;
		}
	public  void CaughtbyOrangutan(Orangutan o){	//nincs kész

	}
	public Animal GetPuller(){
		return puller;
	}
	public void SetPuller(Animal a){
		puller=a;
	}
	public void Destroy(){
		for (Observable o:observables){
			o.Detach(this);
			Game.getInstance().GetTimer().RemoveSteppable(this);
			Game.getInstance().DeleteAnimal(this);
		}
	}
	public void Step() {
		Random rand=new Random();
		if (puller==null) {
			int sides=tile.GetSides();
			Move(rand.nextInt(sides));
		}
	}
	public void GetScared(){}
	public void Jump(){}
	public void Sit(){}
	public void Update(Observable ob) {}
	public void Disband(){
		puller.SetPulled(null);
		puller=null;
		if (pulled!=null) {
			pulled.Disband();
		}
	}
}
