package MainTestes;

import java.util.Arrays;

import BubbleSort.Bolha;
import InsertionSort.Insertion;
import QuickSort.Quick;
import MergeSort.MergeSort;
import SelectionSort.Selecao;

public class Main {

	public static void main(String[] args) {

		// ARRAY ORIGINAL DESORDENADO
		int[] dadosOriginais = { 8, 3, 41, 23, 1, 67, 9, 54, 39, 12, 45, 67 };
		System.out.println("Array original" + Arrays.toString(dadosOriginais) + "\n");

		int[] vetorBubble = dadosOriginais.clone();
		Bolha.bubbleSort(vetorBubble);
		System.out.println("Ordenado:" + Arrays.toString(vetorBubble) + "\n");

		int[] vetorSelection = dadosOriginais.clone();
		Selecao.selectionSort(vetorSelection);
		System.out.println("Selection sort " + Arrays.toString(vetorSelection) + "\n");

		int[] vetorInsertion = dadosOriginais.clone();
		Insertion.insertionSort(vetorInsertion);
		System.out.println("Insertion sort " + Arrays.toString(vetorInsertion) + "\n");
		
		int[] vetorQuick = dadosOriginais.clone();
		Quick.quickSort(vetorQuick);
		System.out.println("Quick sort "+ Arrays.toString(vetorQuick) + "\n");
		
		int[] vetorMerge = dadosOriginais.clone();
		MergeSort.mergeSort(vetorMerge);
		System.out.println("Merge sort "+ Arrays.toString(vetorMerge) + "\n");
	}

}
