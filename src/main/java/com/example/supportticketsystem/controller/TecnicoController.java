package com.example.supportticketsystem.controller;

import com.example.supportticketsystem.model.Tecnico;
import com.example.supportticketsystem.service.TecnicoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tecnicos")
public class TecnicoController {
    private final TecnicoService service;

    public TecnicoController(TecnicoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tecnico> listar() {
        return service.listar();
    }

    @PostMapping
    public Tecnico crear(@Valid @RequestBody Tecnico tecnico) {
        return service.guardar(tecnico);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
