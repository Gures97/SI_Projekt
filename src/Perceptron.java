import java.util.*;

public class Perceptron implements IAnswerer{
	private static final Random R = new Random();
	
	public double[] weights;
	
	public Perceptron(int size) {
		weights = new double[size+1];
		generateWeights();
	}
	
	public void generateWeights() {
		for(int i = 0; i<weights.length;i++)
			weights[i] = R.nextDouble()*2-1;
	}
	
	public void newWeights(double[] newWeights) {
		weights = newWeights;
	}
	
	@Override
	public double answer(double[] inputs) {
		double sum = 0;
		for(int i = 0; i<weights.length-1;i++) {
			sum += inputs[i] * weights[i];
		}
		sum += weights[weights.length-1];
		return activate(sum);
	}
	
	public double activate(double sum) {
		return (sum>0)?1:-1;
	}
}
