package application;

import java.util.Scanner;

import entities.Aluguel;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aluguel[] aluguel = new Aluguel[10];

		int n = sc.nextInt();

		for (int i = 0; i < aluguel.length; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			aluguel[quarto] = new Aluguel(name, email);
		}

		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i < 10; i++) {
			if (aluguel[i] != null) {
				System.out.println(i + ": " + aluguel[i]);
			}

		}

		sc.close();

	}

}
