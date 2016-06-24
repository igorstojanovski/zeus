package org.programirame.config;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Configuration
@Profile("prod")
public class ProdDbMigrationStrategy implements FlywayMigrationStrategy {
    @Override
    public void migrate(Flyway flyway) {
        System.out.println("========++>>>>>>>>>>>>>>");
        flyway.setBaselineOnMigrate(true);
        flyway.clean();
        flyway.migrate();
    }
}
