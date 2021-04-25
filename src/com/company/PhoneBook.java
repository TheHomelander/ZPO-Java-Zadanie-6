package com.company;

import java.util.*;

public class PhoneBook {
    private TreeMap<NrTelefoniczny, Wpis> myTreeMap = new TreeMap<>();



    protected boolean addPosition (Wpis tw){
        if( tw == null) return false;
        if( tw instanceof Osoba ){
            myTreeMap.put(((Osoba) tw).getPhoneNumber(), tw);
        }else if ( tw instanceof Firma ){
            myTreeMap.put(((Firma) tw).getPhoneNumber(), tw);
        }
        return true;
    }

    protected String printTreeMap(){
        Set<NrTelefoniczny> keys = myTreeMap.keySet();
        String printMessage = "========== PHONEBOOK CONTENTS ==========\n\n";
        for (Iterator i = keys.iterator(); i.hasNext();)
        {
            NrTelefoniczny key = (NrTelefoniczny) i.next();
            Wpis value = (Wpis) myTreeMap.get(key);
            printMessage = printMessage + key.printPhoneNumber() + "\n" + value.Opis() + "\n";
        }
        return printMessage;
    }

    protected boolean deleteIdenticalStreetInstances() {

        for (Map.Entry<NrTelefoniczny, Wpis> outerLoop : myTreeMap.entrySet()) {
            NrTelefoniczny keyOuterLoop = outerLoop.getKey();
            Wpis valueOuterLoop = outerLoop.getValue();

            for (Map.Entry<NrTelefoniczny, Wpis> innerLoop : myTreeMap.entrySet()) {
                NrTelefoniczny keyInnerLoop = innerLoop.getKey();
                Wpis valueInnerLoop = innerLoop.getValue();

                if (valueOuterLoop != valueInnerLoop && valueOuterLoop.returnStreet() == valueInnerLoop.returnStreet()) {
                    myTreeMap.remove(keyInnerLoop);
                    return true;
                }

            }

        }
        return false;
    }



}
