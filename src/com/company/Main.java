package com.company;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TreeMap <NrTelefoniczny, Wpis> myTreeMap = new TreeMap<>();

        Osoba osobaInstance1 = new Osoba("Bartosz", "Karłowicz", "jakis adres1", new NrTelefoniczny(48,11111111));
        Osoba osobaInstance2 = new Osoba("Maciej", "Kaciej", "jakis adres2", new NrTelefoniczny(48,222222222));
        Firma firmaInstance1 = new Firma("Januszex1", "firma adres1", new NrTelefoniczny(48, 333333333));
        Firma firmaInstance2 = new Firma("Januszex2", "firma adres2", new NrTelefoniczny(48, 444444444));

        myTreeMap.put(osobaInstance1.getPhoneNumber(), osobaInstance1);
        myTreeMap.put(osobaInstance2.getPhoneNumber(), osobaInstance2);
        myTreeMap.put(firmaInstance1.getPhoneNumber(), firmaInstance1);
        myTreeMap.put(firmaInstance2.getPhoneNumber(), firmaInstance2);


        for(Map.Entry<NrTelefoniczny, Wpis> e : myTreeMap.entrySet()){
            System.out.println(e.getKey().getNrTelefonu() + "\n" +  e.getValue().Opis());
        }


    }
}
