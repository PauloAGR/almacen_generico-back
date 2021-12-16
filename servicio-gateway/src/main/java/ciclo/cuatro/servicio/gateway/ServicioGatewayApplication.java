package ciclo.cuatro.servicio.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
@EnableEurekaClient
public class ServicioGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioGatewayApplication.class, args);
	}

}
