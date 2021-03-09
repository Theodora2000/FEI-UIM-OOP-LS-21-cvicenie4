package sk.stuba.uim.fei.oop;

public class Graduate extends Contact{
    private String academicTitle;
    public Graduate(String firstName, String surname) {
        super(firstName, surname);
        this.academicTitle="";

    }

    @Override
    public String getZnamy() {
        var builder= new StringBuilder();
        builder.append("MOJ ZNAMY\n");
        for(int i=0;i<this.friends.length;i++){
            builder.append(this.friends[i].akoText());
            builder.append("\n");
        }
        return builder.toString();
    }

    public Graduate(String firstName, String surname, String academicTitle) {
        super(firstName, surname);
        this.academicTitle=academicTitle;

    }




}
