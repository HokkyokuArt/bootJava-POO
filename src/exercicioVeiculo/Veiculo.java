package exercicioVeiculo;

public class Veiculo {
	private String nome;
	private double capacidade;
	private int passageiros;
	private double consumo;
	
//	public Veiculo(double capacidade, int passageiros, double consumo) {
//		this.capacidade = capacidade;
//		this.passageiros = passageiros;
//		this.consumo = consumo;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double tanqueViagem(double km) {
		return km/(capacidade*consumo);
	}
	
	public double custoTotal(double km, double combustivel) {
		return capacidade * tanqueViagem(km) * combustivel;
	}
	
	public double dividirDespesas(double km, double combustivel ) {
		return  capacidade * tanqueViagem(km) * combustivel / passageiros;
	}
	
	public String toString(double km, double combustivel) {
		return "\n\nVeiculo: "+nome
				+ "\nEssa viagem gastará "+ String.format("%.2f", tanqueViagem(km))+ "% do total do tanque."
				+ "\nEssa viagem custará R$ "+ String.format("%.2f", custoTotal(km,combustivel))+"."
				+ "\nCada passageiro pagará R$ "+ String.format("%.2f", dividirDespesas(km,combustivel))+"." ;
	}
}

