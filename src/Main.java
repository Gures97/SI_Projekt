import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Iris{
	public double sepalLength;
	public double sepalWidth;
	public double petalLength;
	public double petalWidth;
	
	public String type;
	
	public Iris(double sepalLength, double sepalWidth, double petalLength, double petalWidth, String type) {
		this.sepalLength = sepalLength;
		this.sepalWidth = sepalWidth;
		this.petalLength = petalLength;
		this.sepalWidth = petalWidth;
		this.type = type;
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner in;
		
		ArrayList<Iris> dane = new ArrayList<Iris>();

        try{
            in = new Scanner(new File("dataset.txt"));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return;
        }
        double sl,sw,pl,pw;
        String typ;
        while(in.hasNext()) {
        	sl = in.nextDouble();
        	sw = in.nextDouble();
        	pl = in.nextDouble();
        	pw = in.nextDouble();
        	typ = in.next();
        	dane.add(new Iris(sl,sw,pl,pw,typ));
        }
        
        in.close();

        //Coś robienie z danymi

        PrintWriter out;

        try{
            out = new PrintWriter(new File("Out.txt"));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return;
        }
        
        //Wypisywanie danych do pliku
        out.close();
        System.out.println("Już");

	}

}
