package P05_VowelsCount;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("[AEIOUYaeiouy]");

        Matcher matcher = pattern.matcher(input);

        int count = 0;

        while(matcher.find()){
            count++;
        }

        System.out.println("Vowels: " + count);
    }
}
