package com.example.supportticketsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> manejarRecursoNoEncontrado(ResourceNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Map.of(
                        "error", ex.getMessage(),
                        "fecha", LocalDateTime.now(),
                        "codigo", 404
                ));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> manejarGeneral(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Map.of(
                        "error", "Error interno del servidor",
                        "detalle", ex.getMessage(),
                        "fecha", LocalDateTime.now()
                ));
    }
}
