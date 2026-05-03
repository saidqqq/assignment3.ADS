import tasks.AnagramSortChecker;
import tasks.KthSmallestElementSearch;
import tasks.MedianOfElements;
import tasks.OptimalShippingCapacitySearch;

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
                    AnagramSortChecker.run();
                    break;
                case 2:
                    KthSmallestElementSearch.run();
                    break;
                case 3:
                    MedianOfElements.run();
                    break;
                case 4:
                    OptimalShippingCapacitySearch.run();
                    break;
                default:
                    System.out.println("Wrong choice");}
        } while (choice != 0) ;
    }
}