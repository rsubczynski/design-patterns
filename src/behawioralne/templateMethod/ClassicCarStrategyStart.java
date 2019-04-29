package behawioralne.templateMethod;

public class ClassicCarStrategyStart extends CarStartingSequence {

    @Override
    protected void setTheGear() {
        System.out.println("Wybieramy bieg");
    }

    @Override
    protected void statTheIngitation() {
        System.out.println("Przekrecamy kluczyk");
    }

}
