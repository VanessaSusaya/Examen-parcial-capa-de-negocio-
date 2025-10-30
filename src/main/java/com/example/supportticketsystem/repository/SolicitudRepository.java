package com.example.supportticketsystem.repository;

import com.example.supportticketsystem.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
}
