package com.example.marciano;

import java.util.Scanner;

public class Robo extends RoboAvancado  {

	String responda(String phrase) {

		String trimmedPhrase = phrase.trim();

		if (trimmedPhrase.isEmpty()) return("Marciano: - Não me incomode!\n");
		if (isUpper(trimmedPhrase) && trimmedPhrase.endsWith("?")) return("Marciano: - Relaxa, eu sei o que estou fazendo\n");
		if(trimmedPhrase.startsWith("eu") || trimmedPhrase.startsWith("Eu") ) return("Marciano: - A responsabilidade é sua\n");
		if (isUpper(trimmedPhrase)) return("Marciano: - Opa! Calma aí!\n");
		if (trimmedPhrase.endsWith("?")) return("Marciano: - Certamente!\n");

		if(trimmedPhrase.toUpperCase().equals("SOME") || trimmedPhrase.toUpperCase().equals("SUBTRAIA") || trimmedPhrase.toUpperCase().equals("MULTIPLIQUE") || trimmedPhrase.toUpperCase().equals("DIVIDA")) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Marciano: - Digite o primeiro valor");
			Double valor1 = scanner.nextDouble();
			System.out.println("Marciano: - Digite o segundo valor");
			Double valor2 = scanner.nextDouble();
			return("Marciano: -  Essa eu sei:  " + calculo(trimmedPhrase, valor1, valor2)+"\n");
		}

		if(trimmedPhrase.toUpperCase().equals("AGIR")) {

			//agir();
			return("Marciano: - É pra já!");
		}
		return("Marciano: -Tudo bem.\n");
	}

	boolean isUpper(String s) {
		return s.chars().anyMatch(Character::isLetter) && s.equals(s.toUpperCase());
	}

}

