package sk.stuba.uim.fei.oop;

public class App {
    public static void main(String[] args) {
        Contact contact = new Contact("Teodora", "Simon");
        var contact2 = new Contact("Martin", "Milec");
        var contact3 = new Contact("Tomas Kovacik");
        var contact4 = Contact.parsefromfullName("Gabreila Valentik");


        var contacts1 = new Contact[]{contact2, contact3, contact4};
        contact.setFriendsFromArray(contacts1);
        contacts1[0].setFirstName("Mato");
        contact.setFriends(contact2, contact3, contact4);


    }
}