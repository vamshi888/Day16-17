public class InsertionSort_3 {
	public static void main(String args[])	{
        int arr[] = { 32, 21, 113, 52, 16 };
        InsertionSort_3 ob = new InsertionSort_3();
	        ob.sort(arr);
	        printArray(arr);
		}	
	void sort(int arr[])	{
	        int n = arr.length;
		        for (int i = 1; i < n; ++i) {
		            int key = arr[i];
		 /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
		            int j = i - 1;						      
			            while (j >= 0 && arr[j] > key) {
			                arr[j + 1] = arr[j];
			                j = j - 1;
			            }
			            arr[j + 1] = key;
			        }
		    }
	/* A utility function to print array of size n*/
    static void printArray(int arr[]){				
        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
    	}	 
}
