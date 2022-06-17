package exercicioVeiculo;

import java.util.Scanner;


public class VeiculoExec {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Veiculo carro1 = new Veiculo();
		Veiculo carro2 = new Veiculo();
		
		entrada(carro1);
		entrada(carro2);	
		
		System.out.println("\nDigite quantos quilometros terá essa viagem: ");
		double km = sc.nextDouble();
		
		System.out.println("\nQuanto está o preço do combustivel: ");
		double combustivel = sc.nextDouble();
		
		System.out.println(carro1.toString(km, combustivel));
		System.out.println(carro2.toString(km, combustivel));
		
		sc.close();
	
	}
		
	public static void entrada (Veiculo prop) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do veiculo: ");
		prop.setNome(sc.nextLine());
		System.out.println("\nDigite a capacidade do tanque: ");
		prop.setCapacidade(sc.nextDouble());
		System.out.println("\nDigite a quantidade de passageiros: ");
		prop.setPassageiros(sc.nextInt());
		System.out.println("\nDigite o consumo (km/litro): ");
		prop.setConsumo(sc.nextDouble());
		System.out.println("\n");
				
		
	}

}
