package com.systemdesign.URLFeederService.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "urls")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class URL {

   @Id
   String id;
   String url;

   @Column(name = "created_at")
   Time createdAt;
}
