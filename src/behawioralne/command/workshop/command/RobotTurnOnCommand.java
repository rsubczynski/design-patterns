package behawioralne.command.workshop.command;

import behawioralne.command.workshop.Robot;

public class RobotTurnOnCommand implements Command{

    private Robot robot;

    public RobotTurnOnCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOn();
    }
}
