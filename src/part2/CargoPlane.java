package part2;

public class CargoPlane extends Aircraft {
    public CargoPlane(String id, int fuel) {
        super(id, fuel);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Cargo Plane " + id + " received: " + msg);
    }
}
