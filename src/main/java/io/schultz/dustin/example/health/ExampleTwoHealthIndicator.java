package io.schultz.dustin.example.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ExampleTwoHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // do something to check health

        // inspect the return

        // unhealthy
        return Health.down().build();
    }
}
