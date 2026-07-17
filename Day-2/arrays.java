public class arrays {
    public static void main(String[] args) {
	    // Method 1: Declare then assign
	    int[] marks = new int[5];
	    marks[0] = 85;
	    marks[1] = 72;
	    marks[2] = 90;
	    
	    // Method 2: Declare with values 
	    int[] scores = {85, 90, 78, 92, 88};
	    
	    // Access by Index 
	    System.out.println(scores[0]);
	    System.out.println(scores[4]);
	    
	    // output
	    // 85
        // 88
	}
}