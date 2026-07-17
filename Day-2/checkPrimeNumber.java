public class checkPrimeNumber {
    public static void main(String[] args) {
	    int n = 7;
	    boolean isPrime = true;
	    
	    for(int i=2; i<n; i++) {
	        if(n%i==0) {
	            isPrime = false;
	        }
	    }
	    
	    if(isPrime){
	        System.out.println(n + " is Prime");
	    } else{
	        System.out.println(n + " is Not Prime");
	    }
	    
	    // output
	    // 7 is Prime
	}
}