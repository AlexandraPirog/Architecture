package sem3;
//Создать конкретный автомобиль путём наследования класса «Car».
//Расширить абстрактный класс «Car», добавить метод: подметать улицу.
// Создать конкретный автомобиль путём наследования класса «Car». Провести проверку принципа SRP.
// Расширить абстрактный класс «Car», добавить метод: включение противотуманных фар, перевозка груза.
// Провести проверку принципа OCP.
//Создать конкретный автомобиль путём наследования класса «Car», определить число колёс = 3.
// Провести проверку принципа LSP.

public class Toyota extends Car{
    public Toyota(String model, String color, String exterier, String fuel_type, String transmission, int num_wheels, double vol_eng) {
        super("Toyota", model, color, exterier, fuel_type, transmission, num_wheels, vol_eng);
    }

    @Override
    public boolean isSweepingStreet(boolean isSweeping) {
        return super.isSweepingStreet(true);

    }
    public boolean is_vecsicole =true;
    public boolean isLight_on(boolean is_light) {
        is_light =true;
        return is_light;
    }

    @Override
    public void isRefillFuel() {
        System.out.println("Toyota" + model + "заправился топливом" + fuel_type);
    }

    @Override
    public void isRubbingGlass() {
        super.isRubbingGlass();
    }

    @Override
    public void isRubbingLights() {
        super.isRubbingLights();
    }

    @Override
    public void isRubbingMirrors() {
        super.isRubbingMirrors();
    }

    @Override
    public boolean isBuyFood(boolean buyFood) {
        return super.isBuyFood(true);
    }
}
