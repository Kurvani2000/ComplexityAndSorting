package utilities;

public class HeapSort {
	
	public void sort(int[] array) {
		int n = array.length;

		//builds max heap. the largest element is at index 0 or root of heap.
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(array, n, i);
		}

		//extracts the max element from heap. stores it at the end of the array.
		for (int i = n - 1; i > 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;

			heapify(array, i, 0);
		}
	}
	//heapify works by reducing the heap size by 1 and then calling heapify
	//on the root element of the heap. The root element is the largest element in the heap.
	//this is done recursively until the heap size is 1. The prupose of heapify is to maintain
	//the maxheap property.
	private void heapify(int[] array, int n, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && array[left] > array[largest]) {
			largest = left;
		}

		if (right < n && array[right] > array[largest]) {
			largest = right;
		}

		if (largest != i) {
			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;

			heapify(array, n, largest);
		}
	}
}
