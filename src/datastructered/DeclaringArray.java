package datastructered;

public class DeclaringArray { // another way of declaring Array
    public static void main(String[] args) {
        String [] vehicle = new String[5];
        vehicle[0]= "Bus";
        vehicle[1]= "Train";
        vehicle[2]= "Plane";
        vehicle[3]= "Boat";
        System.out.println(vehicle.length);
        System.out.println(vehicle[4]);// empty variable print as NULL
        // to copy from another array
        String [] myVehicle = vehicle.clone();
        System.out.println(myVehicle.length);


    }
}
