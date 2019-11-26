package Prova2;

public class Cachorro extends AnimalAbstract implements Animal{
	
	public Cachorro(int idade, double peso, String tamanho, int identificacao) {
		this.id = identificacao;
		this.idade = idade;
		this.peso = peso;
		this.tamanho = tamanho;
	}
	
	@Override
	public void crescer() {
		this.idade ++;
		this.peso += 0.7;
		if (this.peso > 10.0) {
			this.tamanho = "M";
		}
	}
	
	public int getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cachorro other = (Cachorro) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CAO " + id + " - " + peso + " kg - " + idade + " - " + tamanho;
	}
}
