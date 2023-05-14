public class Purchase {
    Product product;
    User user;
    Purchase(String productName, String name){
        this.user=new User(name);
        this.product=new Product(productName);
    }
    public void performCheckout(){
        if (user.isEligibleForDiscount()){
            System.out.println("discount applied");
        }
        if (product.isInventoryAvailable()){
            System.out.println("inventory available");
        }else{
            System.out.println("inventory not available , checkout failed");
        }
        product.updateInventory();
        System.out.println("checkout successful");
    }
}
