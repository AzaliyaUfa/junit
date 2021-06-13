package ru.ibs.intership;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ForTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the address of the file");
        File file = new File(sc.nextLine());
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            fizzBuzz(br);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void fizzBuzz(BufferedReader br) throws IOException {
        while (br.ready()) {
            Integer num = Integer.parseInt(br.readLine());
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }




    }

}
