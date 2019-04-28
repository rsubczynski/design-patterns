package kreacyjne.builder.classic.house;

public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse(){
        houseBuilder.buildWalls();
        houseBuilder.buildGarage();
        houseBuilder.buildDoors();
        houseBuilder.buildRoof();
        houseBuilder.buildRooms();
        houseBuilder.buildWindows();
        houseBuilder.buildFloors();
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }
}
