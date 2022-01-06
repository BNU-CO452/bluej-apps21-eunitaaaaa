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
    
    private Random random;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        this.random = new Random();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(1, "Samsung Galaxy S20"));
        stock.add(new Product(2, "Apple iPhone 12"));
        stock.add(new Product(3, "Google Pixel 4A"));
        stock.add(new Product(4, "Huawei 377 "));
        stock.add(new Product(5, "One Plus 9"));
        stock.add(new Product(6, "Apple iPhone 13"));
        stock.add(new Product(7, "Samsung Galaxy Z Fold"));
        stock.add(new Product(8, "Honor 50"));
        stock.add(new Product(9, "Motorola Edge"));
        stock.add(new Product(10, "Xiaomi 11 "));
        
        runDemo();
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
        
        removeProducts();
        stock.print();
        
        findProductname();
        stock.print();
        
        checkProductamount();
        stock.print();
        
        restockProductamount();
        
    }
    /**
     * sells an amount of the products specified 
     * if there are none than the program will inform the user
     */
    private void buyProducts()
    {
        stock.buyProduct(1,random.nextInt(1000));
        stock.buyProduct(2,500);
        stock.buyProduct(3,880);
        stock.buyProduct(4,random.nextInt(50));
        stock.buyProduct(5,random.nextInt(50));
        stock.buyProduct(6,990);
        stock.buyProduct(7,3450);
        stock.buyProduct(8,400);
        stock.buyProduct(9,1110);
        stock.buyProduct(10,702);
        
    }

    private void sellProducts()
    {
        stock.sellProduct(1,300);
        stock.sellProduct(2,278);
        stock.sellProduct(3,5690);
        stock.sellProduct(4,1100);
        stock.sellProduct(5,684);
        stock.sellProduct(6,320);
        stock.sellProduct(7,550);
        stock.sellProduct(9,160);
        stock.sellProduct(10,490);
        
        
    }   
    /**
     * removes the particular products from the stocklist
     */
    private void removeProducts()
    {
        stock.removeProduct(1);
        stock.removeProduct(2);
        
    }
    /**
     * finds and displays products based on their names
     */
    private void findProductname()
    {
        System.out.print("Name search list");
        System.out.println();
        stock.findName("Samsung Galaxy S20");
        stock.findName("Apple iPhone 12");
        
    }
    /**
     * warns the user if the product is low in stock
     */
    private void checkProductamount()
    {
        stock.checkProduct(1);
    }
    /**
     * restocks the products if there is less stock.
     */
    private void restockProductamount()
    {
        System.out.println("Stock is replenished");
        System.out.println("");
        stock.restockProduct(1,1000);
        
    }
}

