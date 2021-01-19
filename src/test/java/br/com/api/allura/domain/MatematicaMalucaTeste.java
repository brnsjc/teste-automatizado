package br.com.api.allura.domain;


import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class MatematicaMalucaTeste {
	
	private MatematicaMaluca matematicaMaluca = new MatematicaMaluca();

	@Test
	public void testarValoresAcimaDeTrinta() {
		
		int maiorTrinta = 30;
		
		assertEquals(maiorTrinta * 4, matematicaMaluca.contaMaluca(maiorTrinta), 1);
		
	}
	
	@Test
	public void testarValoresAcimaDeDez() {
		
		int maiorDez = 15;
		
		assertEquals(maiorDez * 3, matematicaMaluca.contaMaluca(maiorDez), 1);
		
	}
	
	@Test
	public void testarValoresMenorDeDez() {
		
		int maiorDez = 5;
		
		assertEquals(maiorDez * 2, matematicaMaluca.contaMaluca(maiorDez), 1);
		
	}
}
