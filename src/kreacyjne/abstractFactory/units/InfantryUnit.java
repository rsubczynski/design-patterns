package kreacyjne.abstractFactory.units;

public abstract class InfantryUnit {

    private int hp;
    private int exp;
    private int dmgDome;

    protected InfantryUnit(int hp, int exp, int dmgDome) {
        this.hp = hp;
        this.exp = exp;
        this.dmgDome = dmgDome;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmgDome() {
        return dmgDome;
    }
}
