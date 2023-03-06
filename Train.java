public class Train extends Vehicle {
    private String propulsion;
    private int capacity;

    public Train(String name, int wheels, String propulsion, int capacity) {
        super(name, wheels);
        this.propulsion = propulsion;
        this.capacity = capacity;
    }

    public String getPropulsion() {
        return propulsion;
    }

    public int getCapacity() {
        return capacity;
    }

    public void turn(int degreesToTurn) {
        System.out.println("I can't turn!");
    }

    public void honk() {
        System.out.println("HOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOONK!!!!!");
    }

    public void announcement(String station, String[] transfers) {
        System.out.print("This is: " + station + ".");
        if (transfers.length > 0) {
            System.out.print(" Transfer is available to the ");
            for (int i = 0; i < transfers.length - 1; i++) {
                System.out.print(transfers[i] + ", ");
            }
            System.out.print("and " + transfers[transfers.length - 1] + " trains.");
        }
        System.out.println();
    }
}
