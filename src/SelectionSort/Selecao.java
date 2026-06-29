package SelectionSort;

public class Selecao {
	//Copia e cola da aula

	public static void selectionSort(int[] vetor) {
		int n = vetor.length;

		for (int i = 0; i < n - 1; i++) {
			int indiceMenor = i;
			// BUSCA O MENOR ELEMENTO NA PARTE NÃO ORDENADA
			for (int j = i; j < n; j++) {
				if (vetor[j] < vetor[indiceMenor]) {
					indiceMenor = j;
				}
			}

			if (indiceMenor != i) {
				int temp = vetor[i];
				vetor[i] = vetor[indiceMenor];
				vetor[indiceMenor] = temp;
			}

		}
	}

	
}
