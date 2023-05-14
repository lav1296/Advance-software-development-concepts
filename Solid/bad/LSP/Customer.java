public class Customer extends User {
    @Override
    public void login() {
        System.out.println("customer has logged in");
    }

    @Override
    public void deleteUser(String name) {
        System.out.println("not allowed to delete users");
    }
}
