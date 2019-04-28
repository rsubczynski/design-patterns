package kreacyjne.abstractFactory.units;

public abstract class Factory {

    public abstract InfantryUnit createInfantryUnit(UnitType unitType);
    public abstract MechanizeUnit createMechanizeUnit(UnitType unitType);

}
