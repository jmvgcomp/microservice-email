package dev.jmvg.mssendingemail.models;


import dev.jmvg.mssendingemail.enums.StatusEmail;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;

//@Data para JPA não recomendado por perda severa de performance
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmailModel that = (EmailModel) o;
        return Objects.equals(emailId, that.emailId);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
