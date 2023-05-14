import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<User> userList=new ArrayList<>();
        User Customer1=new Customer();
        User Admin1=new Admin();

        for (User u:userList) {
            u.login();
            if (u instanceof Admin){
                u.deleteUser("user1");
            }

        }
    }
}
