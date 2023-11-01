package br.com.spring.cotacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class Controller {

	@GetMapping("/compra")
	public String obterCotacaoCompraDolarReal() {
		return obterCotacaoPorTipo("bid");
	}

	@GetMapping("/venda")
	public String obterCotacaoVendaDolarReal() {
		return obterCotacaoPorTipo("ask");
	}

	@GetMapping("/min")
	public String obterCotacaoMinimoDolarReal() {
		return obterCotacaoPorTipo("low");
	}

	@GetMapping("/max")
	public String obterCotacaoMaximoDolarReal() {
		return obterCotacaoPorTipo("high");
	}

	@GetMapping("/all")
	public String obterCotacaoCompletoDolarReal() {
		return obterCotacaoPorTipo("all");
	}

	private String obterCotacaoPorTipo(String tipo) {
		
		RestTemplate restTemplate = new RestTemplate();
		String url ="https://economia.awesomeapi.com.br/json/last/USD-BRL";
		
		try {
			String resposta = restTemplate.getForObject(url,String.class);
			
			try {
				if (tipo.equals("all")) {
					return resposta;
				} else {
					ObjectMapper objectMapper = new ObjectMapper();
					
					JsonNode rootNode = objectMapper.readTree(resposta);
					
					JsonNode campoNode = rootNode.get("USDBRL").get(tipo);
					
					return campoNode.asText();
				}
			} catch(Exception e) {
				e.printStackTrace();
				return "Erro ao obter a cotacao"+e.getMessage();
			}
		} catch(Exception e) {
			e.printStackTrace();
			return "Erro ao obter a cotacao"+e.getMessage();
		}
	}
}
