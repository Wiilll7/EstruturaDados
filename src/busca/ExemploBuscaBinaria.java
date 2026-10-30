package busca;

public class ExemploBuscaBinaria {

	public static int buscaBinaria(int[] array, int valorProcurado) {
		int inicio = 0;
		int fim = array.length-1;
		
		while(inicio <= fim) {
			int meio = inicio + (fim - inicio)/2;
			
			if (array[meio] == valorProcurado) {
				return meio;
			}
			
			if (valorProcurado > array[meio]) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[]args) {
		
		int[] numeros = {3, 7, 9, 12, 18, 25, 30};
		int valorProcurado = 25;
		
		int posicao = buscaBinaria(numeros, valorProcurado);
		
		if (posicao != -1) {
			System.out.println("Valor encontrado na posicao: "+posicao);
		} else {
			System.out.println("Valor nao econtrado.");
		}
		
	}
	
}
