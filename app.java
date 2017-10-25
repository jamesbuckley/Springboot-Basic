package simple.spring.java

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloWorld{
	
	@RequestMapping("/")
	public String hello(){
		return "Hello World";
	}
}