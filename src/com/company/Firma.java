package com.company;

public class Firma extends Wpis{

    private String name;

    public Firma(String name, String city, String street, String postCode, String buildingNumber, String apartmentNumber, NrTelefoniczny phoneNumber) {
        this.name = name;
        this.adres = new Adres(city,street,postCode,buildingNumber,apartmentNumber);
        this.phoneNumber = phoneNumber;
    }

    protected String Opis() {
        return "Firma: " + name + "\n" +
                adres.toString() + "\n";
    }


    protected String getStreet() {
        return adres.toString();
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    protected NrTelefoniczny getPhoneNumber() {
        return phoneNumber;
    }

    protected void setPhoneNumber(NrTelefoniczny phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
