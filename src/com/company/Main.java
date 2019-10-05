package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
               String[] names = new String[3];
        names[0] = "Edil";
        names[1] = "Bermet";
        names[2] = "Aziz";
        System.out.println("Здраствуйте " + names[0] + ", " + names[1] + ", " + names[2] + " !");
        switch (names[0]) {
            case "Edil":
                System.out.println("Доброе утро, " + names[0] + "!");
                break;
            case "Bermet":
                System.out.println("Добрый день, " + names[1] + "!");
                break;
            case "Aziz":
                System.out.println("Добрый вечер, " + names[2] + "!");
                break;


        }
        switch (names[1]) {
            case "Edil":
                System.out.println("Доброе утро, " + names[0] + "!");
                break;
            case "Bermet":
                System.out.println("Добрвй день, " + names[1] + "!");
                break;
            case "Aziz":
                System.out.println("Добрый вечер, " + names[2] + "!");
        }
        switch (names[2]) {
            case "Edil":
                System.out.println("Доброе утро, " + names[0] + "!");
                break;
            case "Bermet":
                System.out.println("Добрый день, " + names[1] + "!");
                break;
            case "Aziz":
                System.out.println("Добрый вечер, " + names[2] + "!");
                break;

        }


    }
}