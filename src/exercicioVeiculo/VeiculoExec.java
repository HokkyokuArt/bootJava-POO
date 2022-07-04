package exercicioVeiculo;

import java.util.Scanner;

public class VeiculoExec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite o nome do veiculo: ");
		String nome = sc.nextLine();
		System.out.println("\nDigite a capacidade do tanque: ");
		double capacidade= sc.nextDouble();
		System.out.println("\nDigite a quantidade de passageiros: ");
		int passageiros = sc.nextInt();
		System.out.println("\nDigite o consumo (km/litro): ");
		double consumo = sc.nextDouble();
		System.out.println("\nDigite quantos quilometros terá essa viagem: ");
		double km = sc.nextDouble();
		System.out.println("\nQuanto está o preço do combustivel: ");
		double combustivel = sc.nextDouble();
		
		System.out.println("\n");
		
		Veiculo carro1 = new Veiculo(nome, capacidade, passageiros, consumo);
		System.out.print(carro1.toString());
		System.out.printf("\nPara essa viagem, irá precisar de %.1f tanque(s);"
		+ "\nCada passageiro contribuirá com R$ %.2f.", carro1.tanqueViagem(km), 
		carro1.dividirDespesas(km, combustivel));
	
		sc.close();
	}

// ===========> A forma como eu havia feito antes do checkpoint <===========
// OBS: Eu não tinha feito o construtor da classe, então decidi refazer de
// acordo com o código do professor. Mas deixei ai pra ver a diferença...

/*
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
*/

}
