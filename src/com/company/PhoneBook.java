package com.company;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

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

    protected void deleteIdenticalStreetInstances(){

    }

}
