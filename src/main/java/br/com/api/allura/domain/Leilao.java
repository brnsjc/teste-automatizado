package br.com.api.allura.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leilao {
	
	private String descricao;
	private List<Lance> lances;

}
