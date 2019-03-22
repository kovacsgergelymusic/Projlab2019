public abstract class Animal {
	
	public void Fall() {
		System.out.println("Fall()");
		Destroy();
	}
	public void Destroy(Tile tile, Game game, Panda pulled){
		System.out.println("Destroy()");
		tile.RemoveAnimal();
		Game.getInstance().DeleteAnimal(this);
		if (pulled!=null) {
			Disband(pulled);
		}
	}
	public void Move(int side){
		//TODO
		System.out.println("Move(int side)");
	}
	public boolean CollideWithPanda(Panda p){
		System.out.println("CollideWithPanda(Panda p)");
		return false;
		}
	public boolean CollideWithOrangutan(Orangutan o){
		System.out.println("CollideWithOrangutan(Orangutan o)");
		return false;
		}
	public void Disband(Panda pulled, Panda p2){
		System.out.println("Disband()");
		pulled.Disband(p2);
	}
	public Tile GetTile(Tile tile){
		System.out.println("GetTile()");
		return tile;
		}
	public Panda GetPulled(Panda pulled){
		System.out.println("GetPulled()");
		return pulled;
		}
	public void SetPulled(Panda p){
		System.out.println("SetPulled(Panda p)");
		}
}
