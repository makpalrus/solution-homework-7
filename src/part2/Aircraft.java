package part2;

public abstract class Aircraft {
    protected String id;
    protected int fuelLevel;
    private String msg;

    public Aircraft(String id, int fuel) {
        this.id = id;
        this.fuelLevel = fuel;
    }

    public abstract void receive(String msg);

    public void send(String msg, TowerMediator m) {
        m.broadcast(msg, this);
    }

    public boolean isEmergency() {
        return fuelLevel < 10 || msg.equals("MAYDAY");
    }
}