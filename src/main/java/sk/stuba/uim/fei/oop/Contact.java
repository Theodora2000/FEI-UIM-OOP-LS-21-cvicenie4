package sk.stuba.uim.fei.oop;

public class Contact {

    String firstName;
    String surname;
    Contact[] friends;

    public Contact(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public Contact(String fullName){
        var parts = fullName.split(" ");
        firstName = parts[0];
        surname = parts[1];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static Contact parsefromfullName(String fullName){
        return new Contact(fullName);
    }

    public void setFriends(Contact... newFriend){
        this.friends = newFriend;
    }
    public void setFriendsFromArray(Contact[] newFriend){
        this.friends = newFriend;
    }
}
