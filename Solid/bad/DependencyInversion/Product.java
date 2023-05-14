public class Product {
    String productName;
    Product(String productName){
        this.productName=productName;
    }
    public boolean isInventoryAvailable(){
        return true;
    }
    public void updateInventory(){
        System.out.println("Inventory updated for product "+productName);
    }
}
