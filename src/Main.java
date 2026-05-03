import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1 - Task1");
            System.out.println("2 - Task2");
            System.out.println("3 - Task3");
            System.out.println("4 - Task4");
            System.out.println("0 - Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    task1.run();
                    break;
                case 2:
                    task2.run();
                    break;
                case 3:
                    task3.run();
                    break;
                case 4:
                    task4.run();
                    break;
                default:
                    System.out.println("Wrong choice");}
        } while (choice != 0) ;
    }
}