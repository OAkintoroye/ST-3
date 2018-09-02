//Olubukola Akintoroye
//6/25/2018
//Software Testing S18
//Assignment 5

Original class:

package testingpackage;

public class BubbleSortTDD {

}

========================================
Testcase1: empty array

	@Test
	public void passemptyarray() {
		
		assertArrayEquals(new int[] {},BubbleSortTDD.bbs(new int[] {}));
	}



Adjusted Code 1:

	public static int[] bbs(int[] is) {
		// TODO Auto-generated method stub
		return is;
	}



======================================================
TestCase2: One element array

	@Test
	public void passoneelementarray() {
		
		assertArrayEquals(new int[] {1},BubbleSortTDD.bbs(new int[]{1}));
	}
	
Adjusted Code 2: *Note: No changes required to satisfy this testcase

	public static int[] bbs(int[] is) {
		// TODO Auto-generated method stub
		return is;
	}
	
======================================================
TestCase3: Sort two element array

	@Test
	public void sorttwoelementarray() {
		
		
		assertArrayEquals(new int[] {1,2},BubbleSortTDD.bbs(new int[]{2,1}));
	}

Adjusted Code 3:

public static int[] bbs(int[] is) {
		// TODO Auto-generated method stub
		if(is.length <= 1);
		else
			if(is[0] > is[1]) {
			
				int temp = is[0];
				is[0] = is[1];
				is[1] = temp;
			}
		return is;
	}
=========================================================

TestCase4: Sort more than two element array - one traversal

	@Test
	public void sortMoreThanTwoElementArray() {
		
		
		assertArrayEquals(new int[] {1,2,3,4,5},BubbleSortTDD.bbs(new int[]{2,1,4,3,5}));
	}
	
Adjusted Code 4:

public static int[] bbs(int[] is) {
		// TODO Auto-generated method stub
		if(is.length <= 1);
		else
			for(int i = 0; i<is.length - 1; i++)
			{
				if(is[i] > is[i+1]) {
			
				int temp = is[i];
				is[i] = is[i+1];
				is[i+1] = temp;
			}
			}
			
		return is;
	}

====================================================================
TestCase5: Sort more than two element array - multiple traversal

	@Test
	public void sortMoreThanTwoElementArray() {
		
		
		assertArrayEquals(new int[] {1,2,4,6,7,9},BubbleSortTDD.bbs(new int[]{2,4,6,7,1,9}));
	}
	
Adjusted Code 5a:

public static int[] bbs(int[] is) {
		for(int j = 0; j<is.length-1; j++)
			for(int i = 0; i<is.length - 1 - j; i++)
			{
				if(is[i] > is[i+1]) {
			
					int temp = is[i];
					is[i] = is[i+1];
					is[i+1] = temp;
				}
			}
			
		return is;
	}

Adjusted Code 5b:

	public static int[] bbs(int[] is) {
		boolean noswaps;
		noswaps = true;
		for(int j = 0; j<is.length-1; j++) {
			
			for(int i = 0; i<is.length - 1 - j; i++)
			{
				if(is[i] > is[i+1]) {
			
					int temp = is[i];
					is[i] = is[i+1];
					is[i+1] = temp;
					noswaps = false;
				}
			}
			//stops unnecessary looping
			if(noswaps == true)
				break;
		}
			
			
			
		return is;
	}

