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

public int[] InsertionSort(int[] arr){
	for(int i = 1; i < arr.length; i++) {
		int k = arr[i];
		int pos = i;
		while(pos > 0 && k < arr[pos-1]) {
			arr[pos] = arr[pos-1];
			pos--;
		}
		arr[pos] = k;
		}
	return arr;
	}

public static void main(String[] args) {	
	int[] unsorted = new int[] {2,1,4,3};
	int[] sorted = sort(unsorted);
	int[] sorted2 = InsertionSort(unsorted);
	System.out.println(Arrays.toString(sorted));
	System.out.println(Arrays.toString(sorted2));
	}
}
