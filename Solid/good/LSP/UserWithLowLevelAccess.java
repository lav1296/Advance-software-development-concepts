package LSP;

public abstract class UserWithLowLevelAccess extends User{
    @Override
    public void login() {
        System.out.println("login successful");
    }
}
