//Wardrobe osztály, a Tile leszármazottja
public class Wardrobe extends Tile {
	//Panda ide akar lépni
	public boolean AcceptPanda(Panda p, Wardrobe tile) {
		System.out.println("AcceptPanda(Panda p)");
		return true;}
	//Orángután ide akar lépni
	public boolean AcceptOrangutan(Orangutan o, Wardrobe tile) {
		System.out.println("AcceptOrangutan(Orangutan o)");
		return true;}
	public void SetAnimal (Animal a,boolean start, Wardrobe tile) {
		System.out.println("SetAnimal(Animal a)");	
	}
}
