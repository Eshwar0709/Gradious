//Bubble Sort
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int[] arr={1,3,2,4,-1,56,0};
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr.length-1;j++){
	            if(arr[j]>arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	}
}
