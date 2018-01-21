package projectforsweet.hello;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@SpringBootApplication
@ComponentScan(basePackages = "<basepackage>")
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi(){
		
		return "Hi";
		
	}

}
