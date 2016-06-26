package org.programirame.config;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevDbMigrationStrategy implements FlywayMigrationStrategy {
    @Override
    public void migrate(Flyway flyway) {
        System.out.println("DEV Migration");
        flyway.setBaselineOnMigrate(true);
        flyway.migrate();
    }
}
