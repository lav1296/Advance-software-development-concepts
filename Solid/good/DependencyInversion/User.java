package DependencyInversion;

public class User implements IUser{
    public String name;
    User(String name){
        this.name=name;
    }
    @Override
    public boolean isEligibleForDiscount() {
        return true;
    }
}
