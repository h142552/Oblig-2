package no.hib.dat100;

public class Oppgave1 {
	public static void start(){
		// a)
		System.out.println(baklengs("Hello World"));
		
		// b)
		int[] arr = {1, 2, 8, 9, 129};
		System.out.println(erSortertStigende(arr));
	
		// c)
		String[] sArr = {"a", "b", "c", "a", "z"};
		System.out.println(returnerFremste(sArr));
	}
	
	// Oppgave 1 a)
	public static String baklengs(String s){
		String rs = "";
		for(int i = s.length(); i > 0; i--)
			rs += s.charAt(i - 1);
		
		return rs;
	}
	
	// Oppgave 1 b)
	public static boolean erSortertStigende(int[] arr){
		for(int i = 0; i < arr.length - 1; i++)
			if(!(arr[i] < arr[i + 1]))
				return false;
		
		return true;
	}

	// Oppgave 1 c)
	public static String returnerFremste(String[] s){
		String førsteOrd = s[0];
		for(int i = 0; i < s.length; i++)
			if(førsteOrd.compareTo(s[i]) > 0)
				førsteOrd = s[i];
		
		return førsteOrd;
	}
}
