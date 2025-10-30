package com.example.supportticketsystem.repository;

import com.example.supportticketsystem.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
}
