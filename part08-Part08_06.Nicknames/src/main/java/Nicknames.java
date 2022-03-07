
import java.util.HashMap;
import java.util.Scanner;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String> nickname = new HashMap<>();

        while (true) {
            System.out.println("Command");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                System.out.println("Name and Nickname: ");
                String name = scanner.nextLine();

                String[] parts = name.split(" ");
                String[] nameOnly = parts[0].split("'s");
                nickname.put(nameOnly[0], parts[3]);
            }

            if (command.equals("get")) {
                System.out.println("Who's nickname?");
                String nicknameSearch = scanner.nextLine();
                System.out.println(nickname.get(nicknameSearch));
            }

            if (command.equals("print")) {
                System.out.println(nickname);
            }

            if (command.equals("end")) {
                break;
            }
        }
    }
}
