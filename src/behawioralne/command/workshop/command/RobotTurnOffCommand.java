package behawioralne.command.workshop.command;

import behawioralne.command.workshop.Robot;

public class RobotTurnOffCommand implements Command {
    private Robot robot;

    public RobotTurnOffCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.turnOff();
    }
}
