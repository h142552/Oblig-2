package no.hib.dat100;
import java.util.Random;

public class Oppgave3 {
    private int antallKast = 100;
    private int[] kast = new int[antallKast];
    private int[] antall  = new int[antallKast / 20];
    private int gjennomsnitt = 0;
    private int flestAntall = 0;
    private int antallFør6 = 0;

    // Default konstruktør
    public Oppgave3(){
        kastTerning();
        finnAntall();
        finnGjennomsnitt();
        finnAntallFør6();
        finnFlest();
    }

    // Konstruktør med parameter
    public Oppgave3(int antallKast){
        this.antallKast = antallKast;

        kastTerning();
        finnAntall();
        finnGjennomsnitt();
        finnAntallFør6();
        finnFlest();
    }

    // Skriver ut alle resultatene
    public void start(){
        System.out.print("\t\tTERNINGKASTSIMULATOR\n");
        System.out.print(skrivKast());
        System.out.print("\nAntall kast: " + this.antallKast);
        System.out.print(skrivAntall());
        System.out.print("\nGjennomsnittskast: " + this.gjennomsnitt + 1);
        System.out.print("\nAntall kast for å få den første 6-eren: " + antallFør6);
        System.out.print("\nTerningverdien det var flest av: " + flestAntall);
    }

    // Kaster 100 terninger (100 random tall)
    public void kastTerning(){
        Random rand = new Random();
        for(int i = 0; i < antallKast; i++)
            rand.nextInt(6); // 0 = 1, 1 = 2, ... , 5 = 6
    }
    
    // Skriver ut alle kastene
    public void skrivKast(){
        for(int i = 0; i < (antallKast / 20); i++){     // 5 * 20 = 100
            for(int j = 0; j < 20; j++)
                System.out.print(this.kast[i] + " ");
            System.out.println();
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

        this.gjennomsnitt = sum / 100;
    }

    // Finner hvor mange tall som kommer før den første 6-eren
    private void finnAntallFør6(){
        this.antallFør6 = 0;
        for(int i = 0; i < antallKast; i++){ // Kan bytte til enkel for-løkke
            if(this.kast[i] != 5) // 5 = 6
                this.antallFør6++;
            else
                break; // bytt til return
        }
    }
    
    // Finner hvilken verdi som har flest, og lagrer det i 'flestAntall'
    private void finnFlest(){
        this.flestAntall = 0;
        for(int i : this.antall)
            if(this.flestAntall < i)
                this.flestAntall = i;
    }
}

