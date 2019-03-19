
public abstract class Animal {
	private Animal pulled;
	private Tile tile;
	
	public void Fall() {}
	public void Destroy(){}
	public void Move(int side){}
	public boolean CollideWithPanda(Panda p){return true;}
	public boolean CollideWithOrangutan(Orangutan o){return true;}
	public void Disband(){}
	public Tile GetTile(){return tile;}
	public Animal GetPulled(){return pulled;}
	public void SetPulled(Animal a){pulled=a;}
	
}
