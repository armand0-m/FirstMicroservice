package com.tcs.firstMicro.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.firstMicro.model.ModelData;

@RestController
@RequestMapping(path="/rest/dataJR")
public class RestData {
	@GetMapping(path="/obtenDatos",produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ModelData getData(@RequestParam(name="msg")String message) {
		ModelData response = new ModelData();
		if(message.equals("JR")) {
			response.setCode(200); 
			response.setStatus(true);
			response.setMensaje("Mensaje recibido ..."+message);
		}else {
			response.setCode(100); 
			response.setStatus(false);
			response.setMensaje("Mensaje no recibido ..."+message);
		}
		
		return response;
	}
}
