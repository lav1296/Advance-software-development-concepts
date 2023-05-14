public class Admin extends User{
    @Override
    public void login() {
        System.out.println("Admin has logged in");
    }

    @Override
    public void deleteUser(String name) {
        System.out.println("user "+name+"has been deleted successfully");
    }
}
