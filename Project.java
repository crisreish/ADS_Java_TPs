package Cadastro_Escolar;

import java.util.Scanner;

public class Project {

	private static String[] nome;
	private static double[]	nota1;
	private static double[]	nota2;
	private static final int TAMANHO = 2;
	private static int posicao;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int i = sc.nextInt();	
		

		nome = new String[TAMANHO];
		nota1 = new double[TAMANHO];
		nota2 = new double[TAMANHO];
		String opcao = null;
		
		do {
			
			System.out.println("[1] Registrar as notas de novo aluno.");
			System.out.println("[2] Consultar boletim de um aluno.");
			System.out.println("[3] Consultar notas da turma.");
			System.out.println("[4] Sair.");
			System.out.println("Informe a opcao desejada: ");
			opcao = sc.next();
			
			switch (opcao) {
			case "1":
				if(posicao<TAMANHO) {
					System.out.println("Informe teu nome: ");
					nome[posicao] = sc.next();
					System.out.println("Informe tua primeira nota: ");
					nota1[posicao] = sc.nextDouble();
					System.out.println("Informe tua segunda nota: ");
					nota2[posicao] = sc.nextDouble();
					System.out.println("Aluno cadastrado na posicao: " + posicao);
					posicao++;
				}else {
					System.out.println("A lista esta completa");
				}
				break;
				
			case "2":
				System.out.println("Informe a posicao desejada: ");
				int pos = sc.nextInt();
				
				if(pos>0 && pos<posicao) {
					imprimir(pos);
				}else {
					System.out.println("Aluno nao cadastrado!");
				}
				break;
				
			case "3":
				if (posicao!=0) {
					imprimir();
				}else {
					System.out.println("Boletim nao cadastrado!");
				}
				
			break;
			
			case "4":
				System.out.println("Opcoes encerradas!");
				break;
			
			default:
				System.out.println("Opcao invalida, favor, escolher uma das opcoes anteriores!");
			break;
			
			}
			
		}while(!opcao.equals("4"));
		
		sc.close();

	}
		
		private static void imprimir(int pos) {
		
		
	}

		private static double media(int pos) {
			return (nota1[pos]+nota2[pos])/2;
		}
		
		private static void imprimir () {
			System.out.println("Boletim dos alunos.");
			for (int i=0;i<posicao;i++) {
			imprimir( i);
			}		
		}
		
		private static String situacao(double media) {
			if(media<4) {
				return "Aluno Reprovado!";
			}else if(media>=7) {
				return "Aluno Aprovado!";
			}else {
				return "Aluno em Prova Final!";
			}
				
		}
		
}
