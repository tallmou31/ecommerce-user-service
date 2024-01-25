package sn.esmt.mp2isi.ecommerce.userservice.config;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Userservice.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link tech.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
@Getter
@Setter
public class ApplicationProperties {

    // jhipster-needle-application-properties-property
    // jhipster-needle-application-properties-property-getter
    // jhipster-needle-application-properties-property-class

    private List<User> admins = new ArrayList<>();

    // getters and setters

    @Getter
    @Setter
    public static class User {

        private String username;
        private String email;
        private String firstName;
        private String lastName;
        // getters and setters

    }
}
