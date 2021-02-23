//package duke;

import java.util.ArrayList;

/**
 * Class containing methods for printing different messages
 * according to the situation.
 */
public class Ui {
    /**
     * Prints welcome message.
     */
    static void printWelcome() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println(logo);
        System.out.println("Hello! I'm Duke! \n"
                + "What would you like to do today? \n"
                + "***********************************");
    }

    /**
     * Returns farewell message upon exit.
     */
    static String byeString() {
        return ("Bye! Stay on task!");
    }

    /**
     * Returns String accompanying a "done" command.
     * @param task Task that has been marked as done.
     */
    static String doneString(Task task) {
        return ("Good job! I've marked this task as done:\n    " + task + "\n");
    }

    /**
     * Prints text accompanying a "delete" command.
     * @param task Task that has been deleted.
     * @param size Size of remaining taskList.
     */
    static String deleteString(Task task, int size) {
        return ("Alright, I've deleted this task:\n    "
                + task
                + "\nNow you have "  + size + " task(s) in the list.\n");
    }

    /**
     * Prints text accompanying "add" command.
     * @param task Task that has been added.
     * @param size Size of new taskList.
     */
    static String addString(Task task, int size) {
        return ("Alright! I've added this task: \n   "
                + task
                + "\nNow you have " + size + " task(s) in the list. \n");
    }

    /**
     * Prints error message for IndexOutOfBoundsExceptions
     */
    static String indexErrorString() {
        return ("Oh no! This task does not exist. D:\n");
    }

    /**
     * Prints error message when date is typed in the wrong format.
     */
    static String dateFormatErrorString() {
        return ("Oh no! Please key in the date in the format YYYY-MM-DD.\n");
    }
    static String findString(ArrayList<Task> tasks) {
        return "Here are the matching tasks in your list:\n"
                + TaskList.tabbedListString(tasks) +
                "Found " + tasks.size() + " result(s).\n";
    }
}
