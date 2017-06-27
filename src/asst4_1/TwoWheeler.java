//Write a program to demonstrate the use of method overloading and method overriding.
package asst4_1;

//Conditions for Method Overriding are shown below:
// Static methods cannot be overridden, it can be hidden.
// Methods of both parent and child class must have the same name.
// Methods must have the same argument list and return type.
// If a method cannot be inherited, it cannot be overridden

//The child class TwoWheeler extends vehicle class

public class TwoWheeler extends Vehicle {

	//This method is overriding the method type of parent class
	    public void vehicleMethod() {
        System.out.println("Method" + " in TwoWheeler.");
    }

    public static void main(String[] args) {
        TwoWheeler myBike = new TwoWheeler();
        Vehicle myVehicle = new Vehicle();

        myVehicle.vehicleMethod();
        myBike.vehicleMethod();
    }
}

