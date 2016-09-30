package no.hib.dat100;

public class Vare {
    private int varenr;
    private String navn;
    private float pris;

    public int getVarenr()      { return this.varenr; }
    public String getNavn()     { return this.navn; }
    public float getPris()      { return this.pris; }
    
    public void setVarenr(int varenr)   { this.varenr = varenr; }
    public void setNavn(String navn)    { this.navn = navn; }
    public void setPris(float pris)     { this.pris = pris; }

    public Vare(){

    }

    public Vare(int varenr, String navn, float pris){
        this.varenr = varenr;
        this.navn   = navn;
        this.pris   = pris;
    }
    
    public float moms(){
        return (float) this.pris * 0.20f;
    }

    public boolean billigereEnn(Vare v){
        if(this.pris < v.pris)
            return true;
        else
            return false;
    }

    public void skriv(){
        System.out.print(
            "\nVarenummer: " + this.varenr
            + "\nNavn: " + this.navn
            + "\nPris: " + this.pris
            + "\nMoms: " + this.moms());
    }
}
