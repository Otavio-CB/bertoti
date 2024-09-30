package org.rest;

// Client - Cliente que utiliza o Composite
public class CompositePatternDemo {
    public static void main(String[] args) {
        MenuComponent mainMenu = new Menu("Main Menu", "Top-level menu");
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Morning meals");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Afternoon meals");

        MenuComponent pancake = new MenuItem("Pancake", "Fluffy pancakes", 5.99);
        MenuComponent coffee = new MenuItem("Coffee", "Fresh coffee", 1.99);
        MenuComponent sandwich = new MenuItem("Sandwich", "Chicken sandwich", 6.99);
        MenuComponent salad = new MenuItem("Salad", "Caesar salad", 4.99);

        breakfastMenu.add(pancake);
        breakfastMenu.add(coffee);
        lunchMenu.add(sandwich);
        lunchMenu.add(salad);

        mainMenu.add(breakfastMenu);
        mainMenu.add(lunchMenu);

        mainMenu.print();
    }
}
