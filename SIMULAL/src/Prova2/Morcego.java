package Prova2;

public class Morcego extends AnimalAbstract implements Animal {
	
	public Morcego(int idade, double peso, String tamanho, int identificacao) {
		this.id = identificacao;
		this.idade = idade;
		this.peso = peso;
		this.tamanho = tamanho;
	}

	@Override
	public void crescer() {
		this.idade++;
		this.peso += 0.002;
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
		Morcego other = (Morcego) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BAT " + id + " - " + peso + " kg - " + idade + " - " + tamanho;
	}
}
