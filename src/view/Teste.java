package view;

import helper.Utils;
import model.Cliente;
import model.Conta;

public class Teste {

	public static void main(String[] args) {
		

		Cliente eduardo = new Cliente(
				"Eduardo Lima",
				"edu@gmail.com",
				"111.222.333.12",
				Utils.stringParaDate("14/02/1997")
				);
		
		Cliente ana = new Cliente(
				"Ana Clara",
				"ana@gmail.com",
				"333.444.555.34",
				Utils.stringParaDate("22/11/2001")
				);
		
	//	System.out.println(eduardo + "\n/////////////////////");
	//	System.out.println(ana);
		
		Conta c101 = new Conta(eduardo);
		Conta c102 = new Conta(ana);
		
		
		//Depositando um valor positivo
		c101.depositar(500.00);
		c102.depositar(500.00);
		
		//Depositando um valor 0
		//c101.depositar(0.00);
		//c102.depositar(0.00);
		
		//Depositando um valor negativo
		//c101.depositar(-500.00);
		//c102.depositar(-500.00);
		
		
		//Tentando sacar valor no saldo suficiente
		//c101.sacar(300.00);
		
		//Tentando sacar valor 0
		//c101.sacar(0.00);
		
		//Tentando sacar valor negativo
		//c101.sacar(-50.00);
		
		//Setando um LIMITE para a c101
		c101.setLimite(200.00);
		
		//Tentando sacar um valor maior que o saldo
		//c101.sacar(600.00);
		
		//realizando transferencia
		c101.transferir(c102, 100.0);
		
		
		
		
		System.out.println(c101);
		System.out.println();
		System.out.println(c102);

	}

}













