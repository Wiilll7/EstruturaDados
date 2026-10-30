package busca;

public class ExemploBuscaSequencial {

	public static int buscaSequencial(int[] array, int valorProcurado) {
		for(int i = 0; i < array.length; i++) {
			if (array[i] == valorProcurado) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] numeros = {18, 7, 25, 3, 12, 30, 9};
		int valorProcurado = 12;
		
		int posicao = buscaSequencial(numeros, valorProcurado);
		
		if (posicao != -1) {
			System.out.println("Valor encontrado no indice: "+posicao);
		} else {
			System.out.println("Valor nao econtrado.");
		}
		
	}

}
