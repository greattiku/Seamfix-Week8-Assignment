package com.example.librarymanagementsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class FurnitureSystem extends Furniture implements Furniture_Interface {
        Scanner sc = new Scanner(System.in);


        public void details() {


            try {
                System.out.println("Bookshelves enter 1 \nChairs 2 \n>>");
                int opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        bookshelvesDetails();
                        break;
                    case 2:
                        chairDetails();
                        break;
                    default:
                        throw new InputMismatchException("Unexpected value: input should be between 1 and 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong: Input Mismatch \nReload and try again.");
            }

        }

        public void bookshelvesDetails() {
            System.out.println("enter Price:");
            setPrice(sc.nextInt());

            System.out.println("enter Width:");
            setWidth(sc.nextDouble());

            System.out.println("enter Height:");
            setHeight(sc.nextDouble());



            System.out.println("Price: " + getPrice() +
                    "\nWidth: " + getWidth() +
                    "\nHeight: " + getHeight());
        }
        public void chairDetails() {
            System.out.println("enter Price:");
            setPrice(sc.nextInt());

            System.out.println("enter Width:");
            setWidth(sc.nextDouble());

            System.out.println("enter Height:");
            setHeight(sc.nextDouble());



            System.out.println("Price: " + getPrice() +
                    "\nWidth: " + getWidth() +
                    "\nHeight: " + getHeight());
        }


    }