package Program.Command.Commands;

import Program.Command.ICommand;
import Program.DataClasses.Worker;

import java.util.LinkedList;

/**
 * Удаляет элемент из коллекции по его id.
 */
public class RemoveIdCommand implements ICommand {
    @Override
    public LinkedList<Worker> handle(String args, LinkedList<Worker> WorkersData) {
        int id;

        try {
            id = Integer.parseInt(args);
        } catch (NumberFormatException e) {
            System.out.println("ID must be a positive integer greater than 0.");
            return WorkersData;
        }

        for(Worker worker : WorkersData){
            if(worker.getId() == id){
                WorkersData.remove(worker);
                return WorkersData;
            }
        }

        System.out.println("There is no worker with this id.");

        return WorkersData;
    }

    @Override
    public String getName() {
        return "remove_by_id";
    }

    @Override
    public String getHelp() {
        return "Removes an element with a specific id.";
    }
}
