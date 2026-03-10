package org.example.springbootdemo.model;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Example: hardcoded user
        return Optional.of("SYSTEM");

        // In real apps:
        // return Optional.of(SecurityContextHolder.getContext()
        //        .getAuthentication().getName());
    }
}

