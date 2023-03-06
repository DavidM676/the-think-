public class VehicleRunner
{
    public static void main(String[] args)
    {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn(90);
        myVehicle.brake(0.25);

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(-90); // inherited method
        myCar.brake(0.50); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR TEST CODE BELOW! ----
        // testing all available methods on a Bicycle object
        Bicycle myBike = new Bicycle("Unicycle", 1, 7);
        System.out.println(myBike.getName()); // inherited method
        System.out.println(myBike.getWheels()); // inherited method
        System.out.println(myBike.getGearCount()); // method ONLY available on Bike objects
        myBike.move(37); // inherited method
        myBike.turn(180); // inherited method
        myBike.brake(0.3); // inherited method
        myBike.ringBell(); // method ONLY available on Bike objects

        // testing Train method
        Train myTrain = new Train("R142 4 Train", 16, "800 V Third Rail Electric", 1000);
        System.out.println(myTrain.getName()); // inherited method
        System.out.println(myTrain.getWheels()); // inherited method
        System.out.println(myTrain.getPropulsion()); // method ONLY available on Train objects
        System.out.println(myTrain.getCapacity()); // method ONLY available on Train objects
        myTrain.move(125); // inherited method
        myTrain.turn(0); // inherited method
        myTrain.brake(.9); // inherited method
        myTrain.honk(); // method ONLY available on Train objects
        myTrain.announcement("14th Street - Union Square", new String[] {"6", "L", "N", "Q", "R", "W"}); // method ONLY available on Train objects
    }
}

