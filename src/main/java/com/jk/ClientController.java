package com.jk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/ApiGateway")
public class ClientController {
	@Autowired
	ClientService clientService;
	
	@ResponseBody
	@RequestMapping("/{service_name}/getFullList")
	public List<?> getFullList(@PathVariable("service_name") String serviceName){
		System.out.println("Inside ClientController.........");
		List<?> list = clientService.getFullList(serviceName);
		return list;
		
	}
}
