package Prova2;

public abstract class AnimalAbstract implements Animal{

	protected int id;
	protected int idade;
	protected double peso;
	protected String tamanho;
	
	public int compareToIdade(AnimalAbstract a2) {
		return this.idade - a2.idade;
	}
	
	public double compareToPeso(AnimalAbstract a2) {
		return this.peso - a2.peso;
	}
	
}
