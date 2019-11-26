package Prova2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimulalController {

	private int proximocodigo = 1;
	private Map<Integer, Animal> animais;
	
	public SimulalController() {
		animais = new HashMap<>();
	}
	
    public int cadastrarCachorroFilhote() {
    	int identificacao = proximocodigo;
    	proximocodigo ++;
    	Cachorro cachorro = new Cachorro(0, 0.4, "P", identificacao);
    	animais.put(identificacao, cachorro);
    	return identificacao;
    }
    
    public int cadastrarElefanteFilhote(int idade, int peso, int tamanho) {
    	int identificacao = proximocodigo;
    	proximocodigo ++;
    	Elefante elefante = new Elefante(0, 120.0, "G", identificacao);
    	animais.put(identificacao, elefante);
    	return identificacao;
    }
    
    public int cadastrarMorcegoFilhote(int idade, int peso, int tamanho) {
    	int identificacao = proximocodigo;
    	proximocodigo ++;
    	Morcego morcego = new Morcego(0, 0.002, "P", identificacao);
    	animais.put(identificacao, morcego);
    	return identificacao;
    }
    
    public String exibirAnimal(int id) {
    	if (!animais.containsKey(id)) {
			throw new RuntimeException("ID invalido, animal não existe.");
		}
    	return animais.get(id).toString();
    }
    
    public void crescer(int id) {
    	if (!animais.containsKey(id)) {
			throw new RuntimeException("ID invalido, animal não existe.");
		}
    	animais.get(id).crescer();
    }
    
    public void configurarRemocao(String estrategia) {
    	List<Animal> listaRemocao = new ArrayList<>();
    	if ("PESO".equals(estrategia)) {
    		
		} else if ("IDADE".equals(estrategia)) {
			
		}
    	Collections.sort(listaRemocao);
    }
    
    public int remover() {
    	int codigo = animais.get(animais.size() - 1).getId();
    	animais.remove(animais.size() - 1);
    	return codigo;
    }
}
