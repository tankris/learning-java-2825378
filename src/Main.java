import java.util.Scanner;

public class Main {
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer team time...");
        System.out.println("Type in random word and press Enter to start developer tea time");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println();

        System.out.println("It's developer tea time!");
    }

    public static void main(String[] args) {
        announceDeveloperTeaTime();
    }

}
