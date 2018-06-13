import java.util.*;

public class ClasificationSet<T> {
	public ArrayList<T> data;
	public ArrayList<T> testSet;
	public ArrayList<T> trainingSet;
	
	private static Random R = new Random();
	
	public ClasificationSet(){
		data = new ArrayList<T>();
		testSet = new ArrayList<T>();
		trainingSet = new ArrayList<T>();
	}
	
	public void addExample(T example) {
		data.add(example);
	}
	
	public void divide() {
		for(T element : data) {
			if(R.nextInt()%3 == 1)
				testSet.add(element);
			else
				trainingSet.add(element);
		}
	}
}
