package com.example.supportticketsystem.service;

import com.example.supportticketsystem.exception.ResourceNotFoundException;
import com.example.supportticketsystem.model.Tecnico;
import com.example.supportticketsystem.repository.TecnicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TecnicoService {
    private final TecnicoRepository repository;

    public TecnicoService(TecnicoRepository repository) {
        this.repository = repository;
    }

    public List<Tecnico> listar() {
        return repository.findAll();
    }

    public Tecnico guardar(Tecnico t) {
        return repository.save(t);
    }

    public Tecnico obtener(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Técnico no encontrado con id " + id));
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
