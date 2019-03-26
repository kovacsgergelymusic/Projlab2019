import java.util.ArrayList;
//Thing osztály
public abstract class Thing implements Steppable, Observable{
	public Tile GetTile(Tile tile) {
		System.out.println("GetTile()");
		return tile;
	}
}

