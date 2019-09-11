package com.alejandrojose.bancoSimple;

class Cuentas_Ahorros  extends Accounts{
	//Rate interest
	double tasa_interes = 2.5;
	
	//Method to count Interest and Add Interest in Balance
	void Interes_Compuesto(){
		Double monto_interes = (balance*tasa_interes/100);
		System.out.println("Monto de Inters : " + monto_interes);
		balance += monto_interes;
		ActualizarBalance();
	}
	
	/**@param Method for Retirar in saving Account
	 * 
	 */
	void Retirar(int monto_retirar) {
		if(balance > 0) {
			retirar = monto_retirar;
			balance -= retirar;
			ActualizarBalance();
		}
		else
		{
			System.out.println("Tu no tienes Dinero, no puedes Retirar");
		}	
	}
	
	void Depositar(int monto_despositar) {
		depositar = monto_despositar;
		balance += depositar;
		ActualizarBalance();
	}		
}
