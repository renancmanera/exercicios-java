package projeto;

import java.util.Scanner;

	public class olaMundo {
	
		public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String candidato1, candidato2, candidato3;
		int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0;
		int votacao = 0, totalVotos = 0, maiorVotacao = 0;
		
		System.out.println("Nome Candidato 1");
		candidato1 = scanner.nextLine();
		
		System.out.println("Nome Candidato 2");
		candidato2 = scanner.nextLine();
		
		System.out.println("Nome Candidato 3");
		candidato3 = scanner.nextLine();
		
		do {
			
			System.out.println("Digite o seu voto:");
			votacao = scanner.nextInt();
		
			switch (votacao) {
			case 1:
				votosCandidato1++;
				totalVotos++;
				break;
       
			case 2:
				votosCandidato2++;
				totalVotos++;
				break;
       
			case 3:
				votosCandidato3++;
				totalVotos++;
				break;
        
			default:
				if(votacao != 0) {
					System.out.println("Voto inválido!");
				}
			}
		
		} while (votacao != 0);
		
		System.out.println("Total votos da eleição: " + totalVotos );
		System.out.println(candidato1 + " - " + votosCandidato1 + " votos!" );
		System.out.println(candidato2 + " - " + votosCandidato2 + " votos!" );
		System.out.println(candidato3 + " - " + votosCandidato3 + " votos!" );
		
		maiorVotacao = votosCandidato1;

		if(votosCandidato2 > maiorVotacao) {
			maiorVotacao = votosCandidato2;
		}
		
		if(votosCandidato3 > maiorVotacao) {
			maiorVotacao = votosCandidato3;
		}
		
		System.out.print("Candidato vencedor da eleição: ");
		
		if(votosCandidato1 == maiorVotacao) {
			System.out.println(candidato1 + " com " + votosCandidato1 + " votos!");
		}
		if(votosCandidato2 == maiorVotacao) {
			System.out.println(candidato2 + " com " + votosCandidato2 + " votos!");
		}
		if(votosCandidato3 == maiorVotacao) {
			System.out.println(candidato3 + " com " + votosCandidato3 + " votos!");
		}
		
		}
	}
