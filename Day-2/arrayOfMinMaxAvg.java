public class arrayOfMinMaxAvg {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of array: ");
	    int n = sc.nextInt();
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    int sum = 0;
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++){
	        arr[i] = sc.nextInt();
	    }
	    	
	    for(int i=0; i<n; i++){
	        if(arr[i] > max) {
	            max = arr[i];
	        }
	        if(arr[i] < min) {
	            min = arr[i];
	        }
	        sum += arr[i];
	    }
	    
	    
	    System.out.println("Min: " + min);
	    System.out.println("Max: " + max);
	    System.out.println("Avg: " + (sum/n));
	    // output
        // Enter the size of array: 5
        // 1 2 3 4 5 
        // Min: 1
        // Max: 5
        // Avg: 3
	}
}