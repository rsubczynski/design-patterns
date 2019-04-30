package behawioralne.command.workshop;

import behawioralne.command.workshop.command.Command;

import java.util.ArrayList;
import java.util.List;

public class WorkShopApp {

    private List<Command> commandsQueue = new ArrayList<>();

    public void addToQueue(Command command) {
        commandsQueue.add(command);
    }

    public void run() {

        if (commandsQueue.isEmpty()) {
            System.out.println("command list is empty");
        }
        commandsQueue.forEach(Command::execute);
        commandsQueue.clear();
    }
}
