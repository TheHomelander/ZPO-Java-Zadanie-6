package com.company;

import java.util.*;

public class PhoneBook {
    private TreeMap<NrTelefoniczny, Wpis> myTreeMap = new TreeMap<>();



    protected boolean addPosition (Wpis tw){
        try {
            if (tw == null) return false;
            if (tw instanceof Osoba) {
                myTreeMap.put(((Osoba) tw).getPhoneNumber(), tw);
            } else if (tw instanceof Firma) {
                myTreeMap.put(((Firma) tw).getPhoneNumber(), tw);
            }
            return true;
        }catch (Exception e){
            System.out.println("Exception adding position to TreeMap: " + e);
        }
        return false;
    }

    protected String printTreeMap(){
        try {
            Set<NrTelefoniczny> keys = myTreeMap.keySet();
            String printMessage = "========== PHONEBOOK CONTENTS ==========\n\n";
            Iterator i = keys.iterator();
            while (i.hasNext()) {
                NrTelefoniczny key = (NrTelefoniczny) i.next();
                Wpis value = myTreeMap.get(key);
                printMessage = printMessage + key.printPhoneNumber() + "\n" + value.Opis() + "\n";
            }
            return printMessage;
        }catch (Exception e){
            System.out.println("Error printing TreeMap " + e);
        }
        return null;
    }

    protected boolean deleteIdenticalStreetInstances() {
        try
        {
            Set set = myTreeMap.entrySet();
            List <NrTelefoniczny> nt = new ArrayList<>();
            Set<String> ns = new TreeSet<>();
            Iterator i = set.iterator();
            while (i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                NrTelefoniczny key = (NrTelefoniczny) me.getKey();
                Wpis value = (Wpis) me.getValue();
                if(!ns.add(value.getStreet()))
                {
                    nt.add(key);
                }
            }
            for(NrTelefoniczny tn : nt){
                myTreeMap.remove(tn);
            }
            return true;
        }catch (Exception e){
            System.out.println("Exception while deleting copies " + e);
        }
        return false;
    }

    public static void main(String[] args) {


        PhoneBook myPhoneBook = new PhoneBook();

        Osoba osobaInstance1 = new Osoba("Bartosz", "Karłowicz", "Lodz",
                                        "Aleja Politechniki","94-054","23",
                                "4", new NrTelefoniczny(48,629751729)
                                        );

        Osoba osobaInstance2 = new Osoba("Marek", "Tokarek", "Lodz",
                                        "Aleja Politechniki","90-924","23",
                                        "4", new NrTelefoniczny(48,614478980)
                                        );

        Osoba osobaInstance3 = new Osoba("Maciej", "Nowak", "Lodz",
                                        "Wyszynskiego","90-924","23",
                                        "4", new NrTelefoniczny(48,747406044)
                                        );

        Osoba osobaInstance4 = new Osoba("Karol", "Stokrotka", "Lodz",
                                        "Aleja Politechniki","90-924","23",
                                        "4", new NrTelefoniczny(48,605988038)
                                        );

        Osoba osobaInstance5 = new Osoba("Joanna", "Pies", "Lodz",
                                        "Zachodnia","POSTCODE2","23",
                                        "4", new NrTelefoniczny(48,700774467)
                                        );

        Firma firmaInstance1 = new Firma("Januszex1", "Lodz", "Armii Krajowej",
                                        "POSTCODE3","CompanyBuilding1","CompanyApartment1",
                                        new NrTelefoniczny(48, 706296992)
                                        );

        Firma firmaInstance2 = new Firma("Januszex2", "firma city2", "Maratonska",
                                        "POSTCODE4","CompanyBuilding2","CompanyApartment2",
                                        new NrTelefoniczny(48, 709542467)
                                        );

        Firma firmaInstance3 = new Firma("Januszex3", "firma city2", "Zielona",
                                        "POSTCODE4","CompanyBuilding2","CompanyApartment2",
                                        new NrTelefoniczny(48, 650409915)
        );
        Firma firmaInstance4 = new Firma("Januszex4", "firma city2", "Zielona",
                                        "POSTCODE4","CompanyBuilding2","CompanyApartment2",
                                        new NrTelefoniczny(48, 631247312)
                                         );

        myPhoneBook.addPosition(osobaInstance1);
        myPhoneBook.addPosition(osobaInstance2);
        myPhoneBook.addPosition(osobaInstance3);
        myPhoneBook.addPosition(osobaInstance4);
        myPhoneBook.addPosition(osobaInstance5);
        myPhoneBook.addPosition(firmaInstance1);
        myPhoneBook.addPosition(firmaInstance2);
        myPhoneBook.addPosition(firmaInstance3);
        myPhoneBook.addPosition(firmaInstance4);

        System.out.println(myPhoneBook.printTreeMap());
        myPhoneBook.deleteIdenticalStreetInstances();
        System.out.println(myPhoneBook.printTreeMap());

    }

}
