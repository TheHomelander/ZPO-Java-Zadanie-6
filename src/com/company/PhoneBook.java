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
        try {
            List<Wpis> lw = new ArrayList<>();

            for (Map.Entry<NrTelefoniczny, Wpis> outerLoop : myTreeMap.entrySet())
            {
                Wpis valueOuterLoop = outerLoop.getValue();
                lw.add(valueOuterLoop);
            }

            int arraySize = lw.size();

            for (int i = 0; i < arraySize; i++)
            {
                for (int j = i + 1; j < arraySize; j++)
                {
                    Wpis innerWpis = lw.get(j);
                    if (innerWpis == null) continue;
                    if (lw.get(i) != innerWpis && lw.get(i).returnStreet().equals(innerWpis.returnStreet()) && innerWpis.returnStreet() != null)
                    {
                        if (innerWpis instanceof Osoba)
                        {
                            myTreeMap.remove(((Osoba) innerWpis).getPhoneNumber());
                            lw.set(j, null);
                        } else if (innerWpis instanceof Firma){
                            myTreeMap.remove(((Firma) innerWpis).getPhoneNumber());
                            lw.set(j, null);
                        }
                    }
                }
            }
            return true;
        }catch (Exception e){
            System.out.println("Exception while deleting copies " + e);
        }
        return false;
    }



}
