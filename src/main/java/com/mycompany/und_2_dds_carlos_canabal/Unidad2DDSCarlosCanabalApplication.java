package com.mycompany.und_2_dds_carlos_canabal;

import domain.model.curso.Curso;
import domain.valueobjects.curso.Aula;
import domain.valueobjects.profesor.ProfesorId;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.ConfigurableApplicationContext;
import application.port.in.RegistrarCursoUseCase;
import infraestructure.adapter.in.swing.JFrameVentanaPrincipal;

import java.time.LocalDate;
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

        //prueba de post para crear un curso nuevo
/*      
        System.out.println("Implementación de la interfaz RegistrarCursoUseCase: ");

        RegistrarCursoUseCase registrarCurso = context.getBean(RegistrarCursoUseCase.class);

        try {
            Curso curso = registrarCurso.registrarCurso(
                    "esternocleidomastoideo",
                    30,
                    LocalDate.of(2024, 9, 1),
                    LocalDate.of(2025, 6, 30),
                    new Aula("Aula 101", "planta 2b", "Edificio Central",
                            "laboratorio de redes", 23),
                    new ProfesorId("prof-12345")
            );
            System.out.println("Curso registrado exitosamente: ");
        } catch (Exception e) {
            System.out.println("Error al registrar el curso: " + e.getMessage());
        }

        context.close();*/
    }
}
