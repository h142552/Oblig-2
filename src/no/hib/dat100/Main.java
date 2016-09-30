package no.hib.dat100;

public class Main {
	public static void main(String[] args) {
            // Oppgave 3
            Oppgave3 oppg3 = new Oppgave3();
            oppg3.start();

            // Oppgave 4
            System.out.print("\n----------------------");
            Vare v = new Vare(1, "Banan", 3.14f);
            v.skriv();
            
            Vare b = new Vare(2, "Eple", 6.18f);
            System.out.print("\nEr bananer billigere enn epler? "
                + v.billigereEnn(b));
	}
}
