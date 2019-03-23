import java.util.ArrayList;
public abstract class Thing implements Steppable, Observable{

	public Tile GetTile(Tile tile) {
		System.out.println("GetTile()");
		return tile;
	}
}

