package behawioralne.command;

import behawioralne.command.workshop.Robot;
import behawioralne.command.workshop.WorkShopApp;
import behawioralne.command.workshop.command.RobotCutCommand;
import behawioralne.command.workshop.command.RobotTurnOffCommand;
import behawioralne.command.workshop.command.RobotDrillCommand;
import behawioralne.command.workshop.command.RobotTurnOnCommand;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();

        WorkShopApp workShopApp = new WorkShopApp();
        workShopApp.addToQueue(new RobotTurnOnCommand(robot));
        workShopApp.addToQueue(new RobotCutCommand(robot));
        workShopApp.addToQueue(new RobotDrillCommand(robot));
        workShopApp.addToQueue(new RobotTurnOffCommand(robot));

        workShopApp.run();
    }
}
