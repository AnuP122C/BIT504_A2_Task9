import java.util.List;
import java.util.Scanner;

public final class CelebrityManagementApp {
    private CelebrityManagementApp() {
    }

    public static void main(String[] args) {
        CelebrityManager manager = new CelebrityManager();
        try (Scanner input = new Scanner(System.in)) {
            boolean running = true;
            while (running) {
                printMenu();
                if (!input.hasNextLine()) {
                    break;
                }

                switch (input.nextLine().trim()) {
                    case "1":
                        listCelebrities(manager);
                        break;
                    case "2":
                        running = addCelebrity(input, manager);
                        break;
                    case "3":
                        running = searchCelebrities(input, manager);
                        break;
                    case "0":
                        running = false;
                        break;
                    default:
                        System.out.println("Choose 1, 2, 3, or 0.");
                }
            }
        }
        System.out.println("Goodbye.");
    }

    private static void printMenu() {
        System.out.println("\nCelebrity Management");
        System.out.println("1. List celebrities");
        System.out.println("2. Add celebrity");
        System.out.println("3. Search by name");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    private static void listCelebrities(CelebrityManager manager) {
        if (manager.getCelebrities().isEmpty()) {
            System.out.println("No celebrities have been added.");
            return;
        }
        manager.getCelebrities().forEach(System.out::println);
    }
