//TWO SUM USING COMPARATOR AND TWO POINTER
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] a={1,20,7,6,5};
	    int target=13;
	    int[][] b=new int[a.length][2];
	    for(int i=0;i<a.length;i++){
	        b[i][0]=a[i];
	        b[i][1]=i;
	    }
	    Seven c=new Seven();
	    Arrays.sort(b,c);
	    int i=0,j=a.length-1;
	    while(i<j){
	        if(b[i][0]+b[j][0]==target){
	            System.out.println("("+i+","+j+")");
	            break;
	        }
	        else if(b[i][0]+b[j][0]>target){
	            j--;
	        }
	        else{
	            i++;
	        }
	    }
	    return;
	}
}
class Five implements Comparator<Integer>{
    public int compare(Integer a,Integer b){
        return a-b;
    }
}
class Seven implements Comparator<int[]>{
    public int compare(int[] a,int[] b){
        return a[0]-b[0];
    }
}
