package calculadoraSOA;

import java.util.*;

public class Calculadora {
	private double valor1;
	private double valor2;
	private double saida;
	List<ServicoInterface> servicos = new ArrayList<>();
	
	
	public double calcular(String operacao) {
		for(ServicoInterface si:servicos) {
			if(si.operacaoE(operacao)) {
				si.setValorInput1(valor1);
				si.setValorInput2(valor2);
				return si.calcular();
			}

		}
		return 0;
	}
	
	public void addServico(ServicoInterface servico) {
		servicos.add(servico);
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
	public double getSaida() {
		return saida;
	}
	public void setSaida(double saida) {
		this.saida = saida;
	}
	public boolean operacaoE(String operacao) {
		if(operacao.equals(operacao)) {
			return true;
		}
		return false;
	}
	
}
