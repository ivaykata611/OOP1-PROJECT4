import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandLineInterface {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.print("> ");
            String input = scanner.nextLine();

            List<String> inputList= List.of(input.split(" "));
            String command=inputList.get(0);
            List<String> arguments=inputList.subList(1,inputList.size());
            switch (command.toLowerCase()) {
                case "save":

                    break;
                case "open":

                    break;
                case "close":

                    break;
                case "exit":

                    isRunning = false;
                    break;
                case "help":
                    System.out.println("Available commands:");
                    System.out.println("  save    - save the file");
                    System.out.println("  open    - open a file");
                    System.out.println("  close   - close the current file");
                    System.out.println("  exit    - exit the program");
                    System.out.println("  help    - display this help message");
                    System.out.println("  saveas  - save the file with a new name");
                    break;
                case "saveas":

                    break;
                case "list":
                    break;
                case "print":
                    break;
                case "empty":
                    break;
                case "deterministic":
                    break;
                case "recognize":
                    break;
                case "union":
                    break;
                case "concat":
                    break;
                case "un":
                    break;
                case "reg":
                    break;

                        default:
                    System.out.println("Invalid input. Type 'help' for a list of commands.");


            }
        }
    }
}
