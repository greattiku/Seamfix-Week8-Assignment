package com.example.librarymanagementsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagementSystem extends Books implements Library_Interface {
    Scanner sc = new Scanner(System.in);





    public void details() {


        try {
            System.out.println("Software Books enter 1 \nHardware Books 2 \n>>");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    softwareBooksDetails();
                    break;
                case 2:
                    hardwareBooksDetails();
                    break;
                default:
                    throw new InputMismatchException("Unexpected value: input should be between 1 and 2");
            }
        } catch (InputMismatchException e) {
            System.out.println("Something went wrong: Input Mismatch \nReload and try again.");
        }

    }


    public void softwareBooksDetails() {
        System.out.println("enter Author's name:");
        setAuthorName(sc.next());

        System.out.println("enter Title:");
        setTitle(sc.next());

        System.out.println("enter Price:");
        setPrice(sc.nextInt());

        System.out.println("enter Stock:");
        setStock(sc.nextInt());

        System.out.println("enter Software Version:");
        setSoftwareVersion(sc.nextDouble());

        System.out.println("enter Software Name:");
        setSoftwareName(sc.next());

        System.out.println("enter Page Number:");
        setPageNumber(sc.nextInt());


        System.out.println("Author name: " + getAuthorName() +
                "\nTitle: " + getTitle() +
                "\nPrice: " + getPrice() +
                "\nStock: " + getStock() +
                "\nSoftware Version: " + getSoftwareVersion() +
                "\nSoftware Name: " + getSoftwareName() +
                "\nPage Number: " + getPageNumber());


    }

    public void hardwareBooksDetails() {
        System.out.println("enter Author's name:");
        setAuthorName(sc.next());

        System.out.println("enter Title:");
        setTitle(sc.next());

        System.out.println("enter Price:");
        setPrice(sc.nextInt());

        System.out.println("enter Stock:");
        setStock(sc.nextInt());

        System.out.println("enter Hardware Category:");
        setHardwareCategory(sc.next());

        System.out.println("enter Publisher:");
        setPublisher(sc.next());

        System.out.println("enter Page Number:");
        setPageNumber(sc.nextInt());


        System.out.println("Author name: " + getAuthorName() +
                "\nTitle: " + getTitle() +
                "\nPrice: " + getPrice() +
                "\nStock: " + getStock() +
                "\nHardware Category: " + getHardwareCategory() +
                "\nPublisher: " + getPublisher() +
                "\nPage Number: " + getPageNumber());


    }
}