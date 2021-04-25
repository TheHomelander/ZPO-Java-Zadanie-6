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

    protected String Opis() {
        return "Firma: " + name + "\n"
                + street + " "
                + buildingNumber + "/"
                + apartmentNumber + "\n"
                + postCode + " "
                + city + "\n";
    }


    protected String returnStreet() {
        return street;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected NrTelefoniczny getPhoneNumber() {
        return phoneNumber;
    }

    protected void setPhoneNumber(NrTelefoniczny phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    protected String getCity() {
        return city;
    }

    protected void setCity(String city) {
        this.city = city;
    }

    protected String getStreet() {
        return street;
    }

    protected void setStreet(String street) {
        this.street = street;
    }

    protected String getPostCode() {
        return postCode;
    }

    protected void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    protected String getBuildingNumber() {
        return buildingNumber;
    }

    protected void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    protected String getApartmentNumber() {
        return apartmentNumber;
    }

    protected void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
}
