public class Orangutan extends Animal {
	
	public void Addpoint() {
		System.out.println("Addpoint()");
		}
	public void Move(int side, Tile tile, Panda pulled) {
		System.out.println("Move(int side)");
		t2=tile.GetNeighbor(side);
		if (t2.AcceptOrangutan(this)) {	
			tile.RemoveAnimal(this);
			t2.SetAnimal(this);
			if (pulled!=null) {
				Tile t3=pulled.GetTile();
				int a=tile.CompareTile(t3);
				pulled.Move(a);
			}
		}
	}
	public boolean CollideWithPanda(Panda p, Panda pulled){
		System.out.println("CollideWithPanda(Panda p)");
		if(p.GetPulled(pulled) != null)		
			p.CaughtbyOrangutan(this);
		return false;
	}
	public boolean CollideWithOrangutan(Orangutan o){
		System.out.println("CollideWithOrangutan(Orangutan o)");
		return false;
	}
}
