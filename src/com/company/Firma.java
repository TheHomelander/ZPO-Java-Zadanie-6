package com.company;

public class Firma extends Wpis{
    private String name;
    private String city;
    private String street;
    private String postCode;
    private String buildingNumber;
    private String apartmentNumber;

    private NrTelefoniczny phoneNumber;

    public Firma(String name, String city, String street, String postCode, String buildingNumber, String apartmentNumber, NrTelefoniczny phoneNumber) {
        this.name = name;
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
        this.phoneNumber = phoneNumber;
    }

    String Opis() {
        return "Firma: " + name + "\n"
                + street + " "
                + buildingNumber + "/"
                + apartmentNumber + "\n"
                + postCode + " "
                + city + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NrTelefoniczny getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(NrTelefoniczny phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
