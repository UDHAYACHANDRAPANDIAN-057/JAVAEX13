/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexamples;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Fruit {
    String name;
    double price;
    int quantity;

    public Fruit(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

class SortByPrice implements Comparator<Fruit> {
    @Override
    public int compare(Fruit fruit1, Fruit fruit2) {
        return Double.compare(fruit1.price, fruit2.price);
    }
}

public class FruitSorting {
    public static void main(String[] args) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", 2.5, 10));
        fruits.add(new Fruit("Banana", 1.8, 15));
        // Add more fruits...

        System.out.println("Original list of fruits: ");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.name + " - $" + fruit.price + " - Quantity: " + fruit.quantity);
        }

        // Sorting by price using Comparator
        Collections.sort(fruits, new SortByPrice());

        System.out.println("\nSorted list of fruits by price: ");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.name + " - $" + fruit.price + " - Quantity: " + fruit.quantity);
        }
    }
}
