package DSA;


public class SelectionSort {
	public static void display(int a[]) {
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i] + " ");
		}
	}
	public static void selectionSort(int a[]) {
		int min =0;
		for(int i=0;i<a.length-1;i++) {
			min =i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			int temp= a[min];
			a[min]=a[i];
			a[i]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {64,34,25,12,22,11,90};
		 selectionSort(a);
	     display(a);
	}

}
