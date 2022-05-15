package telas;

public class Operacoes {
	double resultado;

	public Operacoes() {
		// TODO Auto-generated constructor stub
	}

	public double soma(double numA, double numB) {
		resultado = numA + numB;
		return resultado;
	}

	public double subtrai(double numA, double numB) {
		resultado = numA - numB;
		return resultado;
	}

	public double divide(double numA, double numB) {
		resultado = numA / numB;
		return resultado;
	}

	public double multiplica(double numA, double numB) {
		resultado = numA * numB;
		return resultado;
	}
}
