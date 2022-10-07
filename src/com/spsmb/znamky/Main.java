package com.spsmb.znamky;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Animal> animals = new ArrayList();

    public static void main(String[] args) {
        /*ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Jan");
        names.add("Pepa");
        names.add("Jindra");
        names.add("Eva");
        names.add("Stepan");
        names.add("Tomas");
        names.add("Simon");
        names.add("Kristyna");
        names.add("Maruska");
        names.add("Jenda");
        names.add("Jakub");
        names.add("Zdena");
        names.add("Milan");
        names.add("Ondra");
        names.add("Karla");
        names.add("Lukas");
        names.add("Jarda");
        names.add("Mikes");
        names.add("Vaclav");
        names.add("Esmeralda");
        AtomicInteger numberOfAs = new AtomicInteger();
        names.forEach((name) -> {
            if (animals.get(i).getName().equals(name)){
                        animals.remove(i);
        });
        System.out.println(numberOfAs);*/
        run();

    }

    public static void run() {
        System.out.println("Spousteni...");
        menu();

    }

    public static void menu() {

        System.out.println("Zadejte 1 pro pridani zviratka");
        System.out.println("Zadejte 2 pro odebrani zviratka");
        System.out.println("Zadejte 3 pro vypis");
        System.out.println("Zadejte 4 pro konec");
        int num = Integer.parseInt(sc.nextLine());
        switch (num) {
            case (1) -> add();
            case (2) -> remove();
            case (3) -> list();
            case (4) -> System.exit(1);
            default -> {
                System.out.println("Spatne zadani");
                run();
            }
        }

    }

    public static void add() {
        System.out.println("Zadejte jmeno");
        String name = sc.nextLine();
        System.out.println("Zadejte vek");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Zadejte gender");
        String gender = sc.nextLine();
        System.out.println("Zadejte typ");
        String type = sc.nextLine();
        System.out.println("Zadejte pocet nohou");
        int numberOfLegs = Integer.parseInt(sc.nextLine());
        animals.add(new Animal(name, age, gender, type, numberOfLegs));
        menu();
    }

    public static void remove() {
        System.out.println("Zadejte jmeno");
        String name = sc.nextLine();
        animals.removeIf(animal -> animal.getName().equals(name));
        menu();
    }

    public static void list() {
        System.out.println(animals);
        menu();
    }
}
