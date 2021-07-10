package calculadoraSOA;

public class Divi implements ServicoInterface{
	private double valor1;
	private double valor2;
	String operacao = "Dividir";
	
	@Override
	public double calcular() {
		return getValor1() / getValor2();			
	}
	
	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	
	public boolean operacaoE(String operacao) {
		if(this.operacao.equals(operacao)) {
			return true;
		}
		return false;
	}

	@Override
	public void setValorInput1(double valorInput1) {
		this.valor1 = valorInput1;
	}

	@Override
	public void setValorInput2(double valorInput2) {
		// TODO Auto-generated method stub
		this.valor2 = valorInput2;

	}
}
