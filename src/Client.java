public class Client
{
private static int cID =1;
private String name;
private int clientID;
private String email;
private String address;

    public Client(String n, String e, String add)
    {
    this.clientID = cID++;
    this.address = add;
    this.email = e;
    this.name = n;
    }

    public int getClientID()
    {
        return clientID;
    }

    @Override
    public String toString()
    {
        return "Client ID: " + clientID + ", Name: " + name + ", Email: " + email + ", Address: " + address;
    }

}

