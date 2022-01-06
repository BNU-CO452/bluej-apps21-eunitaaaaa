import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    private Random generator = new Random();

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList Stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Samsung Galaxy S20"));
        stock.add(new Product(102, "Apple iPhone 12"));
        stock.add(new Product(103, "Google Pixel 4A"));
        stock.add(new Product(104, "Huawei 377 "));
        stock.add(new Product(105, "One Plus 9"));
        stock.add(new Product(106, "Apple iPhone 13"));
        stock.add(new Product(107, "Samsung Galaxy Z Fold"));
        stock.add(new Product(108, "Honor 50"));
        stock.add(new Product(109, "Motorola Edge"));
        stock.add(new Product(110, "Xiaomi 11 "));
        
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101,500);
        stock.buyProduct(102,300);
        stock.buyProduct(103,200);
        stock.buyProduct(104,100);
    }

    private void sellProducts()
    {
        stock.sellProduct(101,300);
        stock.sellProduct(102,400);
        stock.sellProduct(103,500);
        stock.sellProduct(104,100);
    }    
}