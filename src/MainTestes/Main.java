package MainTestes;

import java.util.Arrays;

import BubbleSort.Bolha;
import InsertionSort.Insertion;
import QuickSort.Quick;
import MergeSort.MergeSort;
import SelectionSort.Selecao;

public class Main {
	
	public static int[] gerarOrdenado(int tamanho) {
	    int[] v = new int[tamanho];
	    for (int i = 0; i < tamanho; i++) v[i] = i;
	    return v;
	}

	public static int[] gerarInvertido(int tamanho) {
	    int[] v = new int[tamanho];
	    for (int i = 0; i < tamanho; i++) v[i] = tamanho - i;
	    return v;
	}

	public static int[] gerarAleatorio(int tamanho) {
	    int[] v = new int[tamanho];
	    java.util.Random random = new java.util.Random();
	    for (int i = 0; i < tamanho; i++) v[i] = random.nextInt(tamanho * 10);
	    return v;
	}

	public static void main(String[] args) {

		int tamanho = 1000;
		int[] dadosOriginais = gerarAleatorio(tamanho);
//		System.out.println("Array original" + Arrays.toString(dadosOriginais) + "\n");

		int[] vetorBubble = dadosOriginais.clone();
		long inicioBubble = System.currentTimeMillis();
		Bolha.bubbleSort(vetorBubble);
		long fimBubble = System.currentTimeMillis();
		long tempoBubble = fimBubble - inicioBubble;
//		System.out.println("Ordenado:" + Arrays.toString(vetorBubble) + "\n");
		System.out.println("Tempo do Bubble: " + tempoBubble + "ms \n");

		int[] vetorSelection = dadosOriginais.clone();
		long inicioSelection = System.currentTimeMillis();
		Selecao.selectionSort(vetorSelection);
		long fimSelection = System.currentTimeMillis();
		long tempoSelection = fimSelection - inicioSelection;
//		System.out.println("Selection sort " + Arrays.toString(vetorSelection) + "\n");
		System.out.println("Tempo do Selection: " + tempoSelection + "ms \n");

		int[] vetorInsertion = dadosOriginais.clone();
		long inicioInsertion = System.currentTimeMillis();
		Insertion.insertionSort(vetorInsertion);
		long fimInsertion = System.currentTimeMillis();
		long tempoInsertion = fimInsertion - inicioInsertion;
//		System.out.println("Insertion sort " + Arrays.toString(vetorInsertion) + "\n");
		System.out.println("Tempo do Insertion: " + tempoInsertion + "ms \n");
		
		int[] vetorQuick = dadosOriginais.clone();
		long inicioQuick = System.currentTimeMillis();
		Quick.quickSort(vetorQuick);
		long fimQuick = System.currentTimeMillis();
		long tempoQuick = fimQuick - inicioQuick;
//		System.out.println("Quick sort "+ Arrays.toString(vetorQuick) + "\n");
		System.out.println("Tempo do Quick: " + tempoQuick + "ms \n");
		
		int[] vetorMerge = dadosOriginais.clone();
		long inicioMerge = System.currentTimeMillis();
		MergeSort.mergeSort(vetorMerge);
		long fimMerge = System.currentTimeMillis();
		long tempoMerge = fimMerge - inicioMerge;
//		System.out.println("Merge sort "+ Arrays.toString(vetorMerge) + "\n");
		System.out.println("Tempo do Merge: " + tempoMerge + "ms \n");
	}

}