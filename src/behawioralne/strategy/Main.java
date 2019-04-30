package behawioralne.strategy;

import behawioralne.strategy.chef.Chef;
import behawioralne.strategy.chef.egg_cooker.HardBoiledEggCooker;
import behawioralne.strategy.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {

    public static void main(String[] args) {
        Chef chef = new Chef("Radek");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();

        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();
    }
}
