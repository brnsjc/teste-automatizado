package br.com.api.allura.domain;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Data;

@Data
public class Avaliador {

	private double maiorLance = Double.NEGATIVE_INFINITY;
	private double menorLance = Double.POSITIVE_INFINITY;
	private double media;
	private List<Lance> maiores;

	public void avaliar(Leilao leilao) {
		
		maiores = leilao.getLances();
		
		maiores = maiores.stream()
				.sorted(Comparator.comparingDouble(Lance::getValor))
				.collect(Collectors.toList());
		
		for(Lance lance : leilao.getLances()) {
			
			media += lance.getValor();
			if(lance.getValor() > maiorLance) {
				maiorLance = lance.getValor();
			} if(lance.getValor() < menorLance) {
				menorLance = lance.getValor();
			}
			
		}
		
			media = media/leilao.getLances().size();
	}
}
