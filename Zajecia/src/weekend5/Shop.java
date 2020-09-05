package weekend5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Shop {
    private final double priceForAllProducts;
    private Map<String, Double> products;
    private double budget;

    public Shop() {
        products = init();
        budget = 0;
        priceForAllProducts = calc();
    }

    private double calc() {
        double total = 0;
        // liczymy wartosc wszystkich produktow
        for (Double prices : products.values()) {
            total += prices;
        }
        return total;
    }

    //ta metoda sluzy do wstepnej inicjalizacji produktow...
    private Map<String, Double> init() {
        Map<String, Double> map = new HashMap<>();
        map.put("jajko", 0.8);
        map.put("chleb", 2.5);
        map.put("bułka", 0.5);
        map.put("woda", 1.0);
        map.put("jabłka", 4.25);
        map.put("przecier", 2.5);
        map.put("mleko", 2.1);
        map.put("ser", 6.0);
        return map;
    }

    public void showProducts() {
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println("Cena " + entry.getKey() + " wynosi " + entry.getValue());
        }
    }

    public void askForPrice(String input) {
        if (input == null || !products.containsKey(input)) {
            System.out.println("Dany produkt nie został odnaleziony");
            return;
        }
        System.out.println("Cena " + input + " wynosi " + products.get(input));
    }

    public String buyProduct(String input) {
        if (input == null || !products.containsKey(input)) {
            System.out.println("Dany produkt nie został odnaleziony");
            return null;
        }
        System.out.println("Kupiłeś " + input);
        increamentBudget(input);
        if (checkIfBudgetIs3TimesBiggerThanPriceForAllProducts()) {
            System.out.println("Na dziś zamykamy");
            System.exit(0);
        }
        return input;

    }

    private boolean checkIfBudgetIs3TimesBiggerThanPriceForAllProducts() {
        return 3 * priceForAllProducts < budget;
    }

    private void increamentBudget(String input) {
        budget += products.get(input);
    }

    public double getBudget() {
        return budget;
    }

    public double getPriceForAll() {
        return priceForAllProducts;
    }
}
