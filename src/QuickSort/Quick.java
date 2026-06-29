package QuickSort;

public class Quick {

	public static void quickSort(int[] array) {
		if (array == null || array.length <= 1) {
			return;
		}
		quickSortRec(array, 0, array.length - 1);
	}

	private static void quickSortRec(int[] array, int inicio, int fim) {
		if (inicio < fim) {
			int meio = particao(array, inicio, fim);

			quickSortRec(array, inicio, meio);
			quickSortRec(array, meio + 1, fim);
		}
	}

	private static int particao(int[] array, int i, int j) {
		int meio = (i + j) / 2;
		int pivo = array[meio];

		while (true) {

			while (array[i] < pivo) {
				i++;
			}
			while (array[j] > pivo) {
				j--;
			}
			if (i >= j) {
				return j;
			}

			int aux = array[i];
			array[i] = array[j];
			array[j] = aux;
			i++;
			j--;

		}
	}

}
