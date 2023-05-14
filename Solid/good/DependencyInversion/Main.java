package DependencyInversion;

public class Main {
    public static void main(String args[]){
        IProduct product=new Product("Iphone");
        IUser user = new User("Brad");

        IPurchase purchase=new Purchase(product,user);
        purchase.performCheckout();
    }
}
