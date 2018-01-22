package com.jk;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ClientDao {
	protected String serviceUrl;
	
	@Autowired
	RestTemplate restTemplate;
	
	public void setServiceUrl(String serviceUrl){
		this.serviceUrl = serviceUrl;
	}

	public List<?> getFullList(String serviceName) {
		List<?> list = null;
		if(serviceName.equalsIgnoreCase("employee")){
			Employee[] array = restTemplate.getForObject("http://"+serviceUrl+"/employee/getFullList", Employee[].class);
			list = Arrays.asList(array);
		}
		else if(serviceName.equalsIgnoreCase("student")){
			Student[] array = restTemplate.getForObject(serviceUrl+"/student/getFullList", Student[].class);
			list = Arrays.asList(array);
		}
		return list;
	}
}
