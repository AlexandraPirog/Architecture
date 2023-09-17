package sem3;
//Спроектировать абстрактный класс «Car» у которого должны быть свойства: марка, модель, цвет,
// тип кузова, число колёс, тип топлива, тип коробки передач, объём двигателя;
// методы: движение, обслуживание, переключение передач, включение фар, включение дворников.
// 8. Имплементировать метод интерфейса «Заправочная станция» в конкретный класс «Car».
// 10. Имплементировать все методы интерфейса «Заправочная станция» в конкретный класс «Car». Провести проверку принципа ISP.
// Создать дополнительный/е интерфейсы и имплементировать их в конкретный класс «Car». Провести проверку принципа ISP.
// 11. Создать путём наследования класса «Car» два автомобиля: с бензиновым и дизельным двигателями,
// имплементировать метод «Заправка топливом» интерфейса «Заправочная станция».
// Реализовать заправку каждого автомобиля подходящим топливом. Провести проверку принципа DIP.
public class Car implements ICar, IFuelStation {
    protected String mark, model, color, exterier, fuel_type, transmission;
    protected int num_wheels;
    protected double vol_eng;
    private boolean light_on;

    public Car(String mark, String model, String color, String exterier, String fuel_type, String transmission, int num_wheels, double vol_eng) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.exterier = exterier;
        this.fuel_type = fuel_type;
        this.transmission = transmission;
        this.num_wheels = num_wheels;
        this.vol_eng = vol_eng;
    }

    protected String movement() {
        return "";
    }
    private String service() {
        return "";
    }
    public void changeControl(String control_mode){

    }

//    public void isLight_on(boolean is_light) {
//    }

    @Override
    public boolean isLight_on(boolean is_light) {
        return true;
    }

    @Override
    public boolean isSweepingStreet(boolean isSweeping) {
        return false;
    }

    @Override
    public void isRefillFuel() {

    }

    @Override
    public void isRubbingGlass() {
        System.out.println("Протирка стекла");
    }

    @Override
    public void isRubbingLights() {
        System.out.println("Протирка фар");
    }

    @Override
    public void isRubbingMirrors() {
        System.out.println(" Протирка зеркал");

    }

    @Override
    public boolean isBuyFood(boolean buyFood) {
        return false;
    }
}
