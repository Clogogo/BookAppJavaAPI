package com.example.project.euas.model.booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "booking")
public class Client {

  private @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) Long id;
  private String name;
  private int age;
  private String gender;

  @ManyToOne private Booking booking;
}
