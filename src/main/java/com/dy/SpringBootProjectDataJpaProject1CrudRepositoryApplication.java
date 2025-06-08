package com.dy;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.dy.entity.CornonaVaccine;
import com.dy.service.ICoronaVaccineService;

@SpringBootApplication
public class SpringBootProjectDataJpaProject1CrudRepositoryApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx = SpringApplication.run(SpringBootProjectDataJpaProject1CrudRepositoryApplication.class, args);
	
//		ICoronaVaccineService service = ctx.getBean("CoronaVaccineServiceImp",ICoronaVaccineService.class);
//		
//		
//		try {
//			CornonaVaccine vaccine = new CornonaVaccine(null,"Covaxin6","Bharat-BioTech2","India",40.0,2);
//			
//			List<CornonaVaccine> vaccine = Arrays.asList(
//		            new CornonaVaccine(null, "Covaxin", "Bharat-BioTech", "India", 50.0, 2),
//		            new CornonaVaccine(null, "Covishield", "Serum Institute", "India", 45.0, 2),
//		            new CornonaVaccine(null, "Pfizer", "Pfizer Inc.", "USA", 100.0, 2),
//		            new CornonaVaccine(null, "Sputnik", "Gamaleya Research Institute", "Russia", 70.0, 1)
//		        
//			
//			System.out.println(service.registerVaccine(vaccine));
//			
//		} catch (DataAccessException dae) {
//			// TODO: handle exception
//		}
//		catch (Exception e) {
//	 e.printStackTrace();
//		}
//		((ConfigurableApplicationContext) ctx).close();
	
	}
}
