import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Random;
//Panda osztály, az Animal leszármazottja
public class Panda  extends Animal implements Observer, Steppable {
	//A panda leesik
	public void Fall(Tile tile, Game game,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,ArrayList<Observable> observables,Timer timer) {
		System.out.println("Fall()");
		this.Destroy(tile,game,puller, pulled, orangutans,pandas,observables,timer);
	}
	//Az panda egy adott szomszédos csempe felé mozog
	public void Move(int side, Tile tile, Panda pulled, HashMap<Integer,Tile> neighbors, Animal onTile, Tile pulledTile) {
		System.out.println("Move(int side)");
		Tile nextTile=tile.GetNeighbor(side, neighbors);
		if (nextTile.AcceptPanda(this,onTile)) {
			tile.RemoveAnimal();
			nextTile.SetAnimal(this);
			if (pulled!=null) {
				Tile next_Tile2=pulled.GetTile(pulledTile);
				int a=tile.CompareTile(next_Tile2, neighbors);
				pulled.Move(a);
			}
		}
	}
	//Az panda egy ütközik egy másik pandával
	public boolean CollideWithPanda(Panda p){
		System.out.println("CollideWithPanda(Panda p)");
		return false;
	}
	//A panda ütközik egy orángutánnal
	public boolean CollideWithOrangutan(Orangutan o, Animal puller,Tile tile, Tile oran_tile, Panda lead_panda){
		System.out.println("CollideWithOrangutan(Orangutan o)");
		if (puller==null){
			CaughtbyOrangutan(o,tile,oran_tile,lead_panda); //Ha a pandát nem húzzák, az orángután elkapja
			return true;
			}
		return false;
	}
	//A panda ütközik egy orángutánnal
	public  void CaughtbyOrangutan(Orangutan o, Tile tile, Tile oran_tile, Panda lead_panda){
		System.out.println("CaughtbyOrangutan(Orangutan o)");
		oran_tile = o.GetTile(oran_tile);
                Panda lead = o.GetPulled(lead_panda);
                o.SetPulled(this);
                if (lead != null)
                        lead.SetPuller(this);
                o.SetTile(tile);
                this.SetTile(oran_tile);
	}
	//A panda kikerül a játékból
	public void Destroy(Tile tile, Game game,Animal puller, Panda pulled,  ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,ArrayList<Observable> observables,Timer timer){
		System.out.println("Destroy()");
		tile.RemoveAnimal();
		for (Observable o:observables){
			o.Detach(this);
			Game.getInstance().GetTimer(timer).RemoveSteppable(this);
		}
		Game.getInstance().DeleteAnimal(this, orangutans,pandas);
		if (pulled!=null) {
			Disband(puller, pulled);
		}
	}
	//Idoben leptetes, véletlenszeru kószálás
	public void Step(Animal animal,int random,ArrayList<Observer> observers,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,int steps,Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,boolean tired) {
		System.out.println("Step()");
		this.Move(random);

	}
	//A panda megijed, leszármazottak felülírják
	public void GetScared(){}
	//A panda ugrik, leszármazottak felülírják
	public void Jump(Tile tile,int steps,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,Game game){}
	//A panda leül, leszármazottak felülírják
	public void Sit(){}
	//A panda reagál értesítésre, leszármazottak felülírják
	public void Update(Animal animal,Observable ob,Tile t, HashMap<Integer, Tile> neighbors,Animal puller, Panda pulled,ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,int steps, Game game,boolean tired) {}
	//A panda sora felbomlik
	public void Disband(Animal puller, Panda pulled, Panda pulled2){
		System.out.println("Disband()");
		if(puller!=null)puller.SetPulled(null);
		puller=null;
		if (pulled!=null) {
			pulled.Disband(this, pulled2);
		}
	}
	//A panda sora felbomlik
	public void Disband(Animal puller, Panda pulled){
		System.out.println("Disband()");
		puller.SetPulled(null);
		puller=null;
		if (pulled!=null) {
			pulled.Disband(this, null);
		}
	}
	public Animal GetPuller(Animal puller){
		System.out.println("GetPuller()");
		return puller;
	}
	public void SetPuller(Animal a){
		System.out.println("SetPuller(Animal a)");
		
	}

}
