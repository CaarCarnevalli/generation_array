package generation_array;

import java.util.Scanner;

public class ExercicioVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = new int[10];
		int x, coluna = 0, posicao = -1;

		vetor[0] = 2;
		vetor[1] = 5;
		vetor[2] = 1;
		vetor[3] = 3;
		vetor[4] = 4;
		vetor[5] = 9;
		vetor[6] = 7;
		vetor[7] = 8;
		vetor[8] = 10;
		vetor[9] = 6;

		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o numero que voce deseja encontrar: ");
		x = leia.nextInt();

		for (int i = 0; i < 10; i++)

		{
			if (x == vetor[i]) {

				System.out.print("O número " + x + " localizado na posição: " + i);
				break;

			} else {
				System.out.println("O número " + x + " Não foi encontrado: ");
				break;
			}

		}
		
		leia.close();
	}

}
