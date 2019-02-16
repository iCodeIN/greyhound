package greyhound;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		   
	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
	      System.out.println(helloWorld.hello());
	      
	}

}
