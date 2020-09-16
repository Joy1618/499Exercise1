
import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class test extends Ex{
	
	//unsorted array of integers
			int[] unsorted = new int[]{2,1,4,3};
			//sorted array
			int[] sorted = sort(unsorted);
	    //descending sorted array
	    int[] DescSorted = new int[]{4,3,2,1};
	  // This is test for Insertion Sort
	  @Test
	    public void InsertionSortTest() {
	        int[] t = InsertionSort(unsorted);
			    assertArrayEquals(sorted,t);
	  }
	//This is the test for descending array
	   @Test
	    public void DescTest() {
	        int[] s = reverse(sorted);
			    assertArrayEquals(DescSorted,s);
	}
}
