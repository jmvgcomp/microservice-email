package dev.jmvg.mssendingemail.repositories;

import dev.jmvg.mssendingemail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
