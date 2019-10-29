import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Product
{
    private String Itemname;
    private double unitPrice;
    public Product(double i)
    {
        Itemname = "no product";
        unitPrice = 0;
    }

    public double getPrice(double unitPrice) {
        return unitPrice;
    }
    public String productNamePrice(String Itemname, double unitPrice)
    {
        System.out.println(Itemname + " @ Rs." + getPrice(unitPrice));
        return this.Itemname + " @ Rs." + getPrice(unitPrice);
    }

}
class WeightedProduct extends Product
{
    private double weight;
    public WeightedProduct(double weight)
    {
        super(0);
        this.weight = weight;
    }
    @Override
    public double getPrice(double unitPrice)
    {
        return weight*unitPrice;
    }
    @Override
    public String productNamePrice(String Itemname, double unitPrice)
    {
        System.out.println(Itemname + " @ Rs." + unitPrice + weight + " kg " + getPrice(unitPrice));
        return Itemname + " @ Rs." + unitPrice + weight + " kg " + getPrice(unitPrice);
    }
}
class CountedProduct extends Product
{
    private double quantity;
    public CountedProduct(double quantity)
    {
        super(0);
        this.quantity = quantity;
    }
    @Override
    public double getPrice(double unitPrice)
    {
        return quantity*unitPrice;
    }
    @Override
    public String productNamePrice(String Itemname, double unitPrice)
    {
        System.out.println(Itemname + " @ Rs." + unitPrice + " "+ quantity + " units " + getPrice(unitPrice));
        return Itemname + " @ Rs." + unitPrice + " "+ quantity + " units " + getPrice(unitPrice);
    }
}
class Test
{
    public static void main(String[] args)throws IOException
    {
        String Itemname = " ";
        double unitPrice = 0;
        double weight,quantity;
        Product obj1 = new Product(0);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Demonstrating superclass Product: ");
        System.out.println("Enter Item name: ");
        Itemname = in.readLine();
        System.out.println("Enter unit price: ");
        unitPrice = Double.parseDouble(in.readLine());
        obj1.productNamePrice(Itemname,unitPrice);
        System.out.println("Demonstrating subclass WeightedProduct: ");
        System.out.println("Enter Item name: ");
        Itemname = in.readLine();
        System.out.println("Enter unit price: ");
        unitPrice = Double.parseDouble(in.readLine());
        System.out.println("Enter the weight of each product: ");
        weight = Double.parseDouble(in.readLine());
        WeightedProduct obj2 = new WeightedProduct(weight);
        obj2.productNamePrice(Itemname,unitPrice);
        System.out.println("Demonstrating subclass CountedProduct: ");
        System.out.println("Enter Item name: ");
        Itemname = in.readLine();
        System.out.println("Enter unit price: ");
        unitPrice = Double.parseDouble(in.readLine());
        System.out.println("Enter quantity of product: ");
        quantity = Double.parseDouble(in.readLine());
        CountedProduct obj3 = new CountedProduct(quantity);
        obj3.productNamePrice(Itemname,unitPrice);
    }
}
