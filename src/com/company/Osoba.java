package com.company;

public class Osoba extends Wpis {
    private final String name;
    private final String surname;
    private String adres;
    private NrTelefoniczny phoneNumber;

    public Osoba(String name, String surname, String adres, NrTelefoniczny phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.adres = adres;
        this.phoneNumber = phoneNumber;
    }

    String Opis() {
        return "" + name + "\n"
                + surname + "\n"
                + adres + "\n";
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public NrTelefoniczny getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(NrTelefoniczny phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
