package com.example.supportticketsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupportTicketSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupportTicketSystemApplication.class, args);
        System.out.println("Aplicación Support Ticket System iniciada correctamente en http://localhost:8080");
        System.out.println("Endpoints disponibles:");
        System.out.println("   GET  /api/solicitudes");
        System.out.println("   POST /api/solicitudes");
        System.out.println("   GET  /api/solicitudes/{id}");
        System.out.println("   PUT  /api/solicitudes/{id}");
        System.out.println("   DELETE /api/solicitudes/{id}");
    }
}
