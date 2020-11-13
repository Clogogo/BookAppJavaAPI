package com.example.project.euas.model.role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Table(name = "roles")
@Entity
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private EnumRole name;

  public Role() {}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public EnumRole getName() {
    return name;
  }

  public void setName(EnumRole name) {
    this.name = name;
  }
}
