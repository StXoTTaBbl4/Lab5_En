package Program.Command.Commands;

import Program.Command.ICommand;
import Program.DataClasses.Worker;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Сортирует коллекцию в естественном порядке(по ID).
 */
public class SortCommand implements ICommand {

    @Override
    public LinkedList<Worker> handle(String args, LinkedList<Worker> WorkersData) {

        try {
            Collections.sort(WorkersData);
        }catch (NullPointerException e){
            System.out.println("Sorting error, checking the fields Coordinates, Person, Salary. They must not be null.");
        }


        return WorkersData;
    }

    @Override
    public String getName() {
        return "sort";
    }

    @Override
    public String getHelp() {
        return "Sorts the collection in natural order (by ID).";
    }
}
