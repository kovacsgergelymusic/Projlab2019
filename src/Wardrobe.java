//Wardrobe oszt�ly, a Tile lesz�rmazottja
public class Wardrobe extends Tile {
	//Panda ide akar l�pni
	public boolean AcceptPanda(Panda p, Wardrobe tile) {
		System.out.println("AcceptPanda(Panda p)");
		return true;}
	//Or�ngut�n ide akar l�pni
	public boolean AcceptOrangutan(Orangutan o, Wardrobe tile) {
		System.out.println("AcceptOrangutan(Orangutan o)");
		return true;}
	public void SetAnimal (Animal a,boolean start, Wardrobe tile) {
		System.out.println("SetAnimal(Animal a)");	
	}
}
