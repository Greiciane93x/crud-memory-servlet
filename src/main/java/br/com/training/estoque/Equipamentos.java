package br.com.training.estoque;

import java.util.Date;

public class Equipamentos {
	
	private Integer identificador; 
	private String nomeEquip; 
	private Date dataRegistroEquip = new Date();
	
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public String getNomeEquip() {
		return nomeEquip;
	}
	public void setNomeEquip(String nomeEquip) {
		this.nomeEquip = nomeEquip;
	}
	public Date getDataRegistroEquip() {
		return dataRegistroEquip;
	}
	public void setDataRegistroEquip(Date dataRegistroEquip) {
		this.dataRegistroEquip = dataRegistroEquip;
	} 
	
	
	
	
	

}
