package com.mycompany.und_2_dds_carlos_canabal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
        "application",
        "domain",
        "infraestructure.adapter.in",
        "infraestructure.adapter.out",
        "com.mycompany.und_2_dds_carlos_canabal"
})
@EntityScan(basePackages = {"infraestructure.adapter.out.repositories"})
@EnableJpaRepositories(basePackages = {"infraestructure.adapter.out.repositories"})
public class Unidad2DDSCarlosCanabalApplication {

    public static void main(String[] args) {
        SpringApplication.run(Unidad2DDSCarlosCanabalApplication.class, args);
        System.out.println("Aplicación Spring Boot iniciada correctamente.");
    }
}
