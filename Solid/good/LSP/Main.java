package LSP;

public class Main {
    public static void main(String args[]){
        UserWithLowLevelAccess customer1= new  Customer();
        UserWithHighLevelAccess admin1 =new Admin();

        customer1.login();
        admin1.login();

        admin1.deleteUser("abc");

    }
}