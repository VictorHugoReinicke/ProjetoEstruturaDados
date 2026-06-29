package BubbleSort;

public class Bolha {
	//Ctrl+C Ctrl+V do que o professor passou na sala
	public static void bubbleSort(int[] vetor,int limite) {
		
		boolean trocou;

		for (int i = 0; i < limite - 1; i++) {

			trocou = false;
			for (int j = 0; j < limite - 1 - i; j++) {

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
