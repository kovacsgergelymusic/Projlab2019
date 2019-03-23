
public class Wardrobe extends Tile { //TODO
	
	public boolean AcceptPanda(Panda p, Wardrobe tile) {
		System.out.println("AcceptPanda(Panda p)");
		return true;}
	public boolean AcceptOrangutan(Orangutan o, Wardrobe tile) {
		System.out.println("AcceptOrangutan(Orangutan o)");
		return true;}
	@Override
	public void SetAnimal (Animal a,boolean start, Wardrobe tile) {
		System.out.println("SetAnimal(Animal a)");
		
}
}
