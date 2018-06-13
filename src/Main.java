import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner in, inner;
		
		ClasificationSet<Iris> dane = new ClasificationSet<Iris>();

        try{
            in = new Scanner(new File("dataset.txt"));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
            return;
        }
        double sl,sw,pl,pw;
        String typ, line;
        while(in.hasNext()) {
        	line = in.nextLine();
        	line = line.replace(',', ' ');
        	line = line.replace('.', ',');
        	inner = new Scanner(line);
        	sl = inner.nextDouble();
        	sw = inner.nextDouble();
        	pl = inner.nextDouble();
        	pw = inner.nextDouble();
        	typ = inner.next();
        	dane.addExample(new Iris(sl,sw,pl,pw,typ));
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
        
        for(Iris i : dane.data) {
        	out.println(i.sepalLength + ", " 
        				+ i.sepalWidth + ", " 
        				+ i.petalLength + ", " 
        				+ i.petalWidth + ", "
        				+ i.type);
        }
        out.close();
        System.out.println("Już");

	}

}
