
public class Exit extends Tile{//TODO
	
	public boolean AcceptPanda(Panda p, Tile tile) {
		System.out.println("AcceptPanda(p)");
		tile.RemoveAnimal();
		p.Destroy();
		return false;
	}
	public boolean AcceptOrangutan(Orangutan o, Tile entrance, Tile tile, Panda p1, Panda p2, int testcase) {
		System.out.println("AcceptOrangutan o)");
		tile.RemoveAnimal();
		entrance.SetAnimal(o);
		Panda temp1 = o.GetPulled(p1);
		Panda temp2;
		Panda temp3;
		//while cikklus helyett
		if (testcase > 1){
			if (temp != null){
				o.AddPoint(1);
			}
			if (testcase ==3){
				temp2 = temp.GetPulled(p2);
				temp1.Destroy();
				if (temp2 != null) o.AddPoint(1);
				temp2.Destroy();
				temp3 = o.GetPulled(null);
				temp3.Destroy();
			}
		}
		return false;
	}
}
