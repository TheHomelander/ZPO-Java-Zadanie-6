package com.company;

public class NrTelefoniczny implements Comparable<NrTelefoniczny>{
    private int nrKierunkowy;
    private int nrTelefonu;


    protected NrTelefoniczny(int nrKierunkowy, int nrTelefonu) {
        this.nrKierunkowy = nrKierunkowy;
        this.nrTelefonu = nrTelefonu;
    }

    protected int getNrKierunkowy() {
        return nrKierunkowy;
    }

    protected void setNrKierunkowy(int nrKierunkowy) {
        this.nrKierunkowy = nrKierunkowy;
    }

    protected int getNrTelefonu() {
        return nrTelefonu;
    }

    protected void setNrTelefonu(int nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    protected String printPhoneNumber (){
        return "" + nrKierunkowy + nrTelefonu;
    }

    @Override
    public int compareTo(NrTelefoniczny o) {
        if(this.nrKierunkowy == o.nrKierunkowy){
            if(this.nrTelefonu == o.nrTelefonu)return 0;
            else if ( this.nrTelefonu < o.nrTelefonu )
                return -1;
            else
                return 1;
        }else if (this.nrKierunkowy < o.nrKierunkowy)
            return -1;
        else
            return 1;
    }



}
