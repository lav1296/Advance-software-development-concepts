package DependencyInversion;

public class Purchase implements IPurchase{

    IProduct product;
    IUser user;
    Purchase(IProduct product,IUser user) {
        this.product=product;
        this.user=user;

    }

    @Override
    public void performCheckout() {
        if (user.isEligibleForDiscount()){
            System.out.println("discount applied");
        }
        if (product.isInventoryAvailable()){
            System.out.println("inventory available");
            return;
        }else{
            System.out.println("inventory not available , checkout failed");
        }
        product.updateInventory();
        System.out.println("checkout successful");
    }
}
