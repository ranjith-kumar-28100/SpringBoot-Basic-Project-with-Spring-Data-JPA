package inc.codeman.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import inc.codeman.springboot.dao.Dao;

@Component
public class Service {

	Dao dao;
	
	@Autowired
	public Service(Dao dao) {
		System.out.println("Service Bean Created");
		this.dao=dao;
	}
	
	public void save() {		
		dao.create();
	}
}
