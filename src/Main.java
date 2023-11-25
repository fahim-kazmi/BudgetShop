public class Main {
    public static void main(String[] args) {
        BudgetMarket budgetMarket = new BudgetMarket(10, 10, 10);

        // Adding stores
        int store1ID = budgetMarket.addStore("Market 1", "Etterbeek");
        int store2ID = budgetMarket.addStore("Market 2", "Etterbeek");

        // Adding products
        int product1ID = budgetMarket.addProduct("Fruits", 2.5, store1ID);
        int product2ID = budgetMarket.addProduct("Vegetables", 1.8, store1ID);
        int product3ID = budgetMarket.addProduct("Meat", 5.0, store2ID);
        int product4ID = budgetMarket.addProduct("Chips", 2.0, store2ID);

        // Adding clients
        int client1ID = budgetMarket.addClient("fahim kazmi", "fahim.kazmi@gmail.com", "Anderlecht");
        int client2ID = budgetMarket.addClient("Ali Haider", "ali.haider@gmail.com", "Anderlecht");

        // Printing all stores, products, and clients
        budgetMarket.printAllStores();
        budgetMarket.printAllProducts();
        budgetMarket.printAllClients();

        // Finding a store, product, and client
        Store foundStore = budgetMarket.findStore(store1ID);
        Product foundProduct = budgetMarket.findProduct(product1ID);
        Client foundClient = budgetMarket.findClient(client1ID);

        // Printing details of found objects
        System.out.println("Found Store: " + foundStore);
        System.out.println("Found Product: " + foundProduct);
        System.out.println("Found Client: " + foundClient);
    }
}
