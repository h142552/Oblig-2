package no.hib.dat100;

public class Main {
	public static void main(String[] args) {
            // Oppgave 1
            System.out.print("---Oppgave-1---\n");
            Oppgave1.start();
            
            // Oppgave 2
            System.out.print("\n\n---Oppgave-2---\n");
            Oppgave2.start(1000000);

            // Oppgave 3
            System.out.print("\n\n---Oppgave-3---\n");
            Oppgave3 oppg3 = new Oppgave3();
            oppg3.start();

            // Oppgave 4
            System.out.print("\n\n---Oppgave-4---");
            Vare v = new Vare(1, "Banan", 3.14f);
            v.skriv();
            
            Vare b = new Vare(2, "Eple", 6.18f);
            System.out.print("\nEr bananer billigere enn epler? "
                + v.billigereEnn(b));
	}
}
