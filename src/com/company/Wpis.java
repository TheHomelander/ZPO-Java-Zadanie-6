package com.company;

public abstract class Wpis {

    protected Adres adres;
    protected NrTelefoniczny phoneNumber;

    protected abstract String Opis();
    protected abstract String getStreet();
    protected abstract NrTelefoniczny getPhoneNumber();
}
