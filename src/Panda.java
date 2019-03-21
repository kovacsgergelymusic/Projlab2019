import java.util.ArrayList;
public class Panda extends Animal implements Observer, Steppable {
	private Animal puller;
	private ArrayList<Observable> observables;
	public void Move(int side) {}
	public void Step() {
		
	}
	public boolean CollideWithPanda(Panda p){		
		return false;
	}
	public boolean CollideWithOrangutan(Orangutan o){
		if (puller==null){
			CaughtbyOrangutan(o);
		}
		return false;
	}
	public boolean CaughtbyOrangutan(Orangutan o){	//nincs kész
		return false;
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
