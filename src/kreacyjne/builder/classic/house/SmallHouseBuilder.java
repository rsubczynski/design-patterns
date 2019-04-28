package kreacyjne.builder.classic.house;

public class SmallHouseBuilder implements HouseBuilder {

    private House house;

    public SmallHouseBuilder(){
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("small walls");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("small floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("small rooms");

    }

    @Override
    public void buildRoof() {
        this.getHouse().setRoof("small roof");
    }

    @Override
    public void buildWindows() {
        this.getHouse().setWindows("small windows");
    }

    @Override
    public void buildDoors() {
        this.getHouse().setDoors("small doors");
    }

    @Override
    public void buildGarage() {
        this.getHouse().setGarage("small garage");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
