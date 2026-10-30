
package ordenacao_dados.bubble_sort;

import java.util.Arrays;
import java.util.Random;

public class OrdenacaoQuadratica {
/*
	// 1. BUBBLE SORT
	public static void bubbleSort(int[] array, MetricasOrdenacao mo) {
		
		int n = array.length;
		boolean trocou;
		
		for (int i = 0; i < n - 1; i++) {
			trocou = false;
			
			for (int j = 0; j < n-1-i; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					trocou = true;
					mo.setTrocas(mo.getTrocas()+1);	
				}
				mo.setComparacoes(mo.getComparacoes()+1);
			}
			
			if (!trocou) {
				break;
			}
		}
		
	}
	
	// 2. Selection Sort
	public static void selectionSort(int[] array, MetricasOrdenacao mo) {
		int n = array.length;
		
		for (int i = 0; i < n-1; i++) {
			int indiceMenor = i;
			
			// Busca menor elemento na parte nao ordenada
			for (int j = i; j < n; j++) {
				if (array[j] < array[indiceMenor]) {
					indiceMenor = j;
				}
				mo.setComparacoes(mo.getComparacoes()+1);
			}
			
			if (indiceMenor != i) {
				int temp = array[i];
				array[i] = array[indiceMenor];
				array[indiceMenor] = temp;
				mo.setTrocas(mo.getTrocas()+1);
			}
			mo.setComparacoes(mo.getComparacoes()+1);
		}
	}
	
	// Insersion Sort
	public static void insersionSort(int[] array, MetricasOrdenacao mo) {
		int n = array.length;
		
		for (int i = 0; i < n; i++) {
			int chave = array[i];
			int j = i-1;
			while (j>=0 && array[j] > chave) {
				array[j+1] = array[j];
				j--;
				mo.setComparacoes(mo.getComparacoes()+1);
				mo.setTrocas(mo.getTrocas()+1);
			}
			mo.setComparacoes(mo.getComparacoes()+1);
			mo.setTrocas(mo.getTrocas()+1);
			array[j+1] = chave;
		}
		
	}
	
	public static void organizarPrimeiros(int[] array, int k) {
		for (int i = 0; i < k; i++) {
			int indiceMenor = i;
			
			// Busca menor elemento na parte nao ordenada
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[indiceMenor]) {
					indiceMenor = j;
				}
			}
			
			if (indiceMenor != i) {
				int temp = array[i];
				array[i] = array[indiceMenor];
				array[indiceMenor] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// Array original desordenado
		Random r = new Random();
		int[] vetorBubble = new int[100];
		for (int i = 0; i < 100; i++) {
			vetorBubble[i] = r.nextInt(1, 999);
		}
		MetricasOrdenacao mo1 = new MetricasOrdenacao();
		MetricasOrdenacao mo2 = new MetricasOrdenacao();
		MetricasOrdenacao mo3 = new MetricasOrdenacao();
		
		System.out.println("Array Original: "+Arrays.toString(vetorBubble)+"\n");
<<<<<<< Updated upstream
=======
		
>>>>>>> Stashed changes
		int[] vetorSelection = vetorBubble.clone();
		int[] vetorInsersion = vetorBubble.clone();
		bubbleSort(vetorBubble, mo1);
		selectionSort(vetorSelection, mo2);
		insersionSort(vetorInsersion, mo3);
		System.out.println("Bubble Sort: "+Arrays.toString(vetorBubble)+"\n");
		System.out.println("Comparacoes: "+mo1.getComparacoes()+", Trocas: "+mo1.getTrocas());
		System.out.println("Selection Sort: "+Arrays.toString(vetorSelection)+"\n");
		System.out.println("Comparacoes: "+mo2.getComparacoes()+", Trocas: "+mo2.getTrocas());
		System.out.println("Insersion Sort: "+Arrays.toString(vetorInsersion)+"\n");
		System.out.println("Comparacoes: "+mo3.getComparacoes()+", Trocas: "+mo3.getTrocas());
		
		organizarPrimeiros(vetorBubble, 10);
		System.out.println(Arrays.toString(vetorBubble)+"\n");
	}
*/
}
