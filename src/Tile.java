import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//Tile osztály
public class Tile {

    public boolean AcceptPanda(Panda p, Animal animal, int steps, Game game, Animal puller, Panda pulled, ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas){return false;}
    public boolean AcceptOrangutan(Orangutan o, Animal animal, int steps,Game game,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas){return false;}
    public boolean AcceptOrangutan(Orangutan o, Tile entrance, Tile tile, Panda p1, Panda p2,Animal entranceAnimal, Tile panda1Tile, Tile panda2Tile, Game game,ArrayList<Orangutan> orangutans, ArrayList<Panda> pandas,ArrayList<Observable> observables, Timer timer){return false;}

    public boolean AcceptPanda(Panda p,Animal animal) {
        System.out.println("AcceptPanda(Panda p)");
        if (animal!=null) {
            animal.CollideWithPanda(p,null,null,null,null);
            return false;
        }
        return true;
    }
    public boolean AcceptOrangutan(Orangutan o, Animal animal) {
        System.out.println("AcceptOrangutan(Orangutan o)");
        if (animal!=null){
            animal.CollideWithOrangutan(o);
            return false;
        }
        return true;
    }
    public boolean AcceptOrangutan(Orangutan o, Panda animal, boolean isPulled) {
        System.out.println("AcceptOrangutan(Orangutan o)");
        if (animal!=null){
            if(!isPulled)animal.CollideWithOrangutan(o);
            animal.CollideWithOrangutan(o,new Orangutan(),new Tile(),new Tile(),null);
            return false;
        }
        return true;
    }
    public void RemoveAnimal() {
        System.out.println("RemoveAnimal()");

    }
    public void JumpedOn(Animal animal, int steps,Animal puller, Panda pulled, ArrayList<Orangutan> orangutans,ArrayList<Panda> pandas,Game game) {
        System.out.println("JumpedOn()");
    }
    public Tile GetNeighbor(int side, HashMap<Integer,Tile> neighbors) {
        System.out.println("GetNeighbor(int side)");
        return neighbors.get(side);
    }
    public int GetSides(int sides) {
        System.out.println("GetSides()");
        return sides;
    }
    public int CompareTile(Tile tile,HashMap<Integer,Tile> neighbors) {
        System.out.println("CompareTile(Tile t)");
        if (this.equals(tile)) return -1;

        //Find tile:
        for(Map.Entry<Integer,Tile> it : neighbors.entrySet()) {
            if(tile.equals( it.getValue() )) {
                return it.getKey();
            }
        }
        return 0;
    }
    public void SetAnimal (Animal a) {
        System.out.println("SetAnimal(Animal a)");
    }
    public Animal GetAnimal(Animal animal){
        System.out.println("GetAnimal()");
        return animal;
    }
}