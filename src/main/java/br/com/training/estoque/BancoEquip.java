package br.com.training.estoque;

import java.util.ArrayList;
import java.util.List;

public class BancoEquip {
	
	private static List<Equipamentos> lista = new ArrayList<Equipamentos>(); 
	private static Integer chaveSequencial = 1; 
	
	static {
		Equipamentos equip1 = new Equipamentos(); 
		
		equip1.setIdentificador(chaveSequencial++); 
		equip1.setNomeEquip("Mouse");
		
		Equipamentos equip2 = new Equipamentos();
		equip2.setIdentificador(chaveSequencial++); 
		equip2.setNomeEquip("Teclado");
		
		lista.add(equip1);
		lista.add(equip2); 
		
	}
	
	public List<Equipamentos> getEquipamentos(){
		return BancoEquip.lista; 
	}
}
