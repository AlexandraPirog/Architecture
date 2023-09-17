package sem3;

public class Nissan extends Car{
    public Nissan(String model, String color, String exterier, String fuel_type, String transmission, int num_wheels, double vol_eng) {
        super("Nissan", model, color, exterier, fuel_type, transmission, num_wheels, vol_eng);
    }

    @Override
    public void isRefillFuel() {
        System.out.println("Nissan" + model + "заправился топливом" + fuel_type);
    }
}
