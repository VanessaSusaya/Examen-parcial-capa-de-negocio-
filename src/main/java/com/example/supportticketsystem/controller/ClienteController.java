package com.example.supportticketsystem.controller;

import com.example.supportticketsystem.model.Cliente;
import com.example.supportticketsystem.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    @PostMapping
    public Cliente crear(@Valid @RequestBody Cliente cliente) {
        return service.guardar(cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
    
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Solicitud> solicitudes;
}
