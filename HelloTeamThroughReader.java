import java.util.Scanner;

public class HelloTeamThroughReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String newWorld = scanner.nextLine();
        System.out.println("Hello"+ newWorld);
    }
}
