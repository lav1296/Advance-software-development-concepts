package SRP;

public class Main {
    public static void main(String args[]){
        Subscribe subscribe = new Subscribe();
        subscribe.subscribeUser("brad");

        Email emailUser = new Email();
        emailUser.email("brad","subscriber");

    }

}
