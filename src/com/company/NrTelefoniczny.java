package com.company;

public class NrTelefoniczny implements Comparable<NrTelefoniczny>{
    private int nrKierunkowy;
    private int nrTelefonu;


    public NrTelefoniczny(int nrKierunkowy, int nrTelefonu) {
        this.nrKierunkowy = nrKierunkowy;
        this.nrTelefonu = nrTelefonu;
    }

    public int getNrKierunkowy() {
        return nrKierunkowy;
    }

    public void setNrKierunkowy(int nrKierunkowy) {
        this.nrKierunkowy = nrKierunkowy;
    }

    public int getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(int nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }


    @Override
    public int compareTo(NrTelefoniczny o) {
        if(this.nrKierunkowy == o.nrKierunkowy){
            if(this.nrTelefonu == o.nrTelefonu)return 0;
            else
                return this.nrTelefonu - o.nrTelefonu;
        }else
            return this.nrKierunkowy - o.nrKierunkowy;
    }

    protected String printPhoneNumber (){
        return "" + nrKierunkowy + nrTelefonu;
    }

}
