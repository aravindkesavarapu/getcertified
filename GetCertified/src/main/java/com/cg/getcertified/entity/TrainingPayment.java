package com.cg.getcertified.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "training_payment")
public class TrainingPayment {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String courseName;
	
	@Column(nullable = false)
	private Date fromDate;
	
	@Column(nullable = false)
	private Date toDate;
	
	@Column(nullable = false)
	private int slotLength;
	
	@Column(nullable = false)
	private long cardNumber;
	
	@Column(nullable = false)
	private int expiryMonth;
	
	@Column(nullable = false)
	private int expiryYear;
	
	@Column(nullable = false)
	private int cvv;
	
}
