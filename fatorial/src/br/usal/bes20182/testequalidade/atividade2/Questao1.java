package br.usal.bes20182.testequalidade.atividade2;

import java.util.Scanner;

public class Questao1 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Integer a;
		Long res;

		a = obiterNumero();

		res = calcularFatorial(a);

		imprimirFatorial(res, a);
	}

	public static long calcularFatorial(Integer n) {

		if (n <= 1) {
			return 1;
		} else {
			return calcularFatorial(n - 1) * n;
		}
	}

	public static void imprimirFatorial(Long fat, Integer n) {
		System.out.println("O resultado do fatorial de " + n + " foi: " + fat);

	}

	public static Integer obiterNumero() {
		Integer n;
		int conf = 0;
		do {
			System.out.println("Informe um número entre 0 e 100");
			n = sc.nextInt();
			if (n >= 0 && n <= 100) {
				conf = 1;
			} else {
				System.out.println("Numero informado fora do intervalo");
			}
		} while (conf == 0);
		return n;
	}
}
