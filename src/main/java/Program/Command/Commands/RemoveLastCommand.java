package Program.Command.Commands;

import Program.Command.ICommand;
import Program.DataClasses.Worker;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Удаляет последний элемент из коллекции.
 */
public class RemoveLastCommand implements ICommand {
    @Override
    public LinkedList<Worker> handle(String args, LinkedList<Worker> WorkersData) {

        try {
            WorkersData.removeLast();
        }catch (NoSuchElementException e){
            System.out.println("Коллекция пуста.");
        }

        return WorkersData;
    }

    @Override
    public String getName() {
        return "remove_last";
    }

    @Override
    public String getHelp() {
        return "Removes the last element from the collection.";
    }
}
