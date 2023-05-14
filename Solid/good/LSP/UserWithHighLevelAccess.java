package LSP;

public abstract class UserWithHighLevelAccess extends User{

    @Override
    public void login() {
        System.out.println("login successful");
    }

    public abstract void deleteUser(String name);

}
