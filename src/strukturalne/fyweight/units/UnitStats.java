package strukturalne.fyweight.units;

public class UnitStats {

    private String name;
    private int hp;
    private int armor;
    private int damageDealt;
    private int speed;
    private int resourceCost;

    public UnitStats(String name, int hp, int armor, int damageDealt, int speed, int resourceCost) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.damageDealt = damageDealt;
        this.speed = speed;
        this.resourceCost = resourceCost;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getArmor() {
        return armor;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public int getSpeed() {
        return speed;
    }

    public int getResourceCost() {
        return resourceCost;
    }
}
