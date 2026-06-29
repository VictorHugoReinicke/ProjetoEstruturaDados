package BubbleSort;

public class Bolha {

	public static long trocas;
	public static long comparacoes;

	// Ctrl+C Ctrl+V do que o professor passou na sala
	public static void bubbleSort(int[] vetor) {
		int n = vetor.length;
		boolean trocou;

		trocas = 0;
		comparacoes = 0;

		for (int i = 0; i < n - 1; i++) {
			trocou = false;
			for (int j = 0; j < n - 1 - i; j++) {
				comparacoes += 1;
				if (vetor[j] > vetor[j + 1]) {
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
					trocou = true;
					trocas += 1;
				}

			}
			if (!trocou) {
				break;
			}
		}
	}

}
