package SRP;

public class Email {

    private String getEmailTemplate(String templateType){
        System.out.println("fetched template "+templateType);
        return "emailTemplate " +templateType;
    }
    public void email(String name,String templateType){
        String emailTemplate=getEmailTemplate(templateType);
        System.out.println("email successfully sent to "+name);

    }
}
