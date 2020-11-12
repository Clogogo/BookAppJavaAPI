package com.example.project.euas.model.booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "booking")
public class Booking {
  private @Id @GeneratedValue Long id;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long hotelId;

  private int bedroomNum;

  private Long flightId;
}
