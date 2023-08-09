package generation_array;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[][] x = new float[10][4];
		float media[] = new float[10];
		float soma[] = new float[10];
		int aluno, nota;
		
		Scanner leia = new Scanner(System.in);

		for (aluno = 0; aluno < 10; aluno++) {
			for (nota = 0; nota < 4; nota++) {
				System.out.println("Digite a " + (nota + 1) + "º" + " nota do aluno: " + (aluno + 1));
				x[aluno][nota] = leia.nextFloat();
				soma[aluno] += x[aluno][nota];
			}
		}
		System.out.println("As medias são: ");

		for (aluno = 0; aluno < 10; aluno++) {
			media[aluno] = soma[aluno] / 4;
			System.out.printf("[%.1f]", media[aluno]);

		}

	}

}
