package com.example.supportticketsystem.service;

import com.example.supportticketsystem.exception.ResourceNotFoundException;
import com.example.supportticketsystem.model.Cliente;
import com.example.supportticketsystem.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.supportticketsystem.model.Solicitud; // ✅ AGREGA ESTA LÍNEA

@Service
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente guardar(Cliente c) {
        return repository.save(c);
    }

    public Cliente obtener(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cliente no encontrado con id " + id));
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }

    public List<Solicitud> listarSolicitudes(Long clienteId) {
    Cliente cliente = obtener(clienteId);
    return cliente.getSolicitudes();
    }

}
