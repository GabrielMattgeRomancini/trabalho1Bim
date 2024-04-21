
package br.unipar.trabalho1;
import br.unipar.trabalho1.vetor.OrdenacaoBolha;
import br.unipar.trabalho1.vetor.OrdenacaoInsercao;
import br.unipar.trabalho1.vetor.OrdenacaoSelecao;
import br.unipar.trabalho1.vetor.Ordenador;
import br.unipar.trabalho1.vetor.Vetor;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author gabri
 */
public class Trabalho1 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();
        Vetor vetor = new Vetor(tamanho);
        int[] vetorOriginal = new int[tamanho];  // Armazena uma cópia do vetor original

        System.out.println("Digite os elementos do vetor (um por linha):");
        for (int i = 0; i < tamanho; i++) {
            int valor = scanner.nextInt();
            vetor.setElemento(i, valor);
            vetorOriginal[i] = valor;  // Copiando o elemento para o vetor original
        }

        Ordenador ordenador = null;
        int metodo;
        do {
            System.out.println("Selecione o método de ordenação:");
            System.out.println("1 - Inserção");
            System.out.println("2 - Seleção");
            System.out.println("3 - Bolha");
            metodo = scanner.nextInt();
            switch (metodo) {
                case 1:
                    ordenador = new OrdenacaoInsercao();
                    break;
                case 2:
                    ordenador = new OrdenacaoSelecao();
                    break;
                case 3:
                    ordenador = new OrdenacaoBolha();
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione 1, 2 ou 3.");
                    ordenador = null;
            }
        } while (ordenador == null);  // Continua até uma opção válida ser escolhida

        long startTime = System.nanoTime();
        ordenador.ordenar(vetor);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Converte para milissegundos

        System.out.println("Vetor ordenado:");
        for (int elem : vetor.getElementos()) {
            System.out.print(elem + " ");
        }
        System.out.println("\nTempo de execução: " + duration + "ms");

        // Exibindo o vetor original
        System.out.println("Vetor original:");
        for (int elem : vetorOriginal) {
            System.out.print(elem + " ");
        }
        System.out.println();

        scanner.close();
    }
}
