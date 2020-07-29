
public class BubbleSort {
	
	void bubbleSort(int arr[]) {
		int n= arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	void printArr(int arr[]) {
		int n= arr.length;
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
			BubbleSort ob = new BubbleSort();
			int arr[]= {45,22,88,10,5};
			ob.bubbleSort(arr);
			ob.printArr(arr);

}
}