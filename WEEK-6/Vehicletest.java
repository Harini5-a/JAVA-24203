public class Vehicletest {
    public static void main(String[]args) {
        System.out.println("Kasi Harini");
        Vehicle v = new  Vehicle("Audi", "White", "Petrol");
        v.displayinfo();
        Car c = new Car("Benz", "Black", "Diesel");
        c.displayinfo();
    }
}
