//program which gives the number of even digits
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr={186,4531,34,989873,2};
	    int count=0;
	    for(int i=0;i<arr.length;i++){
	        int countdig=0;
	        while(arr[i]!=0){
	            arr[i]/=10;
	            countdig++;
	        }
	        if(countdig%2==0){
	            count++;
	        }
	    }
	    System.out.println(count);
	}
}
//output:3
//example: 186 count of digits=3 so don't increment count and 4531 count of digits=4 so increment count by 1
