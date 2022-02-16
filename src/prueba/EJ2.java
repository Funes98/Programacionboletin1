package prueba;

public class EJ2 {
	private double saldo;
	private int numIngresos;
	private int numReintegros;
	public Cuenta() {}
	public Cuenta(double saldoInicial) {
		this.saldo = saldo;
		setsaldo(saldoInicial);
		
	}
	private double getSaldo() {
		return saldo;
	}
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	private int getNumIngresos() {
		return numIngresos;
	}
	private void setNumIngresos(int numIngresos) {
		this.numIngresos = numIngresos;
	}
	private int getNumReintegros() {
		return numReintegros;
	}
	private void setNumReintegros(int numReintegros) {
		this.numReintegros = numReintegros;
	}

}
