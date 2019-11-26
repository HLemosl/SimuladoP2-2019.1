package Prova2;

public class Elefante extends AnimalAbstract implements Animal {

	public Elefante(int idade, double peso, String tamanho, int identificacao) {
		this.id = identificacao;
		this.idade = idade;
		this.peso = peso;
		this.tamanho = tamanho;
	}

	private void aumentaPeso() {
		if (this.idade <= 20) {
			this.peso += 250.0;
		} else if (this.idade > 20) {
			this.peso += 0.0;
		}
	}
	
	@Override
	public void crescer() {
		this.idade++;
		aumentaPeso();
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
		Elefante other = (Elefante) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FANTE " + id + " - " + peso + " kg - " + idade + " - " + tamanho;
	}
}
