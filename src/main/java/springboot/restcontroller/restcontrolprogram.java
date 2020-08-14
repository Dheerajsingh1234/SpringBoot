package springboot.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restcontrolprogram {
	@RequestMapping("hello")
	public String method()
	{
		System.out.println("hii its me");
		return "hii its me    me";
	}

	
}
