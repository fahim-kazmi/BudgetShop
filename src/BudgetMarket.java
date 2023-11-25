public class BudgetMarket implements iBudgetMarket {
    private final Store[] stores;
    private final Product[] products;
    private final Client[] clients;

    public BudgetMarket(int maxStores, int maxProducts, int maxClients) {
        stores = new Store[maxStores];
        products = new Product[maxProducts];
        clients = new Client[maxClients];
    }

    @Override
    public int addStore(String name, String street)
    {
        Store store = new Store(name, street);
        for (int i = 0; i < stores.length; i++)
        {
            if (stores[i] == null)
            {
                stores[i] = store;
                return store.getStoreID();
            }
        }
        return -1; // Indicates failure to add store
    }

    @Override
    public int addProduct(String category, Double price, int storeID)
    {
        Product product = new Product(category, price, storeID);
        for (int i = 0; i < products.length; i++)
        {
            if (products[i] == null)
            {
                products[i] = product;
                return product.getProductID();
            }
        }
        return -1; // Indicates failure to add product
    }

    @Override
    public int addClient(String name, String email, String street)
    {
        Client client = new Client(name, email, street);
        for (int i = 0; i < clients.length; i++)
        {
            if (clients[i] == null)
            {
                clients[i] = client;
                return client.getClientID();
            }
        }
        return -1; // Indicates failure to add client
    }

    @Override
    public void printAllStores()
    {
        for (Store store : stores)
        {
            if (store != null)
            {
                System.out.println(store);
            }
        }
    }

    @Override
    public void printAllProducts()
    {
        for (Product product : products)
        {
            if (product != null)
            {
                System.out.println(product);
            }
        }
    }

    @Override
    public void printAllClients()
    {
        for (Client client : clients)
        {
            if (client != null)
            {
                System.out.println(client);
            }
        }
    }

    @Override
    public Store findStore(int storeID)
    {
        for (Store store : stores)
        {
            if (store != null && store.getStoreID() == storeID)
            {
                return store;
            }
        }
        return null;
    }

    @Override
    public Product findProduct(int productID)
    {
        for (Product product : products)
        {
            if (product != null && product.getProductID() == productID)
            {
                return product;
            }
        }
        return null;
    }

    @Override
    public Client findClient(int clientID)
    {
        for (Client client : clients)
        {
            if (client != null && client.getClientID() == clientID)
            {
                return client;
            }
        }
        return null;
    }
}