package Program.Command.Commands;

import Program.Command.ICommand;
import Program.DataClasses.Worker;

import java.util.LinkedList;

/**
 * Очищает коллекцию.
 */
public class ClearCommand implements ICommand {
    @Override
    public LinkedList<Worker> handle(String args, LinkedList<Worker> WorkersData) {


        return new LinkedList<>();
    }

    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String getHelp() {
        return "Clears the collection.";
    }
}
