import java.util.*;

public class rotateArray {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of array: ");
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++) {
	        arr[i] = sc.nextInt();
	    }
	    System.out.print("Enter k value: ");
	    int k = sc.nextInt();
	    if(k<0){
	        System.out.println("k is less than 0");
	    } else if(k>=arr.length){
	        System.out.println("k is greater than arr length");
	    } else {
	        System.out.println(Arrays.toString(newArray(arr, k))); 
	    }
	}
	
	public static int[] newArray(int[] arr, int k){
	    for(int i=0; i<k; i++){
	        for(int j=0; j<arr.length-1; j++){
	            int temp = arr[j];
	            arr[j] = arr[j+1];
	            arr[j+1] = temp;
	        }
	    }
	    return arr;
	}
}