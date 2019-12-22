package io.schultz.dustin.example.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ExampleThreeHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        // do something to check health

        // inspect the return

        // unhealthy with details
        return Health.down()
                .withDetail("reason", "details about why it failed")
                .build();
    }
}