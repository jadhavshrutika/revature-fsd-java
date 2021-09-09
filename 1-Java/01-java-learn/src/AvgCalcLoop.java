
public class AvgCalcLoop {

	public static void main(String[] args) {
		float[] scores= {67,78,90,98,76,54,68};
		float total= 0.00f;
		for(int i=0; i<scores.length;i++) {
			total+=scores[i];
			
		}
		System.out.println("Average ="+(total/scores.length));

	}

}
