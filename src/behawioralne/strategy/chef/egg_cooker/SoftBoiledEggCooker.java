package behawioralne.strategy.chef.egg_cooker;

public class SoftBoiledEggCooker implements EggCooker {
    @Override
    public void cookEgg() {
        System.out.println("Gotuję jajka na miękko");
    }
}
