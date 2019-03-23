import java.util.ArrayList;
import java.util.Random;
public class Panda extends Animal implements Observer, Steppable {
	protected Animal puller;
	private ArrayList<Observable> observables;
	public void Move(int side) {}//Animal move
	
	public boolean CollideWithPanda(Panda p){
		System.out.println("CollideWithPanda(Panda p)");
		return false;
	}
	public boolean CollideWithOrangutan(Orangutan o, Animal puller){
		System.out.println("CollideWithOrangutan(Orangutan o)");
		if (puller==null){
			CaughtbyOrangutan(o);
			return true;
			}
		return false;
	}
	public  void CaughtbyOrangutan(Orangutan o, Tile tile, Tile oran_tile, Panda lead_panda){ //nincs kész
		System.out.println("CaughtbyOrangutan(Orangutan o)");
		oran_tile = o.GetTile(oran_tile);
                Panda lead_panda = o.GetPulled(lead_panda);
                o.SetPulled(this);
                if (lead_panda != null)
                        lead_panda.SetPuller(this);
                o.SetTile(tile);
                super.SetTile(oran_tile);
                tile.setAnimal(o);
                oran_tile.setAnimal(this);
                return false;
	}
	public Animal GetPuller(Animal puller){
		System.out.println("GetPuller()");
		return puller;
	}
	public void SetPuller(Animal a){
		System.out.println("SetPuller(Animal a)");
		
	}
	public void Destroy(ArrayList<Observable> observables){
		System.out.println("Destroy()");
		for (Observable o:observables){
			o.Detach(this);
			Game.getInstance().GetTimer().RemoveSteppable(this);
			Game.getInstance().DeleteAnimal(this);
		}
	}
	public void Step(int random, Animal puller) {
		System.out.println("Step()");
		
		if (puller==null) {
			Move(random);
		}
	}
	public void GetScared(){}
	public void Jump(){}
	public void Sit(){}
	public void Update(Observable ob) {}
	public void Disband(Animal puller, Panda pulled){
		System.out.println("Disband()");
		puller.SetPulled(null);
		puller=null;
		if (pulled!=null) {
			pulled.Disband();
		}
	}
}
