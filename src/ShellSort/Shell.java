package ShellSort;

public class Shell {
    public static long comparacoes;
    public static long trocas;

    public static void shellSort(int[] vetor) {
        int n = vetor.length;
        comparacoes = 0;
        trocas = 0;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            
            for (int i = gap; i < n; i++) {
                int chave = vetor[i];
                int j = i;

                while (j >= gap) {
                    comparacoes++;
                    if (vetor[j - gap] > chave) {
                        vetor[j] = vetor[j - gap];
                        trocas++;
                        j -= gap;
                    } else {
                        break;
                    }
                }
                vetor[j] = chave;
                trocas++;
            }
        }
    }
}