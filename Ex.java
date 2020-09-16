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
}
