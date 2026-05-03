package tasks;

import java.util.Scanner;

public class AnagramSortChecker {
    public static void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Anagram Checker.");
        System.out.println("Enter first word: ");
        String firstword = sc.nextLine();
        System.out.println("Enter second word: ");
        String secondword = sc.nextLine();

        if (firstword.length() != secondword.length()){
            System.out.println("NO.");
        }

        String fistwordSorted = bubbleSortString(firstword);
        String secondwordSorted = bubbleSortString(secondword);

        if  (fistwordSorted.equals(secondwordSorted)){
            System.out.println("YES!");
        } else{
            System.out.println("NO.");
        }
    }

    public static String bubbleSortString(String word){
        char[] charArray = word.toCharArray();

        for (int i = 0; i < charArray.length - 1; i++){
            boolean changed = false;
            for (int j = 0; j < charArray.length - 1 -i; j++){
                if (charArray[j] > charArray[j+1]){
                    char temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                    changed = true;
                }
            }
            if (!changed){ break; }
        }
        return new String(charArray);
    }
}
