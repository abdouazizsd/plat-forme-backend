package sn.aziz.platformebackend.entities.audit;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

import static jakarta.persistence.TemporalType.TIMESTAMP;


@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable<T> {

    @CreatedBy
    @Column(name="created_by", updatable = false)
    protected T createdBy;

    @CreatedDate
    @Temporal(TIMESTAMP)
    @Column(name="created_date", updatable = false)
    protected Date createdDate;

    @LastModifiedBy
    @Column(name="modified_by")
    protected T lastModifiedBy;

    @LastModifiedDate
    @Column(name="modified_date")
    protected Date lastModifiedDate;
}
