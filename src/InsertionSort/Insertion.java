package InsertionSort;

public class Insertion {
	public static long trocas;
	public static long comparacoes;

	// Inserção copiada da aula
	public static void insertionSort(int[] vetor) {
		int n = vetor.length;

		comparacoes = 0;
		trocas = 0;

		for (int i = 1; i < n; i++) {
			int chave = vetor[i];
			int j = i - 1;

			while (j >= 0 && vetor[j] > chave) {
				comparacoes++;
				if (vetor[j] > chave) {
		            vetor[j + 1] = vetor[j];
		            trocas++;
		            j--;
		        } else {
		            break;
		        }
			}
			vetor[j + 1] = chave;
			trocas++;
		}
	}

}
