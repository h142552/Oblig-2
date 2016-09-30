package no.hib.dat100;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class Oppgave2 {
	public static void start(int tabellstørrelse){
		// Oppretter tabell, og fyller den med tilfeldige tall
		float[] tall = new float[tabellstørrelse];
		for(int i = 0; i < tabellstørrelse; i++)
			tall[i] = (float) Math.random();
		
		// Henter tiden før og etter sortering, og finner lengden mellom de
		Instant start = Instant.now();
		Arrays.sort(tall);
		int ms = (int)Duration.between(start, Instant.now()).toMillis();
		
		// Printer ut tid brukt
		System.out.println("Tid brukt (i ms): " + ms);
	}
}
