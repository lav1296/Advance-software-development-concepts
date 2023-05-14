package DependencyInversion;

public class Product implements IProduct{
    public String productName;

    Product(String productName){
        this.productName=productName;
    }
    @Override
    public boolean isInventoryAvailable() {
        return true;
    }

    @Override
    public void updateInventory()
        {
            System.out.println("Inventory updated for product "+productName);
        }

}
