package ru.ibs.intership;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JunitHW {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader(createFile()))) {
            while (br.ready()) {
                Integer num = Integer.parseInt(br.readLine());
                System.out.println(fizzBuzz(num));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static File createFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the address of the file");
        return new File(sc.nextLine());
    }

    public static String fizzBuzz(Integer num) {
            if (num % 3 == 0 && num % 5 == 0) {
                return "FizzBuzz";
            } else if (num % 3 == 0) {
                return "Fizz";
            } else if (num % 5 == 0) {
                return "Buzz";
            } else {
                return num.toString();
            }
    }

}
