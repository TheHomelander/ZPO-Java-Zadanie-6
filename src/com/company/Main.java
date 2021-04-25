package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        PhoneBook myPhoneBook = new PhoneBook();

        Osoba osobaInstance1 = new Osoba("Bartosz", "Karłowicz", "Sosnowiec",
                                         "Aleja Politechniki","94-054","23",
                                 "4", new NrTelefoniczny(48,11111111)
                                        );

        Osoba osobaInstance2 = new Osoba("Bartosz", "Karłowicz", "Sosnowiec",
                                         "Aleja Politechniki","POSTCODE2","23",
                                "4", new NrTelefoniczny(48,222222222)
                                        );

        Firma firmaInstance1 = new Firma("Januszex1", "firma city1", "Company Street1",
                                "POSTCODE3","CompanyBuilding1","CompanyApartment1",
                                        new NrTelefoniczny(48, 333333333)
                                        );

        Firma firmaInstance2 = new Firma("Januszex2", "firma city2", "Company Street2",
                                "POSTCODE4","CompanyBuilding2","CompanyApartment2",
                                        new NrTelefoniczny(48, 444444444)
                                        );

        myPhoneBook.addPosition(osobaInstance1);
        myPhoneBook.addPosition(osobaInstance2);
        myPhoneBook.addPosition(firmaInstance1);
        myPhoneBook.addPosition(firmaInstance2);

        System.out.println(myPhoneBook.printTreeMap());


    }
}
