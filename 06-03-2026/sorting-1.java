import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int n=7;
		int[] arr={4,8,2,1,7,8,6};
		int[] count=new int[10];
		for(int i=0;i<n;i++){
		    count[arr[i]]++;
		}
		for(int i=count.length-1;i>=0;i--){
		    while(count[i]>0){
		        System.out.print(i);
		        count[i]--;
		    }
		}
	}
}
