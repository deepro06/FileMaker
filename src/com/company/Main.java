package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileMaker[] file = new FileMaker[2];

        for(int i = 0; i < file.length; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Name:-  ");
            String fileName = scanner.nextLine();
            System.out.print("Type:-  ");
            String fileType = scanner.nextLine();

            file[i] = new FileMaker(fileName, fileType);

            System.out.println();
        }

        for(int i = 0; i < file.length; i++) {
            file[i].showInfo();

        }
        
    }
}