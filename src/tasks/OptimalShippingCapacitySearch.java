package tasks;

import java.util.Scanner;

public class OptimalShippingCapacitySearch {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of packages: ");
        int numberOfPackages = sc.nextInt();
        int[] packageWeights = new int[numberOfPackages];

        int heaviestPackage = 0;
        int totalWeight = 0;
        System.out.println("Enter weights of packages:");
        for (int i = 0; i < numberOfPackages; i++) {
            packageWeights[i] = sc.nextInt();
            if (packageWeights[i] > heaviestPackage) {
                heaviestPackage = packageWeights[i];
            }
            totalWeight += packageWeights[i];
        }
        System.out.print("Allowed days = ");
        int allowedDays = sc.nextInt();
        int minimunPossibleCapacity = heaviestPackage;
        int maximumPossibleCapacity = totalWeight;
        int bestCapasity = totalWeight;

        while (minimunPossibleCapacity <= maximumPossibleCapacity) {
            int currentCapacity = minimunPossibleCapacity + (maximumPossibleCapacity - minimunPossibleCapacity) / 2;
            //mid between min and max
            if (canShipWithinDays(packageWeights, allowedDays, currentCapacity)) {
                bestCapasity  = currentCapacity;
                maximumPossibleCapacity = currentCapacity - 1;
            } else {
                minimunPossibleCapacity = currentCapacity + 1;
            }
        }
        System.out.println(bestCapasity);
    }
    public static boolean canShipWithinDays(int[] packageWeights, int allowedDays, int truckCapacity) {
        int usedDays = 1;
        int currentDayWeight = 0;
        for (int i = 0; i < packageWeights.length; i++) {
            if (currentDayWeight + packageWeights[i] <= truckCapacity) {
                currentDayWeight += packageWeights[i];
            } else {
                usedDays++;
                currentDayWeight = packageWeights[i];
            }
        }
        return usedDays <= allowedDays;
    }
}

