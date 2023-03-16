package org.example;

public class Main {
    public static void main(String[] args) {
        String[] auto = {"Porsche", "Nissan", "Toyota", "BMW", "Mazda"};
        System.out.print("Vypis array-u: ");
        for(int i=0; i<auto.length; i++){
            System.out.print(auto[i]+' ');
        }
    }
}