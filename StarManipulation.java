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

public class StarManipulation {

    public static void addStars(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i, "*");
        }
    }

    public static void removeStars(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.remove("*");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("the");
        list.add("quick");
        list.add("brown");
        list.add("fox");

        System.out.println("Original list: " + list);

        addStars(list);
        System.out.println("List after adding stars: " + list);

        removeStars(list);
        System.out.println("List after removing stars: " + list);
    }
}
