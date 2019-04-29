package behawioralne.templateMethod;

public class ButtonCarStrategyStart extends CarStartingSequence {

    @Override
    protected void setTheGear() {
        System.out.println("Wybieramy bieg");
    }

    @Override
    protected void statTheIngitation() {
        System.out.println("Wcisnij guzik");
    }
}
