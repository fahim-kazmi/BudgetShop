public class Product
{
private static int productID = 1;
private int ProductID;
private String category;
private double price;
private int storeID;

    public Product(String c, Double p, int SID)
    {
        this.ProductID = productID++;
        this.category = c;
        this.price = p;
        this.storeID = SID;
    }

    public int getProductID()
    {
     return ProductID;
    }
    @Override
    public String toString()
    {
        return "Product ID: " + productID + ", Category: " + category + ", Price: " + price;
    }
}