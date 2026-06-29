package BubbleSort;

public class Bolha {
	//Ctrl+C Ctrl+V do que o professor passou na sala
	public static void bubbleSort(int[] vetor) {
		int n = vetor.length;
		boolean trocou;

		for (int i = 0; i < n - 1; i++) {

			trocou = false;
			for (int j = 0; j < n - 1 - i; j++) {

				if (vetor[j] > vetor[j + 1]) {
					int temp = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = temp;
					trocou = true;
				}

			}
			if (!trocou) {
				break;
			}
		}
	}
	
}
