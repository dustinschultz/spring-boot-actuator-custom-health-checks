package io.schultz.dustin.example.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ExampleOneHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // do something to check health

        // inspect the return

        // healthy
        return Health.up().build();
    }
}
