package com.example.demo.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ModelData;



@RestController
@RequestMapping(path="/rest/dataPATH")

public class RestData {
	
	@GetMapping(path= "/gettingData", produces = MediaType.APPLICATION_JSON_VALUE) //
	
	public @ResponseBody ModelData getData(@RequestBody ModelData response) {
		
		response.getCode();
		response.setStatus(true);
		response.getMatriz();
		response.getId();
		return response;
	}

}
