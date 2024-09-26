package com.serti.pokeapi.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // Verifica si algún servicio está disponible
        boolean isServiceUp = checkExternalService();
        if (isServiceUp) {
            return Health.up().withDetail("External Service", "Available").build();
        } else {
            return Health.down().withDetail("External Service", "Not Available").build();
        }
    }

    private boolean checkExternalService() {
        // Logica para verificar el servicio externo
        return true; 
    }
}