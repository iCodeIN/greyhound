package greyhound;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import greyhound.client.GreyHoundClientImpl;
import greyhound.configuration.ApplicationConfiguration;
import greyhound.model.DriverAssignment;
import greyhound.service.GreyhoundServiceImpl;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		GreyhoundServiceImpl greyhoundService = ctx.getBean(GreyhoundServiceImpl.class);
		
		greyhoundService.process();

	}

}


/*{"oper_nbr":69,"carrier_cd":"GLX ","last_name":"GARCIA","first_name":"ABEL"
 * ,"middle_init":null,"home_loc_6":910327,"home_loc_3":"NLX","oper_class":"T"}
 */