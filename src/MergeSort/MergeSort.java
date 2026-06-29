package MergeSort;

public class MergeSort {


public static void mergeSort(int[] array) {
	if (array == null || array.length <= 1) {
		return;
	}
	mergeSortRec(array,0,array.length - 1);
}

private static void mergeSortRec(int[] array, int inicio, int fim) {
	if (inicio < fim) {
		int meio = (inicio + fim)/2;
		mergeSortRec(array,inicio,meio);
		
		mergeSortRec(array,meio+1,fim);
		
		merge(array,inicio,meio,fim);
	}
}

private static void merge(int[] array, int inicio, int meio, int fim) {
	
	int[] array_left = new int[meio - inicio + 1];
	int[] array_right = new int[fim - meio];
	
	for (int i = 0; i < array_left.length; i++) {
		array_left[i] = array[inicio + i];
	}
	for (int i = 0; i < array_right.length; i++) {
		array_right[i] = array[meio + 1 + i];
	}
	
	int i = 0;
	int j = 0;
	int k = inicio;
	
	while (i < array_left.length && j < array_right.length) {
		if (array_left[i] <= array_right[j]) {
			array[k] = array_left[i];
			i++;
		} else {
			array[k] = array_right[j];
			j++;
		}
		k++;
	}
	
	while (i < array_left.length) {
		array[k] = array_left[i];
		i++;
		k++;
	}
	while (j < array_right.length) {
		array[k] = array_right[j];
		j++;
		k++;
	}
}
}
