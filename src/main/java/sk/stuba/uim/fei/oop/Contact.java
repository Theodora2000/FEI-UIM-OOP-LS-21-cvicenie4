package sk.stuba.uim.fei.oop;

import java.util.Arrays;

public abstract class Contact implements  Znamy{

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



    public void setFriends(Contact... newFriend){
        this.friends = newFriend;
    }
    public void setFriendsFromArray(Contact[] newFriend){
        this.friends = newFriend;
    }



    public String akoText(){
        return String.format("%s %s", this.firstName, this.surname);
    }

    public abstract String getZnamy();

    @Override
    public String toString() {
        return String.format("Volam sa %s\n %s",this.akoText(), this.getZnamy());
    }
}
