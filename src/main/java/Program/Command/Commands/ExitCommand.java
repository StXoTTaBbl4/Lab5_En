package Program.Command.Commands;

import Program.Command.ICommand;
import Program.DataClasses.Worker;

import java.util.LinkedList;

/**
 * Завершает программу (без сохранения в файл).
 */
public class ExitCommand implements ICommand {
    @Override
    public LinkedList<Worker> handle(String args, LinkedList<Worker> WorkersData) {
        System.exit(0);
        return WorkersData;
    }

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public String getHelp() {
        return "Terminates the program (without saving to a file).";
    }
}
