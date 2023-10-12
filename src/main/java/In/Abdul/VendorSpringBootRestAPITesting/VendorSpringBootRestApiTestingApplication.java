package In.Abdul.VendorSpringBootRestAPITesting;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "vendor Rest API Development", version = "1.0.0", description = "Abdul Developed vendor Rest API", termsOfService = "All Rights are Reserved....", contact = @Contact(name = "Abdul", email = "abdulrehaman627@gmail.com"), license = @License(name = "License", url = "www.abdulrehaman.com")))

public class VendorSpringBootRestApiTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorSpringBootRestApiTestingApplication.class, args);
	}

}
