package com.example.supportticketsystem.repository;

import com.example.supportticketsystem.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
