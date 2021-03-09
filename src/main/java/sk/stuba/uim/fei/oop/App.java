package sk.stuba.uim.fei.oop;

public class App {
    public static void main(String[] args) {

       var absolvent = new Graduate("Tomas", "Kovacik", "Ing");
       absolvent.setFriends(new Graduate("Martin", "Kranec", "Ing"),new Graduate("Tomas", "dfss", "Ing"));
       System.out.println(absolvent.akoText());
       System.out.println(absolvent);



    }
}