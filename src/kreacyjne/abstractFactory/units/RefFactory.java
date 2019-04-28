package kreacyjne.abstractFactory.units;

public class RefFactory extends Factory {

    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType) {
            case RIFLEMAN:
                return new Rifleman(25, 0, 5);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }

    @Override
    public MechanizeUnit createMechanizeUnit(UnitType unitType) {
        switch (unitType) {
            case TANK:
                return new Tank(100, 0, 25);
            default:
                throw new UnsupportedOperationException("No such type");
        }
    }
}
