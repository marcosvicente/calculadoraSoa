package calculadoraSOA;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora1 = new Calculadora();
		ServicoInterface servico01 = new Somar();
		
		calculadora1.addServico(servico01);
		calculadora1.setValor1(2);
		calculadora1.setValor2(3);
		double soma = calculadora1.calcular("Somar");
		System.out.printf("Soma "+ soma);
		
		System.out.printf("\n\n");

		Calculadora calculadora2 = new Calculadora();
		ServicoInterface servico02 = new Sub();
		
		calculadora2.addServico(servico02);
		calculadora2.setValor1(8);
		calculadora2.setValor2(4);
		double sub = calculadora2.calcular("Subtrair");
		System.out.printf("Subtrair "+ sub);
		
		
		System.out.printf("\n\n");

		Calculadora calculadora3 = new Calculadora();
		ServicoInterface servico03 = new Mult();
		
		calculadora3.addServico(servico03);
		calculadora3.setValor1(8);
		calculadora3.setValor2(4);
		double mult = calculadora3.calcular("Multiplicar");
		System.out.printf("Multiplicar "+ mult);
		
		System.out.printf("\n\n");

		Calculadora calculadora4 = new Calculadora();
		ServicoInterface servico04 = new Divi();
		
		calculadora4.addServico(servico04);
		calculadora4.setValor1(210);
		calculadora4.setValor2(10);
		double div = calculadora4.calcular("Dividir");
		System.out.printf("Dividir "+ div);
	}

}
