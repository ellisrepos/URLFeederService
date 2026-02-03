
package com.systemdesign.URLFeederService.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "url")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class URL {

   @Id
   String id;

   String url;

   @CreatedDate
   @Column(name = "created_at", nullable = false, updatable = false)
   LocalDateTime createdAt;

}
