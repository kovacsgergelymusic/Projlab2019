import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
//Orangutan oszt�ly, az Animal lesz�rmazottja
public class Orangutan extends Animal {
	//Egy pontot ad az or�ngut�n pontjaihoz
	public void Addpoint() {
		System.out.println("Addpoint()");
		}
	//Az or�ngut�n egy adott szomsz�dos csempe fel� mozog
	public void Move(int side, Tile tile, Panda pulled, HashMap<Integer,Tile> neighbors, Animal onTile, Tile pulledTile) {
		System.out.println("Move(int side)");
		Tile nextTile=tile.GetNeighbor(side, neighbors);
		if (nextTile.AcceptOrangutan(this,onTile)) {
			tile.RemoveAnimal();
			nextTile.SetAnimal(this);
			if (pulled!=null) {
				Tile next_Tile2=pulled.GetTile(pulledTile);
				int a=tile.CompareTile(next_Tile2,neighbors);
				pulled.Move(a);
			}
		}
	}
	//Az or�ngut�n egy adott szomsz�dos csempe fel� mozog
	public void Move(int side, Tile tile, Panda pulled, HashMap<Integer,Tile> neighbors, Panda onTile, Tile pulledTile,boolean isPulled) {
		System.out.println("Move(int side)");
		Tile nextTile=tile.GetNeighbor(side, neighbors);
		if (nextTile.AcceptOrangutan(this,onTile,isPulled)) {
			tile.RemoveAnimal();
			nextTile.SetAnimal(this);
			if (pulled!=null) {
				Tile next_Tile2=pulled.GetTile(pulledTile);
				int a=tile.CompareTile(next_Tile2,neighbors);
				pulled.Move(a);
			}
		}
	}
	//Az or�ngut�n egy adott szomsz�dos csempe fel� mozog
	public void Move(int side, Tile tile, Panda pulled, HashMap<Integer,Tile> neighbors, Animal onTile, Tile pulledTile, int steps, Game game, Animal puller, ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas) {
		System.out.println("Move(int side)");
		Tile nextTile=tile.GetNeighbor(side, neighbors);
		if (nextTile.AcceptOrangutan(this,onTile,steps,game,puller,pulled,orangutans,pandas)) {
			tile.RemoveAnimal();
			nextTile.SetAnimal(this);
			if (pulled!=null) {
				Tile next_Tile2=pulled.GetTile(pulledTile);
				int a=tile.CompareTile(next_Tile2,neighbors);
				pulled.Move(a);
			}
		}
	}
	//Az or�ngut�n egy adott szomsz�dos csempe fel� mozog
	public void Move(int side, Tile tile, HashMap<Integer,Tile> neighbors,Tile entrance, Panda p1,Panda p2, Animal entranceAnimal,Tile panda1Tile,Tile panda2Tile,  Game game, ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,ArrayList<Observable> observables, Timer timer) {
		System.out.println("Move(int side)");
		Tile nextTile=tile.GetNeighbor(side, neighbors);
		nextTile.AcceptOrangutan(this,entrance,tile,p1,p2,entranceAnimal,panda1Tile,panda2Tile,game,orangutans,pandas,observables,timer);
	}
	//Az or�ngut�n �tk�zik egy pand�val
	public boolean CollideWithPanda(Panda p, Panda pulled,Tile tile, Tile oran_tile, Panda lead_panda){
		System.out.println("CollideWithPanda(Panda p)");
			p.CaughtbyOrangutan(this,tile,oran_tile,lead_panda); //Az or�ngut�n elkapja a pand�t
		return false;
	}
	//Az or�ngut�n �tk�zik egy m�sik or�ngut�nnal
	@Override
	public boolean CollideWithOrangutan(Orangutan o, Animal puller,Tile tile, Tile oran_tile, Panda lead_panda){
		System.out.println("CollideWithOrangutan(Orangutan o)");
		return false;
	}
}
