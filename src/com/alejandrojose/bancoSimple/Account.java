package com.alejandrojose.bancoSimple;

class Accounts {
	
	String  cliente_nombre;
	int cuenta_n;
	double balance = 5000;
	String tipo_de_cuenta;
	int retirar;
	int depositar;
	
	//Method to show Account Information
	void mostrar_cuenta() {
		cliente_nombre = "Alejandro";
		cuenta_n = 1234567890;
		tipo_de_cuenta = "Cuenta de Ahorros";
		System.out.println("Nombre del Cliente: " + cliente_nombre);
		System.out.println("Numero de cuenta : " + cuenta_n);
		System.out.println("Balance : " + balance);
		System.out.println("Tipo de Cuenta : " + tipo_de_cuenta);
		
	}
	
	//Method for update Balance
	void ActualizarBalance() {
		System.out.println("Balance Actualizado : " +  balance);
	}
}