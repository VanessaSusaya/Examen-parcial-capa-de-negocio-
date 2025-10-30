package com.example.supportticketsystem.controller;

import com.example.supportticketsystem.model.Solicitud;
import com.example.supportticketsystem.service.SolicitudService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudController {
    private final SolicitudService service;

    public SolicitudController(SolicitudService service) {
        this.service = service;
    }

    @GetMapping
    public List<Solicitud> listar() {
        return service.listar();
    }

    @PostMapping
    public Solicitud crear(@Valid @RequestBody Solicitud solicitud) {
        return service.guardar(solicitud);
    }

    @PutMapping("/{id}")
    public Solicitud actualizar(@PathVariable Long id, @RequestBody Solicitud solicitud) {
        return service.actualizar(id, solicitud);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
