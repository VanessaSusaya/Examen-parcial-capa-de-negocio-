package com.example.supportticketsystem.service;

import com.example.supportticketsystem.exception.ResourceNotFoundException;
import com.example.supportticketsystem.model.Solicitud;
import com.example.supportticketsystem.repository.SolicitudRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SolicitudService {
    private final SolicitudRepository repository;

    public SolicitudService(SolicitudRepository repository) {
        this.repository = repository;
    }

    public List<Solicitud> listar() {
        return repository.findAll();
    }

    public Solicitud guardar(Solicitud s) {
        return repository.save(s);
    }

    public Solicitud actualizar(Long id, Solicitud datos) {
        Solicitud s = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Solicitud no encontrada con id " + id));
        s.setDescripcion(datos.getDescripcion());
        s.setEstado(datos.getEstado());
        s.setCliente(datos.getCliente());
        s.setTecnico(datos.getTecnico());
        return repository.save(s);
    }

        public void eliminar(Long id) {
            repository.deleteById(id);
        }
    }
