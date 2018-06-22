import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		

		Scanner input = new Scanner(System.in);
		System.out.println("Witaj!\n Program u¿yje algorytmu genetycznego, by wyhodowaæ podany napis z przypadkowego zestawu znaków.\n");
		System.out.println("Wpisz w³asny ci¹g znaków lub wpisz \"Default\", by u¿yæ domyœlnego zdania");
		String target = input.nextLine();
		System.out.println("Podaj liczbê osobników w populacji");
		int n = input.nextInt();
		input.close();
		
		Population pop = new Population(n, target);
		
		for(int i = 0; true; i++) {
			if (i%10 == 0) {
				System.out.println(pop);
			}
			pop.live();
			pop.reproduce();
			if(pop.getPercentFitted() > 0.1) {
				break;
			}
		} 
		pop.live();
		System.out.println(pop);
	}

}
