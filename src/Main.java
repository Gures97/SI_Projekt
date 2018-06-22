import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		

		Scanner input = new Scanner(System.in);
		System.out.println("Witaj!\n Program u�yje algorytmu genetycznego, by wyhodowa� podany napis z przypadkowego zestawu znak�w.\n");
		System.out.println("Wpisz w�asny ci�g znak�w lub wpisz \"Default\", by u�y� domy�lnego zdania");
		String target = input.nextLine();
		System.out.println("Podaj liczb� osobnik�w w populacji");
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
