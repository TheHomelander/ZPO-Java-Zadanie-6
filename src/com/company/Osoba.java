package com.company;

public class Osoba extends Wpis {
    private final String name;
    private final String surname;


    public Osoba(String name, String surname, String city, String street, String postCode, String buildingNumber, String apartmentNumber, NrTelefoniczny phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.adres = new Adres(city,street,postCode, buildingNumber, apartmentNumber);
    }

    @Override
    protected String Opis() {
        return "Osoba: " + name + " "
                + surname + "\n"
                + adres.toString() + "\n";
    }

    @Override
    protected String getStreet() {
        return adres.getStreet();
    }


    protected String getName() {
        return name;
    }

    protected String getSurname() {
        return surname;
    }

    @Override
    protected NrTelefoniczny getPhoneNumber() {
        return phoneNumber;
    }

    protected void setPhoneNumber(NrTelefoniczny phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




}
