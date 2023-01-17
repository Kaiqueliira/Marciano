package com.example.marciano;

public class RoboAvancado {

	 String calculo(String operador, Double primeiroValor, Double segundoValor) {

		if (operador.equals("some")) {
			double resultado = primeiroValor + segundoValor;
			return "Marciano: -  Essa eu sei:  " +String.valueOf(resultado);
		}
		if (operador.equals("subtraia")) {
			double resultado = primeiroValor - segundoValor;
			return "Marciano: -  Essa eu sei:  " +String.valueOf(resultado);
		}
		if (operador.equals("multiplique")) {
			double resultado = primeiroValor * segundoValor;
			return "Marciano: -  Essa eu sei:  " +String.valueOf(resultado);
		}
		if (operador.equals("divida")) {
			double resultado = primeiroValor / segundoValor;
			return "Marciano: -  Essa eu sei:  " +String.valueOf(resultado);
		} 

		return "Valor inválido";

	}

}
