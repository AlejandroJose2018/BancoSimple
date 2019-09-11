package com.alejandrojose.bancoSimple;

class Cuentas_Corrientes  extends Accounts{
	
	//Method for WithDraw in Current Account
	
	void Retirar(int monto_retirar) {
		if(balance  > 0 )
		{
			monto_retirar = retirar;
			balance -= monto_retirar;
			min_bal_check();
		}else {
			System.out.println("There is not money, you can not withdraw.");
		}
	}
	
	//Method for deposit in current Account
	void Depositar(int depo_monto) {
		depositar = depo_monto;
		balance += depositar;
		ActualizarBalance();
	}
	
	double min_balance = 100;
	double exchange_fees =10;
	
	//Method to check minimum Balance
	void min_bal_check() {
		if(balance< min_balance) {
			System.out.println("Tu Blance de tu cuenta es menor  al minimo");			
		}else {
			balance -= exchange_fees;
			ActualizarBalance();
		}
	}
	
}