public abstract class Animal {
	protected Panda pulled;
	protected Tile tile;
	
	public void Fall() {
		Destroy();
	}
	public void Destroy(){
		tile.RemoveAnimal(this);
		Game.getInstance().DeleteAnimal(this);
		if (pulled!=null) {
			Disband();
		}
	}
	public void Move(int side){}
	public boolean CollideWithPanda(Panda p){return true;}
	public boolean CollideWithOrangutan(Orangutan o){return true;}
	public void Disband(){
		pulled.Disband();
	}
	public Tile GetTile(){
		return tile;
		}
	public Animal GetPulled(){
		return pulled;
		}
	public void SetPulled(Panda p){
		pulled=p;
		}
	
}
