import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n=7;
	    int[] arr={4,8,2,1,7,8,6};
	    int max=0,k=0;
	    long result=0;
	    int index=0;
	    while(n!=0){
	        max=0;
	        for(int i=0;i<arr.length;i++){
	            if(max<arr[i]){
	                max=arr[i];
	                index=i;
	            }
	        }
	        arr[index]=Integer.MIN_VALUE;
	       // result+=(max*Math.pow(10,n-k-1));
	       result = result*10 + max;
	        n--;
	    }
	    System.out.println(result);
	}
}
