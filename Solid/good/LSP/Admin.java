package LSP;

public class Admin extends UserWithHighLevelAccess{
    @Override
    public void deleteUser(String name) {
        System.out.println("user "+name+"deleted successfully");
    }
}
