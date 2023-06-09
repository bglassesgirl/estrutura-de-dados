package principal;

import java.util.Scanner;

import servicos.JogoDaVelha;

public class MainJogoDaVelha {
	  public static void main(String[] args) {
	        
Scanner in = new Scanner(System.in);	  
	   
	   char[][] tab = new char[3][3];
	   char jogador = 'X';
	   boolean gameOver = false;
	   JogoDaVelha jv = new JogoDaVelha();
	
           System.out.println(" -- Jogo da Velha -- ");
           System.out.println("            ------            ");
           System.out.println(" - regras do jogo: \n"
       		           + "() escolha um jogador (x or o);\n"
       		           + "() seu objetivo é fechar uma linha, coluna ou um cruzamento \n"
       		           + "() o primeiro jogador que fechar um dos itens mencionados acima, ganha;)\n"
       		           + "() seja bem vindo(a), boa sorte!\n"
       		           + "---------------------------------------\n");
	   
	   for (int l = 0; l < tab.length; l++) {
		  for (int c = 0; c < tab[l].length; c++) {
			tab[l][c] = ' ';	
		}
	  }
		
	  
	   while(!gameOver) {
		   jv.printTab(tab);
		   System.out.println("\nJogador " + jogador + " , jogue entre 1-3 para linha,\n"
		   		+ "e de 1-3 para coluna, conforme a jogada desejada: ");
		   int linha = in.nextInt() - 1;
		   int coluna = in.nextInt() -1 ;
		   
		   if (tab[linha][coluna] == ' ') {
			tab[linha][coluna] = jogador;
			gameOver = jv.hasWon(tab, jogador);
			
			if(gameOver) {
				 System.out.println("Jogador " + jogador + "  , ganhou!! ");
			}else {
				jogador = (jogador == 'X')? 'O' : 'X';
			}
		}else {
			System.out.println("Movimento inválido. Tente de novo.");
		}
	   }
		   
		  jv.printTab(tab);
	   
	   
   }
	    
}
