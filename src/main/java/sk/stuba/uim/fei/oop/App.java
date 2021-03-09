package sk.stuba.uim.fei.oop;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

       var zoznam = new LinkedList<Znamy>();
       zoznam.add(new NoZnamy());
       zoznam.add(new Graduate("Teodora" ,"Simon", "Ing"));
       zoznam.add(2, new NoZnamy());
        System.out.println(zoznam.size());
        for(int i=0;i<zoznam.size();i++){
            System.out.println(zoznam.get(i).getZnamy());

        }

        for(Znamy prvok:zoznam){
            System.out.println(prvok.getZnamy());
        }




    }
}