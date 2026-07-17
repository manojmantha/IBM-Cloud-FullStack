public class loopingArrays {
    public static void main(String[] args) {
	    int[] scores = {85, 90, 78, 92, 88};
	    int sum = 0;
	    
	    for(int i=0; i<scores.length; i++) {
	        sum += scores[i];
	    }
	    
	    double avg = (double)sum / scores.length;
	    System.out.println("Sum: " + sum);  
	    System.out.println("Avg: " + avg); 
	    
	    // output
	    // Sum: 433
        // Avg: 86.6
	}
}