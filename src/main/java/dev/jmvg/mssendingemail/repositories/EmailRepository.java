package dev.jmvg.mssendingemail.repositories;

import dev.jmvg.mssendingemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
