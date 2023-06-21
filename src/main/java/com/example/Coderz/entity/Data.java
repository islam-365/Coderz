package com.example.Coderz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Table(name = "data")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Data {
  
  @Id
  @Column(name = "id")
  private int id;

  @Column(name = "name", nullable = false)
  @NonNull
  private String name;


}
