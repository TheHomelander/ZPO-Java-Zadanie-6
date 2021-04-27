package com.company;

public class Adres {
    private String city;
    private String street;
    private String postCode;
    private String buildingNumber;
    private String apartmentNumber;

    public Adres(String city, String street, String postCode, String buildingNumber, String apartmentNumber) {
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return "Adres\n" +
                "city: " + city + '\n' +
                "street: " + street + '\n' +
                "postCode: " + postCode + '\n' +
                "buildingNumber: " + buildingNumber + '\n' +
                "apartmentNumber: " + apartmentNumber + "\n";
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
