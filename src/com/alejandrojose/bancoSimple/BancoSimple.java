package com.alejandrojose.bancoSimple;

import java.util.Scanner;

public class BancoSimple extends Accounts{
	
	public static void main(String[] args) {
		
		int retirar;
		int depositar;
		Scanner sc = new Scanner(System.in);
		System.out.println("********************Tipo de la Cuenta********************");
		System.out.println("1.  Cuenta de Ahorros ");
		System.out.println("2.  Cuenta Corriente ");
		System.out.println("Ingresa Tu tipo de Cuenta : ");
		
		int Acc_Type = sc.nextInt(); //It will take input from user for Account type.

		System.out.println("********************Opciones Bancarias********************");
		System.out.println("1.  Detalles de Tu Cuenta ");
		System.out.println("2.  Depositar Dinero");
		System.out.println("3.  Retirar Dinero");
		System.out.println("4.  Mostrar Balance ");
		System.out.println("5.  Interest Compuesto ");
		System.out.println("6.  Salir ");
		
		int flag = 0;
		//Flag for Exit
		
		//Object
		
		Accounts obj1 = new Accounts();
		Cuentas_Ahorros obj2 = new Cuentas_Ahorros();
		Cuentas_Corrientes obj3 = new Cuentas_Corrientes();
		
	
		System.out.println("*******************************************************");

		do {
			System.out.println("Ingresa Una Opcion: ");
			int entrada = sc.nextInt();
			
			switch(entrada) {
			case 1:
				obj1.mostrar_cuenta();
				break;
			
			case 2://for Deposite 
				if(Acc_Type == 1) //Saving Deposite
				{
					System.out.println("Ingresa La cantidad a Depositar ");
					depositar= sc.nextInt();
					obj2.Depositar(depositar);
					break;
				}
				else  //Current Deposite
				{
					System.out.println("Ingresa La cantidad a Depositar ");
					depositar = sc.nextInt();
					obj3.Depositar(depositar);
					break;
				}
			case 3://for withdraw
				if(Acc_Type == 1) //Saving Withdraw
				{
					System.out.println("Ingresa el Monto que tu quieres Retirar");
					retirar = sc.nextInt();
					obj2.Retirar(retirar);
					break;
				}
				else //current withdraw
				{
					System.out.println("Ingresa el Monto que tu quieres Retirar");
					retirar = sc.nextInt();
					obj3.Retirar(retirar);
					break;
				}
			case 4: //Update Balance
				if(Acc_Type == 1) //update balance for saving
				{
					obj2.ActualizarBalance();
					break;
				}
				else //update balance for current
				{
					obj3.ActualizarBalance();
					break;
				}
			case 5: //Interest for Saving Account only
				obj2.Interes_Compuesto();
				break;
			case 6:
				System.out.println("Bye Bye . Gracias Por Confiar en Nosotros");
				flag =1;
				break;
			default :
				System.out.println("Esta no es una Opcion Correcta");
				break;
			}
		}while (flag == 0);
	}
}




