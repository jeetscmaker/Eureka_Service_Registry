package com.jk;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	@Autowired
	ClientDao clientDao;

	public List<?> getFullList(String serviceName) {
		List<?> list = null;
		if(serviceName.equalsIgnoreCase("employee")){
			clientDao.setServiceUrl(DiscoveryServerApplication.EMPLOYEE_SERVICE);
			list = clientDao.getFullList(serviceName);
			
		}else if(serviceName.equalsIgnoreCase("student")){
			clientDao.setServiceUrl(DiscoveryServerApplication.STUDENT_SERVICE);
			list = clientDao.getFullList(serviceName);
		}
		return list;
	}
}
