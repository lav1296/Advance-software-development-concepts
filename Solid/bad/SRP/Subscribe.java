public class Subscribe {
   public void  subscribeUser(String name){
      System.out.println("user "+name+ "has been subscribed successfully");

   }
   private String getEmailTemplate(String templateType){
      System.out.println("fetched template "+templateType);
      return "emailTemplate " +templateType;
   }
   public void email(String name){
      String emailTemplate=getEmailTemplate("subscriber");
      System.out.println("email successfully sent to "+name);

   }
}
