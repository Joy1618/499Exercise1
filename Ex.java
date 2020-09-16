import java.util.*;

public class Ex {
  public static int[] sort(int[] arr){
  Arrays.sort(arr);
  return arr;
}
	
public class sorttest extends Ex{
//unsorted array of integers
  int[] unsorted = new int[] {2,1,4,3};
//sorted array
  int[] sorted = sort(unsorted);
  }

public static void main(String[] args) {	
	int[] unsorted = new int[] {2,1,4,3};
	int[] sorted = sort(unsorted);
	System.out.println(Arrays.toString(sorted));
	}
}
