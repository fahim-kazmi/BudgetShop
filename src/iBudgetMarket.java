public interface iBudgetMarket
{
    int addStore(String name, String street);

    int addProduct(String category, Double price, int storeID);

    int addClient(String name, String email, String street);

    void printAllStores();

    void printAllProducts();

    void printAllClients();

    Store findStore(int storeID);

    Product findProduct(int productID);

    Client findClient(int clientID);
}
