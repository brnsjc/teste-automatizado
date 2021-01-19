package br.com.api.allura.domain;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TesteAvaliador {
	
	private static Leilao leilao = new Leilao();
	private static List<Lance> lances = new ArrayList<Lance>();

	@Test
	public void testarMenorLanceDoLeilao() {
		
		Usuario joao = new Usuario(1, "Joao");
		Usuario jose = new Usuario(2, "Jose");
		Usuario maria = new Usuario(3,"Maria");
		
		lances = new ArrayList<Lance>();
		
		Lance lance = new Lance(joao, 29.00);
		Lance lance1 = new Lance(jose, 20.00);
		Lance lance2 = new Lance(maria, 22.00);
		
		lances.add(lance);
		lances.add(lance1);
		lances.add(lance2);
		
		leilao.setLances(lances);
		
		Avaliador avaliador = new Avaliador();
		
		avaliador.avaliar(leilao);
		
		System.out.println(avaliador.getMaiorLance());
		System.out.println(avaliador.getMenorLance());
		System.out.println(avaliador.getMedia());
		
		assertEquals(20, avaliador.getMenorLance(), 0000.1);
		assertEquals(29, avaliador.getMaiorLance(), 0000.1);
		assertEquals(23, avaliador.getMedia(), 0.7);
	}
	
	@Test
	public void testarLanceUnico() {
		
		Avaliador avaliador = new Avaliador();
		lances = new ArrayList<Lance>();
		
		Usuario joao = new Usuario(1, "Joao");
		
		Lance lance = new Lance(joao, 29.00);
		
		lances.add(lance);

		leilao.setLances(lances);
		
		
		
		avaliador.avaliar(leilao);
		
		assertEquals(29, avaliador.getMenorLance(), 0000.1);
		assertEquals(29, avaliador.getMaiorLance(), 0000.1);
	}
	
	@Test
	public void testarMaioresValores() {
		
		Usuario joao = new Usuario(1, "Joao");
		Usuario jose = new Usuario(2, "Jose");
		Usuario maria = new Usuario(3,"Maria");
		
		
		Lance lance = new Lance(joao, 29.00);
		Lance lance1 = new Lance(jose, 20.00);
		Lance lance2 = new Lance(maria, 22.00);
		
		lances.add(lance);
		lances.add(lance1);
		lances.add(lance2);
		
		leilao.setLances(lances);
		
		Avaliador avaliador = new Avaliador();
		
		avaliador.avaliar(leilao);
		assertEquals(29.00, leilao.getLances().get(0).getValor(), 0.1);
		
		
	}

}
