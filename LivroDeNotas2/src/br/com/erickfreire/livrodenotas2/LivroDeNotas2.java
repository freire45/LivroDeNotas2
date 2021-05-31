package br.com.erickfreire.livrodenotas2;

/**
 * Programa em java que simula um livro de notas de alunos com matriz
 * 
 * @author Erick Freire
 * @version 1 - Criado em 31-05-2021 as 14:00
 */

public class LivroDeNotas2 {

	private String nomeDoCuros;
	private int[][] notas;

	public LivroDeNotas2(String ndc, int[][] n) {
		this.nomeDoCuros = ndc;
		this.notas = n;

	}

	public String getNomeDoCuros() {
		return nomeDoCuros;
	}

	public void setNomeDoCuros(String nomeDoCuros) {
		this.nomeDoCuros = nomeDoCuros;
	}

	public void processaNotas() {
		saidaDeNotas();

		System.out.printf("%n%s %d%n%s %d%n%n", "A menor nota é: ", obtemNotaMinima(), "A maior nota é: ",
				obtemNotaMaxima());

		geraGraficoDeBarras();
	}

	public int obtemNotaMinima() {
		int menorNota = notas[0][0];

		for (int[] notaDeEstudantes : notas) {
			for (int n : notaDeEstudantes) {
				if (n < menorNota)
					menorNota = n;
			}
		}

		return menorNota;
	}

	public int obtemNotaMaxima() {
		int maiorNota = notas[0][0];

		for (int[] notaDeEstudantes : notas) {
			for (int n : notaDeEstudantes) {
				if (n > maiorNota)
					maiorNota = n;
			}
		}

		return maiorNota;
	}

	public double obtemMedia(int[] mudaNotas) {
		int total = 0;

		for (int n : mudaNotas)
			total += n;

		return (double) total / mudaNotas.length;
	}

	public void geraGraficoDeBarras() {
		System.out.println("Distribuição Geral Das Notas: ");
		
		int[] frequencia = new int[11];
		
		for (int[] notasDeEstudante : notas) {
			for (int n : notasDeEstudante)
				++frequencia[n / 10];
		}
		
		for (int contador = 0; contador < frequencia.length; contador++) {
			if (contador == 10)
				System.out.printf("%5d: ", 100);
				else
				System.out.printf("%02d-%02d: ",contador * 10, contador * 10 + 9);
				
				for (int asteriscos = 0; asteriscos < frequencia[contador]; asteriscos++)
				System.out.print("*");
				
			System.out.println();
		}
	}
		
		public void saidaDeNotas(){
			
		   System.out.printf("As Notas São:%n%n");
		   System.out.print("                "); 
		
		   for (int teste = 0; teste < notas[0].length; teste++)
		      System.out.printf("Teste %d ", teste + 1);
		
		   System.out.println("Média"); 
		
		   for (int estudante = 0; estudante < notas.length; estudante++){
		      System.out.printf("Estudante %2d", estudante + 1);
		
		      for (int t : notas[estudante])
		         System.out.printf("%8d", t);

		      double media = obtemMedia(notas[estudante]);
		      System.out.printf("%9.2f%n", media);
		   }
		
	   }

}
