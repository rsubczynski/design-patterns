package strukturalne.decorator;

public class ForestDecorator extends TerrainDecorator {

    public ForestDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int getFuelCost() {
        return super.getFuelCost() +5;
    }

}
