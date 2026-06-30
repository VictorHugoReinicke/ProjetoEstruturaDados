package HeapSort;

public class Heap {

	public static long comparacoes;
	public static long trocas;

	private static void heapify(int[] vetor, int n, int i) {
		int maior = i; 
		int esquerda = 2 * i + 1; 
		int direita = 2 * i + 2; 

	
		if (esquerda < n) {
			comparacoes++;
			if (vetor[esquerda] > vetor[maior]) {
				maior = esquerda;
			}
		}


		if (direita < n) {
			comparacoes++;
			if (vetor[direita] > vetor[maior]) {
				maior = direita;
			}
		}

		if (maior != i) {
			int swap = vetor[i];
			vetor[i] = vetor[maior];
			vetor[maior] = swap;
			trocas++;

			heapify(vetor, n, maior);
		}
	}
	
	public static void heapSort(int[] vetor) {
		int n = vetor.length;
		comparacoes = 0;
		trocas = 0;

		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(vetor, n, i);

		for (int i = n - 1; i > 0; i--) {
			int temp = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = temp;
			trocas++;

			heapify(vetor, i, 0);
		}
	}
}