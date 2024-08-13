package controller;

public class TotalParesController {

	public TotalParesController() {
		super();
	}

	public int Pares(int [ ]vet, int tamanho, int par) {
		if (tamanho == 0) {
			return par;
			
		}
		
		if (vet[tamanho - 1] % 2 == 0) {
			par = par + 1; 
		}
		return Pares(vet, tamanho - 1, par);
	}
}
