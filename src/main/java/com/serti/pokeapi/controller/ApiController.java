package com.serti.pokeapi.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.serti.pokeapi.mdl.AccessLog;
import com.serti.pokeapi.mdl.Pokemons;
import com.serti.pokeapi.mdl.Species;
import com.serti.pokeapi.service.AccesLogService;
import com.serti.pokeapi.service.PokemonsService;
import com.serti.pokeapi.service.RequestService;
import com.serti.pokeapi.service.SpecieService;
import com.serti.pokeapi.util.HttpClient;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class ApiController {
	@Autowired
    private RequestService requestService;
	@Autowired
    private AccesLogService accesLogService;
	@Autowired
    private PokemonsService pokemosService;
	@Autowired
    private SpecieService specieService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);
	HttpClient  client = new HttpClient();
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/pokemon")
    public String findAll(HttpServletRequest request) {
		AccessLog accesParam = new AccessLog();
		String urlAll ="https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0"; 
		String response = client.get(urlAll);
		String clientIp = requestService.getClientIp(request);
		accesParam.setClient(clientIp);
		accesParam.setResource("/pokemon/evolution-chain");
		accesLogService.saveAccesLog(accesParam);
		LOGGER.info("Ip del cliente: {}",clientIp);
        return response;
    }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/pokemon/evolution-chain")
    public ResponseEntity<String> gatEvolutionChain(@RequestParam(value = "id") String id, HttpServletRequest request) {
		 LOGGER.error("Inicia gatEvolutionChain () param: {}", id);

			AccessLog accesParam = new AccessLog();
			String urlChain =String.format("https://pokeapi.co/api/v2/evolution-chain/%s/",id);
			String response = client.get(urlChain);
			LOGGER.info("Url request: {}",urlChain);
			LOGGER.info("Response: {}",response);
			String clientIp = requestService.getClientIp(request);
			accesParam.setClient(clientIp);
			accesParam.setResource("/pokemon/evolution-chain");
			accesLogService.saveAccesLog(accesParam);
			LOGGER.info("Ip del cliente: {}",clientIp);
			ResponseEntity<String> response1 = ResponseEntity.ok(response);
			return response1;
    }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/pokemon/get-sprite")
    public String getSprite(@RequestParam(value = "pokemon") String pokemon, HttpServletRequest request) {
		AccessLog accesParam = new AccessLog();
		String urlPokemon =String.format("https://pokeapi.co/api/v2/pokemon/%s/",pokemon);
		String response = client.get(urlPokemon);
		String clientIp = requestService.getClientIp(request);
		accesParam.setClient(clientIp);
		accesParam.setResource("/pokemon/get-sprite");
		accesLogService.saveAccesLog(accesParam);
		LOGGER.info("Ip del cliente: {}",clientIp);
        return response;
    }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/pokemon/save-pokemon")
    public ResponseEntity<?>  savePokemon(@RequestBody Pokemons pokemon, HttpServletRequest request) {
		LOGGER.info("Inicia savePokemon(): param{}",pokemon.toString());
		AccessLog accesParam = new AccessLog();
		String clientIp = requestService.getClientIp(request);
		accesParam.setClient(clientIp);
		accesParam.setResource("/pokemon/save-pokemon");
		try {
			accesLogService.saveAccesLog(accesParam);
			pokemosService.savePokemon(pokemon);
			LOGGER.info("Ip del cliente: {}",clientIp);
		} catch (Exception e) {
			LOGGER.info("Excepcion al guardar pokemo: {}",e.getLocalizedMessage());
			return new ResponseEntity<String>(e.getLocalizedMessage(), HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<String>("Pokemon registred", HttpStatus.OK);
    }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/pokemon/save-species")
    public ResponseEntity<?>  saveSpecie(@RequestBody Species specie, HttpServletRequest request) {
		LOGGER.info("Inicia saveSpecie(): param{}",specie.toString());
		AccessLog accesParam = new AccessLog();
		String clientIp = requestService.getClientIp(request);
		accesParam.setClient(clientIp);
		accesParam.setResource("/pokemon/save-species");
		try {
			accesLogService.saveAccesLog(accesParam);
			specieService.saveSpecie(specie);
			LOGGER.info("Ip del cliente: {}",clientIp);
		} catch (Exception e) {
			LOGGER.info("Excepcion al guardar pokemo: {}",e.getLocalizedMessage());
			return new ResponseEntity<String>(e.getLocalizedMessage(), HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<String>("Pokemon registred", HttpStatus.OK);
    }
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/pokemon/save-species-1")
    public ResponseEntity<?>  savePokemon(@RequestBody String idspecie, HttpServletRequest request) {
		String urlgetSpecie =String.format("https://pokeapi.co/api/v2/evolution-chain/%s/",idspecie);
		AccessLog accesParam = new AccessLog();
		String clientIp = requestService.getClientIp(request);
		String response = client.get(urlgetSpecie);
		accesParam.setClient(clientIp);
		accesParam.setResource("/pokemon/get-species");
		try {
			accesLogService.saveAccesLog(accesParam);
			LOGGER.info("Ip del cliente: {}",clientIp);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getLocalizedMessage(), HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<String>("Specie registred", HttpStatus.OK);
    }
	
	
}
