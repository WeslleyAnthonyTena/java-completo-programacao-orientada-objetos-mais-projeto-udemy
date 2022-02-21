package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();
		
		//1 parte

		System.out.println("Quantos funcionarios serão registrado?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ": ");
			
			System.out.println("ID: ");
			int id = sc.nextInt();
			while (temId(list, id)) {
				System.out.println("Id já existe. Tente novamente: ");
				id = sc.nextInt();
			}
			
			System.out.println("Nome funcionário: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salario funcionário: ");
			double salario = sc.nextDouble();
			list.add(new Funcionario(id, nome, salario));
		}
		
		//2 parte
		
		System.out.println();
		System.out.println("Entre com o funcionário que terá aumento: ");
		int id = sc.nextInt();
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (func == null) {
			System.out.println("Id não existe!");
		}else {
			System.out.println("Entre com o percentual: ");
			double percentual = sc.nextDouble();
			func.aumSalario(percentual);
		}
		
		//3 parte
		
		System.out.println();
		System.out.println("Lista de funcionários: ");
		for (Funcionario funcionario : list) {
			System.out.println(funcionario);
		}
		
		sc.close();

	}

	public static boolean temId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
		
	}

}
