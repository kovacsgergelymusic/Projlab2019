public abstract class Thing implements Steppable, Observable{
	private Tile tile;
	private ArrayList<Observer> observers;
}

