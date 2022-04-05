package uz.epam.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter numbers with a space at the end must be 0 (Example: 1 23 52 3 0)");

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String[] numbers = s.split(" ");

        int numbersLength = numbers.length;
//        System.out.println(numbersLength);
        if (numbersLength <= 100 && numbers[numbersLength - 1].equals("0")) {

            int sum = 0;
            for (int i = 0; i < numbers.length - 1; i++) {
//                System.out.println(numbers[i]);
                int pa = Integer.parseInt(numbers[i]);
                sum += pa;
//                System.out.println(sum);
            }
            System.out.println(sum / numbersLength);

        } else System.err.println("Wrong format");


    }
}
