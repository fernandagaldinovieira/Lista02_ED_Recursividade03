package view;

import controller.TotalParesController;

public class Principal {

	public static void main(String[] args) {

		TotalParesController totalParesController = new TotalParesController();
		
		int par = 0;
		int [] vet = {5, 2, 4, 7, 9, 8};
		int tamanho = 6;
		
		int resultado = totalParesController.Pares(vet, tamanho, par);
		System.out.println("A quantidade de números pares existentes no vetor é de: " + resultado);
	}

}
