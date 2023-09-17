package sem3;
// 7. Создать интерфейс «Заправочная станция», создать метод: заправка топливом.
// 9. Добавить в интерфейс «Заправочная станция» методы: протирка лобового стекла, протирка фар, протирка зеркал.
public interface IFuelStation {
    public void isRefillFuel();
    public void isRubbingGlass();
    public void isRubbingLights();
    public void isRubbingMirrors();
    public boolean isBuyFood(boolean buyFood);

}
