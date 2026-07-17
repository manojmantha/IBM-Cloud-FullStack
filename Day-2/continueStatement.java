public class continueStatement {
    public static void main(String[] args) {
	    for(int i=1; i<=5; i++) {
	        if(i==3) {
	            continue;
	        }
	        System.out.print(i + " ");
	    }
	    
	    // output
	    // 1 2 4 5
	}
}