import java.util.Scanner;

public class UserInterface {
    private TodoList tasks;
    private Scanner scanner;

    public UserInterface(TodoList tasks, Scanner scanner) {
        this.tasks = tasks;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                this.tasks.add(task);
            }

            if (command.equals("list")) {
                this.tasks.print();
            }

            if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int number = Integer.valueOf(scanner.nextLine());
                this.tasks.remove(number);
            }

            if (command.equals("stop")) {
                break;
            }
        }
    }

}
