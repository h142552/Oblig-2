package no.hib.dat100;
import java.util.Random;

public class Oppgave3 {
    private int antallKast = 100;
    private int[] kast;
    private int[] antall;
    private double gjennomsnitt = 0.0;
    private int flestAntall = 0;
    private int antallFør6 = 0;

    // Default konstruktør
    public Oppgave3(){
        this.kast = new int[antallKast];
        this.antall = new int[6];

        kastTerning();
        finnAntall();
        finnGjennomsnitt();
        finnAntallFør6();
        finnFlest();
    }

    // Konstruktør med parameter
    public Oppgave3(int antallKast){
        this.antallKast = antallKast;
        this.kast = new int[antallKast];
        this.antall = new int[6];

        kastTerning();
        finnAntall();
        finnGjennomsnitt();
        finnAntallFør6();
        finnFlest();
    }

    // Skriver ut alle resultatene
    public void start(){
        System.out.print("\tTERNINGKASTSIMULATOR\n");
        skrivKast();
        System.out.print("\nAntall kast: " + this.antallKast);
        skrivAntall();
        System.out.print("\nGjennomsnittskast: " + this.gjennomsnitt + 1);
        System.out.print("\nAntall kast for å få den første 6-eren: " + antallFør6);
        System.out.print("\nTerningverdien det var flest av: " + flestAntall);
    }

    // Kaster 100 terninger (100 random tall)
    public void kastTerning(){
        Random rand = new Random();
        for(int i = 0; i < antallKast; i++)
            this.kast[i] = rand.nextInt(6); // 0 = 1, 1 = 2, ... , 5 = 6
    }
    
    // Skriver ut alle kastene
    public void skrivKast(){
        for(int i = 0; i < antallKast; i++){
            if(i % 20 == 0) // Printer ny linje hver 20-ende tall
                System.out.println();
            System.out.print(this.kast[i] + 1 + " ");
        }
    }

    // Skriver ut antall av hvert kast
    public void skrivAntall(){
        for(int i = 0; i < 6; i++)
            System.out.print("\nAntall " + (i + 1) + "-ere: " + antall[i]);
    }
    
    // Finner antall av hvert tall
    private void finnAntall(){
        for(int i = 0; i < antallKast; i++)
            this.antall[this.kast[i]]++;
    }
 
    // Finner gjennomsnittet, og lagrer det i 'gjennomsnitt'
    private void finnGjennomsnitt(){
        int sum = 0;
        for(int i = 0; i < antallKast; i++)
            sum += this.kast[i];

        this.gjennomsnitt = (double)sum / 100.0 + 1;
    }

    // Finner hvor mange tall som kommer før den første 6-eren
    private void finnAntallFør6(){
        this.antallFør6 = 0;
        for(int i = 0; i < antallKast; i++){ 
            if(this.kast[i] != 5) // 5 = 6
                this.antallFør6++;
            else
                break; // bytt til return
        }
    }
    
    // Finner hvilken verdi som har flest, og lagrer det i 'flestAntall'
    private void finnFlest(){
        this.flestAntall = 0;
        int høyesteVerdi = 0;

        for(int i = 0; i < 6; i++){
            if(høyesteVerdi < antall[i]){
                høyesteVerdi = antall[i];
                this.flestAntall = i + 1;
            }
        }
    }
}

