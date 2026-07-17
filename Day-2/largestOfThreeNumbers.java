public class largestOfThreeNumbers {
    public static void main(String[] args) {
	    int a = 10;
	    int b = 20;
	    int c = 30;
	    
	    if(a>b && a>c) {
	        System.out.println("Largest: " + a);
	    } else if(b>c) {
	        System.out.println("Largest: " + b);
	    } else {
	        System.out.println("Largest: " + c);
	    }
	    
	    // output
	    // Largest: 30
	}
}