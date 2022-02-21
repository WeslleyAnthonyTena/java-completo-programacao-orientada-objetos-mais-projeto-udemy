package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdProduto = sc.nextInt();
		Produto[] produto = new Produto[qtdProduto];
		
		for (int i=0; i<produto.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			produto[i] = new Produto(nome, preco);			
		}
		
		double soma = 0.0;
		for (int i=0; i<produto.length; i++) {
			soma += produto[i].getPreco();
		}

		double media = soma / produto.length;
		System.out.printf("A média do preço dos produtos é: %.2f%n", media);
	}

}
