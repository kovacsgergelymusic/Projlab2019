import java.util.ArrayList;
//Animal oszt�ly, Panda, Orangutan ose
public abstract class Animal {	
	//Allat leesik
	public void Fall(Tile tile, Game game,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas) {	
		System.out.println("Fall()");
		this.Destroy(tile,game,puller, pulled, orangutans,pandas);
	}
	//Allat kikerul a jatekbol
	public void Destroy(Tile tile, Game game,Animal puller, Panda pulled,  ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas){
		System.out.println("Destroy()");
		tile.RemoveAnimal();
		Game.getInstance().DeleteAnimal(this, orangutans,pandas);
		if (pulled!=null) {
			Disband(puller, pulled);
		}
	}
	//Mozg�s, aloszt�lyok implement�lj�k
	public void Move(int side){
	}
	//Utkozes pand�val, lesz�rmazottak fel�l�rj�k
	public boolean CollideWithPanda(Panda p, Panda pulled,Tile tile, Tile oran_tile, Panda lead_panda){
		System.out.println("CollideWithPanda(Panda p)");
		return false;
		}
	//Utkozes or�ngut�nnal lesz�rmazottak fel�l�rj�k
	public boolean CollideWithOrangutan(Orangutan o){
		System.out.println("CollideWithOrangutan(Orangutan o)");
		return false;
		}
	//Utkozes or�ngut�nnal lesz�rmazottak fel�l�rj�k
	public boolean CollideWithOrangutan(Orangutan o, Animal puller,Tile tile, Tile oran_tile, Panda lead_panda){return false;}
	//Sor felbont�s, csak a Panda �rja fel�l
	public void Disband(Animal puller, Panda pulled){
		System.out.println("Disband()");
		if(puller !=null)puller.SetPulled(null);
		if (pulled==null)return;
		pulled.Disband(this,null);
	}
	public Tile GetTile(Tile tile){
		System.out.println("GetTile()");
		return tile;
		}

	public void SetTile(Tile tile){
		System.out.println("SetTile(Tile tile)");
	}
	public Panda GetPulled(Panda pulled){
		System.out.println("GetPulled()");
		return pulled;
		}
	public void SetPulled(Panda p){
		System.out.println("SetPulled(Panda p)");
		}
}
