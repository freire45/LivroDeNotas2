package br.com.erickfreire.livrodenotas2;

public class Teste {

	public static void main(String[] args) {
		    int[][] arrayDeNotas = {{87, 96, 70}, 
			{68, 87, 90}, 
			{94, 100, 90}, 
			{100, 81, 82}, 
			{83, 65, 85}, 
			{78, 87, 65}, 
			{85, 75, 83},
			{91, 94, 100}, 
			{76, 72, 84}, 
			{87, 93, 73}}; 
			
			LivroDeNotas2 minhasNotas = new LivroDeNotas2(
			"T1C1 - Introdução a Programação Em Java", arrayDeNotas);
			System.out.printf("Bem vindo ao livro de notas para%n%s%n%n",
					minhasNotas.getNomeDoCuros());
			        minhasNotas.processaNotas();

	}

}
