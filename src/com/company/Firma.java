package com.company;

public class Firma extends Wpis{
    private String name;
    private String adres;
    private NrTelefoniczny phoneNumber;

    public Firma(String name, String adres, NrTelefoniczny phoneNumber) {
        this.name = name;
        this.adres = adres;
        this.phoneNumber = phoneNumber;
    }

    String Opis() {
        return "" + name + "\n"
                + adres + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
