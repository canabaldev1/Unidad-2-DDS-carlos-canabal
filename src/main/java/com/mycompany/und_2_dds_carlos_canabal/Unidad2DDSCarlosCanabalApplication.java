package com.mycompany.und_2_dds_carlos_canabal;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.ConfigurableApplicationContext;
import infraestructure.adapter.in.swing.JFrameVentanaPrincipal;
import org.springframework.boot.builder.SpringApplicationBuilder;

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
        //SpringApplication.run(Unidad2DDSCarlosCanabalApplication.class, args);

        // Inicia el contexto de Spring Boot
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Unidad2DDSCarlosCanabalApplication.class)
                .headless(false)
                .run(args);

        System.out.println("Aplicación Spring Boot iniciada correctamente\n.");

        JFrameVentanaPrincipal ventanaPrincipal = context.getBean(JFrameVentanaPrincipal.class);

        ventanaPrincipal.setVisible(true);
    }
}
