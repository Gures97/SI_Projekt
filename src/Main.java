public class Main {
	public static void main(String[] args) {
		Population pop = new Population(1000);
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
